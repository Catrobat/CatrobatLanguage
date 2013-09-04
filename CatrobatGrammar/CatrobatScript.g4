grammar CatrobatScript;

options {language = Java;}

@header {
          import java.util.Set;
          import java.util.HashSet;
          import java.util.List;
          import java.util.ArrayList;
          
          import org.catrobat.catroid.formulaeditor.*;
          import org.catrobat.catroid.content.*;
         }

@members { 
private Map<String,UserVariable> variables = new HashMap<String,UserVariable>();

public Map<String,UserVariable> getVariables() {
   return variables;
}

private Sprite currentSprite;

// TODO: set current Sprite
public void setCurrentSprite(Sprite sprite) {
  currentSprite = sprite;
}

private List<Sprite> spriteList;

// TODO: set SpriteList
public void setSpriteList(List<Sprite> spriteList) {
  this.spriteList = spriteList;
}

InternFormulaParser formulaParser;
         }

program returns [List<Script> value]
@init {List<Script> scriptList = new ArrayList<Script>();}
@after {$value = scriptList;}
    : (startScript {scriptList.add($startScript.value);} | 
       whenScript {scriptList.add($whenScript.value);} |  
       broadcastScript {scriptList.add($broadcastScript.value);})* ;

startScript returns [Script value]
@init {Script script = new StartScript();}
@after {$value = script;}
    : ('when' 'program' 'started') brickList
      {script.setBrickList($brickList.value);
       script.setObject(currentSprite);};

whenScript returns [Script value]
@init {Script script = new WhenScript();}
@after {$value = script;}
    : ('when' action) brickList
      {script.setAction(action.value);
       script.setBrickList($brickList.value);
       script.setObject(currentSprite);};


broadcastScript returns [Script value]
@init {Script script = new BroadcastScript();}
@after {$value = script;}
    : ('when' 'I' 'receive' message) brickList
      {script.setReceivedMessage($message.value);
       script.setBrickList($brickList.value);
       script.setObject(currentSprite);};


brickList returns [List<Brick> value]
@init { List<Brick> brickList = new ArrayList<Brick>();}
@after {$value = brickList;}
    : (brick {brickList.add($brick.value);})*;

brick returns [Brick value]
@after { $value.setSprite(currentSprite);}
     : broadcastBrick {$value = $broadcastBrick.value;} | 
       broadcastWaitBrick {$value = $broadcastWaitBrick.value;} | 
       changeBrightnessByNBrick {$value = $changeBrightnessByNBrick.value;} |  
       changeGhostEffectByNBrick {$value = $changeGhostEffectByNBrick.value;} |  
       changeSizeByNBrick {$value = $changeSizeByNBrick.value;} | 
       changeVariableBrick {$value = $changeVariableBrick.value;} | 
       changeVolumeByNBrick {$value = $changeVolumeByNBrick.value;} |  
       changeXByNBrick {$value = $changeXByNBrick.value;} |  
       changeYByNBrick {$value = $changeYByNBrick.value;} |  
       clearGraficEffectBrick {$value = $clearGraficEffectBrick.value;} | 
       comeToFrontBrick {$value = $comeToFrontBrick.value;} |  
       foreverBrick {$value = $foreverBrick.value;} |  
       glideToBrick {$value = $glideToBrick.value;} |  
       goNStepsBackBrick {$value = $goNStepsBackBrick.value;} |  
       hideBrick {$value = $hideBrick.value;} |  
       ifLogicBeginBrick {$value = $ifLogicBeginBrick.value;} |  
       ifLogicElseBrick {$value = $ifLogicElseBrick.value;} |  
       ifLogicEndBrick {$value = $ifLogicEndBrick.value;} |  
       ifOnEdgeBounceBrick {$value = $ifOnEdgeBounceBrick.value;} |  
       legoNXTMotorActionBrick {$value = $legoNXTMotorActionBrick.value;} | 
       legoNxtMotorStopBrick {$value = $legoNxtMotorStopBrick.value;} |  
       legoNxtMotorTurnAngleBrick {$value = $legoNxtMotorTurnAngleBrick.value;} |  
       legoNxtPlayToneBrick {$value = $legoNxtPlayToneBrick.value;} |  
       loopEndBrick {$value = $loopEndBrick.value;} |  
       moveNStepsBrick {$value = $moveNStepsBrick.value;} | 
       nextLookBrik {$value = $nextLookBrik.value;} | 
       noteBrick {$value = $noteBrick.value;} |  
       placeAtBrick {$value = $placeAtBrick.value;} |  
       playSoundBrick {$value = $playSoundBrick.value;} |  
       pointInDirectionBrick {$value = $pointInDirectionBrick.value;} |  
       pointToBrick {$value = $pointToBrick.value;} |  
       repeatBrick {$value = $repeatBrick.value;} |  
       setBrightnessBrick {$value = $setBrightnessBrick.value;} |  
       setGhostEffectBrick {$value = $setGhostEffectBrick.value;} |  
       setLookBrick {$value = $setLookBrick.value;} |  
       setSizeToBrick {$value = $setSizeToBrick.value;} | 
       setVariableBrick {$value = $setVariableBrick.value;} | 
       setVolumeToBrick {$value = $setVolumeToBrick.value;} |  
       setXBrick {$value = $setXBrick.value;} | 
       setYBrick {$value = $setYBrick.value;} | 
       showBrick {$value = $showBrick.value;} | 
       speakBrick {$value = $speakBrick.value;} | 
       stopAllSoundsBrick {$value = $stopAllSoundsBrick.value;} | 
       turnLeftBrick {$value = $turnLeftBrick.value;} |  
       turnRightBrick {$value = $turnRightBrick.value;} | 
       waitBrick {$value = $waitBrick.value;};


