grammar CatrobatScript;

options {language = Java;}

@header {import java.util.HashSet;
         }
@members { 
HashSet<String> variables = new HashSet<String>();

public HashSet<String> getVariables() {
   return variables;}
 }


program: (startScript | whenScript | broadcastScript)* ;
catch[RecognitionException e] { System.out.println("Recognition exception: "); 
                               e.printStackTrace();}

startScript: ('when program started') brickList;
whenScript: ('when' action) brickList;
broadcastScript: ('when I receive' message) brickList;

brickList: brick*;

brick: broadcastBrick | broadcastWaitBrick | 
       changeBrightnessByNBrick | changeGhostEffectByNBrick | 
       changeSizeByNBrick | changeVariableBrick | changeVolumeByNBrick | 
       changeXByNBrick | changeYByNBrick | 
       clearGraficEffectBrick | comeToFrontBrick | 
       foreverBrick | 
       glideToBrick | goNStepsBackBrick | 
       hideBrick | 
       ifLogicBeginBrick | ifLogicElseBrick | ifLogicEndBrick | 
       ifOnEdgeBounceBrick | 
       legoNXTMotorActionBrick | legoNxtMotorStopBrick | 
       legoNxtMotorTurnAngleBrick | legoNxtPlayToneBrick | 
       loopEndBrick | 
       moveNStepsBrick |
       nextLookBrik | noteBrick | 
       placeAtBrick | playSoundBrick | 
       pointInDirectionBrick | pointToBrick | 
       repeatBrick | 
       setBrightnessBrick | setGhostEffectBrick | setLookBrick | 
       setSizeToBrick | setVariableBrick | setVolumeToBrick | 
       setXBrick | setYBrick | 
       showBrick | speakBrick | 
       stopAllSoundsBrick | 
       turnLeftBrick | turnRightBrick | 
       waitBrick;


broadcastBrick: 'broadcast ' message ;
broadcastWaitBrick: 'broadcast and wait' message;

changeBrightnessByNBrick: 'change brightness by' formula '%';
changeGhostEffectByNBrick: 'change ghost effect by' formula '%';
changeSizeByNBrick: 'change size by' formula '%';
changeVariableBrick: 'change variable' userVariable 'by' formula 
                     {variables.add($userVariable.text);};
changeVolumeByNBrick: 'change volume by' formula '%';
changeXByNBrick: 'change X by' formula;
changeYByNBrick: 'change Y by' formula;

clearGraficEffectBrick: 'clear graphic effects';
comeToFrontBrick: 'come to front';

foreverBrick: 'forever';

glideToBrick: 'glide' formula 'seconds to X:' formula ', Y:' formula;
goNStepsBackBrick: 'go back' formula  'layers';

hideBrick: 'hide';

ifLogicBeginBrick: 'if' formula 'is true then';
ifLogicElseBrick: 'else';
ifLogicEndBrick: 'end if';
ifOnEdgeBounceBrick: 'if on edge, bounce';

legoNXTMotorActionBrick: 'NXT move motor' motor + ', speed' formula;
legoNxtMotorStopBrick: 'NXT stop motor' motor;
legoNxtMotorTurnAngleBrick: 'NXT turn motor' motor 'to' formula 'degrees';
legoNxtPlayToneBrick: 'NXT play tone, frequency:' formula ', duration:' formula 'seconds';

loopEndBrick: 'end of loop';

moveNStepsBrick: 'move' formula 'steps';

nextLookBrik: 'next look';
noteBrick: 'note' text;

placeAtBrick: 'place at X:' formula ', Y:' formula;
playSoundBrick: 'start sound' sound;
pointInDirectionBrick: 'point in direction' formula 'degrees';
pointToBrick: 'point to' objectName;

repeatBrick: 'repeat' formula;

setBrightnessBrick: 'set brightness to' formula '%';
setGhostEffectBrick: 'set ghost effect to' formula '%';
setLookBrick: 'switch to look' look;
setSizeToBrick: 'set size to' formula '%';
setVariableBrick: 'set variable' userVariable 'to' formula 
                     {variables.add($userVariable.text);};
setVolumeToBrick: 'set volume to' formula '%';
setXBrick: 'set X to' formula;
setYBrick: 'set Y to' formula;

showBrick: 'show';
speakBrick:'speak' text;
stopAllSoundsBrick: 'stop all sounds'; 
turnLeftBrick: 'turn left' formula 'degrees';
turnRightBrick: 'turn right' formula 'degrees';
waitBrick: 'wait' formula 'seconds';

action: ACTION;
formula: BRACKET_OPEN (token+) BRACKET_CLOSE;

look: USER_VARIABLE;
message: USER_VARIABLE;
motor: USER_VARIABLE; 
objectName: USER_VARIABLE;
sound: USER_VARIABLE;
text: USER_VARIABLE;
userVariable: USER_VARIABLE;

token: NUMBER | OPERATOR | SENSOR | FUNCTION_NAME |
       USER_VARIABLE|
       BRACKET_OPEN | BRACKET_CLOSE | FUNCTION_PARAMETER_DELIMITER;           

USER_VARIABLE: '"' STRING '"';
NUMBER: (DIGIT)+('.' DIGIT+)?;
FUNCTION_NAME: ('sin' | 'cos' | 'tan' | 'ln' | 'log' | 'sqrt' | 'rand' | 'round' | 
           'abs' | 'pi' | 'mod' | 'arcsin' | 'arccos' | 'arctan' | 'exp' | 
           'max' | 'min' | 'TRUE' | 'FALSE');   
OPERATOR: ('AND' | 'OR' | '=' | '!=' | '<=' | '>=' | '<' | '>' | 
          '+' | '-' | '*' | '/' | '%' | '^' | 'NOT');
SENSOR: ('x_acceleration' | 'y_acceleration' | 'z_acceleration' |
         'compass_direction' | 'x_inclination' | 'y_inclination' |
         'object_x' | 'object_y' | 
         'object_ghosteffect' | 'object_brightness' | 'object_size' |
         'object_rotation' | 'object_layer');
BRACKET_OPEN: '(';
BRACKET_CLOSE: ')';
FUNCTION_PARAMETER_DELIMITER: ',';

ACTION: 'Tapped';

fragment STRING: (DIGIT | LETTER | SYMBOL | OPERATOR_SYMBOL | WS)+;
fragment OPERATOR_SYMBOL: '=' | '<' | '>' |'+' | '-' | '*' | '/' | '%' | '^';
fragment ADDITIONAL_SYMBOL: '"';
fragment SYMBOL: ('!' | '@' | '#' | '$' | '_' | '\'' | ';' | '~' |
                  '[' | ']' | '{' | '}' | ':' | ',' | '(' | ')' | '\'');
fragment DIGIT: ('0'..'9');
fragment LETTER: ('a'..'z') | ('A'..'Z');
fragment WS : ('\t' | '\r'? '\n' | ' ') {skip();} ;