broadcastBrick returns [Brick value]
@init { Brick brick = new BroadcastBrick();}
@after { $value = brick; }
    : 'broadcast' message 
       {brick.setBroadcastMessage($message.value);} ;

broadcastWaitBrick returns [Brick value]
@init {Brick brick = new BroadcastWaitBrick();}
@after {$value = brick;}
    : 'broadcast' 'and' 'wait' message
      {brick.setBroadcastMessage($message.value);};

changeBrightnessByNBrick returns [Brick value]
@init {Brick brick = new ChangeBrightnessByNBrick();}
@after {$value = brick;}
    : 'change' 'brightness' 'by' formula '%'
      {brick.setChangeBrightness($formula.value);};

changeGhostEffectByNBrick returns [Brick value]
@init {Brick brick = new ChangeGhostEffectByNBrick();}
@after {$value = brick;}
    : 'change' 'ghost' 'effect' 'by' formula '%'
      {brick.setChangeGhostEffect($formula.value);};

changeSizeByNBrick returns [Brick value]
@init {Brick brick = new ChangeSizeByNBrick();}
@after {$value = brick;}
    : 'change' 'size' 'by' formula '%'
      {brick.setSize($formula.value);};

changeVariableBrick returns [Brick value]
@init {Brick brick = new ChangeVariableBrick();}
@after {$value = brick;}
    : 'change' 'variable' userVariable
      {brick.setVariableFormula($userVariable.value);}
      'by' formula 
      {brick.setUserVariable($formula.value);};
                     

changeVolumeByNBrick returns [Brick value]
@init {Brick brick = new ChangeVolumeByNBrick();}
@after {$value = brick;}
    : 'change' 'volume' 'by' formula '%'
      {brick.setVolume($formula.value);};

changeXByNBrick returns [Brick value]
@init {Brick brick = new ChangeXByNBrick();}
@after {$value = brick;}
    : 'change' 'X' 'by' formula
      {brick.setxMovement($formula.value);};

changeYByNBrick returns [Brick value]
@init {Brick brick = new ChangeYByNBrick();}
@after {$value = brick;}
    : 'change' 'Y' 'by' formula
      {brick.setyMovement($formula.value);};

clearGraficEffectBrick returns [Brick value]
@init {Brick brick = new ClearGraficEffectBrick();}
@after {$value = brick;}
    : 'clear' 'graphic' 'effects';

comeToFrontBrick returns [Brick value]
@init {Brick brick = new ComeToFrontBrick();}
@after {$value = brick;}
    : 'come' 'to' 'front';

foreverBrick returns [Brick value]
@init {Brick brick = new ForeverBrick();}
@after {$value = brick;}
: 'forever';

glideToBrick returns [Brick value]
@init {Brick brick = new GlideToBrick();}
@after {$value = brick;}
    : 'glide' s=formula 
      {brick.setDurationInSeconds($s.value);}
      'seconds' 'to' 'X:' x=formula
      {brick.setxDestination($x.value);}
      ','? 'Y:' y=formula
      {brick.setyDestination($y.value);};

goNStepsBackBrick returns [Brick value]
@init {Brick brick = new GoNStepsBackBrick();}
@after {$value = brick;}
    : 'go' 'back' formula  'layers'
      {brick.setSteps($formula.value);};

hideBrick returns [Brick value]
@init {Brick brick = new HideBrick();}
@after {$value = brick;}
    : 'hide';

ifLogicBeginBrick returns [Brick value]
@init {Brick brick = new IfLogicBeginBrick();}
@after {$value = brick;}
    : 'if' formula 'is' 'true' 'then'
      {brick.setIfCondition($formula.value);};

ifLogicElseBrick returns [Brick value]
@init {Brick brick = new IfLogicElseBrick();}
@after {$value = brick;}
    : 'else';

ifLogicEndBrick returns [Brick value]
@init {Brick brick = new IfLogicEndBrick();}
@after {$value = brick;}
    : 'end' 'if';

ifOnEdgeBounceBrick returns [Brick value]
@init {Brick brick = new IfOnEdgeBounceBrick();}
@after {$value = brick;}
    : 'if' 'on' 'edge' ','? 'bounce';

legoNXTMotorActionBrick returns [Brick value]
@init {Brick brick = new LegoNXTMotorActionBrick();}
@after {$value = brick;}
    : 'NXT' 'move' 'motor' motor
      {brick.setMotor($motor.value);}
      ','? 'speed' formula
      {brick.setSpeed($formula.value);};

legoNxtMotorStopBrick returns [Brick value]
@init {Brick brick = new LegoNxtMotorStopBrick();}
@after {$value = brick;}
    : 'NXT' 'stop' 'motor' motor
      {brick.setMotor($motor.value);};

legoNxtMotorTurnAngleBrick returns [Brick value]
@init {Brick brick = new LegoNxtMotorTurnAngleBrick();}
@after {$value = brick;}
    : 'NXT' 'turn' 'motor' motor 
      {brick.setMotor($motor.value);}
      'to' formula 
      {brick.setDegrees($formula.value);}
      'degrees';

legoNxtPlayToneBrick returns [Brick value]
@init {Brick brick = new LegoNxtPlayToneBrick();}
@after {$value = brick;}
    : 'NXT' 'play' 'tone' ','? 'frequency:' f=formula 
      {brick.setFrequency($f.value);}
      ','? 'duration:' d=formula 
      {brick.setDurationInSeconds($d.value);}
      'seconds';

loopEndBrick returns [Brick value]
@init {Brick brick = new LoopEndBrick();}
@after {$value = brick;}
    : 'end' 'of' 'loop';

moveNStepsBrick returns [Brick value]
@init {Brick brick = new MoveNStepsBrick();}
@after {$value = brick;}
    : 'move' formula 'steps'
      {brick.setSteps($formula.value);};

nextLookBrik returns [Brick value]
@init {Brick brick = new NextLookBrik();}
@after {$value = brick;}
    : 'next' 'look';


noteBrick returns [Brick value]
@init {Brick brick = new NoteBrick();}
@after {$value = brick;}
    : 'note' text
      {brick.setNote($text.value);};

placeAtBrick returns [Brick value]
@init {Brick brick = new PlaceAtBrick();}
@after {$value = brick;}
    : 'place' 'at' 'X:' x=formula
      {brick.setxPosition(x.value);}
      ','? 'Y:' y=formula
      {brick.setyPosition(y.value);};

playSoundBrick returns [Brick value]
@init {Brick brick = new PlaySoundBrick();}
@after {$value = brick;}
    : 'start' 'sound' sound
      {brick.setSound($sound.value);};

pointInDirectionBrick returns [Brick value]
@init {Brick brick = new PointInDirectionBrick();}
@after {$value = brick;}
    : 'point' 'in' 'direction' formula 'degrees'
      {brick.setDegrees($formula.value);};

pointToBrick returns [Brick value]
@init {Brick brick = new PointToBrick();}
@after {$value = brick;}
    : 'point' 'to' objectName
      {brick.setPointedObject($objectName.value);};

repeatBrick returns [Brick value]
@init {Brick brick = new RepeatBrick();}
@after {$value = brick;}
    : 'repeat' formula
      {brick.setTimesToRepeat($formula.value);};

setBrightnessBrick returns [Brick value]
@init {Brick brick = new SetBrightnessBrick();}
@after {$value = brick;}
    : 'set' 'brightness' 'to' formula '%'
      {brick.setBrightness($formula.value);};

setGhostEffectBrick returns [Brick value]
@init {Brick brick = new SetGhostEffectBrick();}
@after {$value = brick;}
    : 'set' 'ghost' 'effect' 'to' formula '%'
      {brick.setTransparency($formula.value);};

setLookBrick returns [Brick value]
@init {Brick brick = new SetLookBrick();}
@after {$value = brick;}
    : 'switch' 'to' 'look' look
      {brick.setLook($look.value);};

setSizeToBrick returns [Brick value]
@init {Brick brick = new SetSizeToBrick();}
@after {$value = brick;}
    : 'set' 'size' 'to' formula '%'
      {brick.setSize($formula.value);};

setVariableBrick returns [Brick value]
@init {Brick brick = new SetVariableBrick();}
@after {$value = brick}
    : 'set' 'variable' userVariable 'to' formula 
      { brick.setUserVariable($userVariable.value);
        brick.setVariableFormula($formula.value);};

setVolumeToBrick returns [Brick value]
@init {Brick brick = new SetVolumeToBrick();}
@after {$value = brick;}
    : 'set' 'volume' 'to' formula '%'
      {brick.setVolume($formula.value);};

setXBrick returns [Brick value]
@init {Brick brick = new SetXBrick();}
@after {$value = brick;}
    : 'set' 'X' 'to' formula 
      {brick.setxPosition($formula.value);};

setYBrick returns [Brick value]
@init {Brick brick = new SetYBrick();}
@after {$value = brick;}
    : 'set' 'Y' 'to' formula 
      {brick.setyPosition($formula.value);};


showBrick returns [Brick value]
@init {Brick brick = new ShowBrick();}
@after {$value = brick;}
    : 'show';

speakBrick returns [Brick value]
@init { Brick brick = new SpeakBrick();}
@after {$value = brick;} 
    : 'speak' text
      {brick.setText($text.value);};

stopAllSoundsBrick returns [Brick value]
@init { Brick brick = new StopAllSoundsBrick();}
@after { $value = brick;}
    : 'stop' 'all' 'sounds'; 

turnLeftBrick returns [Brick value]
@init { Brick brick = new TurnLeftBrick();}
@after { $value = brick;}
    : 'turn' 'left' formula 'degrees'
      {brick.setDegrees($formula.value);};

turnRightBrick returns [Brick value]
@init { Brick brick = new TurnRightBrick();}
@after { $value = brick;}
    : 'turn' 'right' formula 'degrees'
      {brick.setDegrees($formula.value);};

waitBrick returns [Brick value]
@init { Brick brick = new WaitBrick();}
@after { $value = brick;}
    : 'wait' formula 'seconds'
      {brick.setTimeToWaitInSeconds($formula.value);};


action returns [String value] 
    : ACTION { $value = $ACTION.text;};

formula returns [Formula value]
@init { 
         List<InternToken> tokenList = new ArrayList<InternToken>();
      }
@after{ 
         formulaParser = new InternFormulaParser(tokenList);
         Formula formulaTree = new Formula();
         formulaTree.setFormulaTree(internParser.parseFormula());
         $value = formulaTree;
      }
    : '(' (token {tokenList.add($token.value);} )+ ')';

look returns [LookData value]: USER_VARIABLE 
  {StringBuffer buf = new StringBuffer($USER_VARIABLE.text);
   name = buf.substring(1,buf.length()-1);
   $value = null;
   // TODO: exception LookData not found
   for (LookData item: sprite.getLookList()) {
     if (item.getName().equals(name))
       $value = item;
   }
  };

sound returns [SoundInfo value]: USER_VARIABLE 
  {StringBuffer buf = new StringBuffer($USER_VARIABLE.text);
   name = buf.substring(1,buf.length()-1);
   $value = null;
   // TODO: exception SoundInfo not found
   for (SoundInfo item: sprite.getSoundList()) {
     if (item.getName().equals(name))
       $value = item;
   }
  };

objectName returns [Sprite value]: USER_VARIABLE
  {StringBuffer buf = new StringBuffer($USER_VARIABLE.text);
   name = buf.substring(1,buf.length()-1);
   $value = null;
   // TODO: exception SoundInfo not found
   for (Sprite item: spriteList) {
     if (item.getName().equals(name))
       $value = item;
   }
  };

message returns[String value]: USER_VARIABLE {$value = $USER_VARIABLE.text;};
motor returns [String value]: USER_VARIABLE {$value = $USER_VARIABLE.text;}; 
text returns[String value]: USER_VARIABLE {$value = $USER_VARIABLE.text;};

userVariable returns [UserVariable value]
@init { UserVariable var = new UserVariable(); }
@after {$value = var;}
    :USER_VARIABLE {
        if (variables.containsKey($USER_VARIABLE.text) {
           var = variables.get($USER_VARIABLE.text);
        } else {
           var.setName($USER_VARIABLE.text);
           variables.put($USER_VARIABLE.text, var);
        }    
       };

token returns [InternToken value]
@after{ $value = new InternToken($text);}
    : NUMBER | OPERATOR | SENSOR | FUNCTION_NAME |
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

WS : ('\t' | '\r'? '\n' | ' ') {skip();} ;

fragment STRING: (DIGIT | LETTER | SYMBOL | OPERATOR_SYMBOL | WS)+;
fragment OPERATOR_SYMBOL: '=' | '<' | '>' |'+' | '-' | '*' | '/' | '%' | '^';
fragment ADDITIONAL_SYMBOL: '"';
fragment SYMBOL: ('!' | '@' | '#' | '$' | '_' | '\'' | ';' | '~' |
                  '[' | ']' | '{' | '}' | ':' | ',' | '(' | ')' | '\'');
fragment DIGIT: ('0'..'9');
fragment LETTER: ('a'..'z') | ('A'..'Z');


