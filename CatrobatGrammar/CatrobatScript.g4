grammar CatrobatScript;

options {language = Java;}

@header {
         import java.util.HashSet;
         }
@members {         
         HashSet<String> variables = new HashSet<String>();
         }
program: (script)*;

script: startScript | whenScript | broadcastScript;

startScript: ('when program started') brick*;
whenScript: ('when' USER_VARIABLE) brick*;
broadcastScript: ('when I receive' USER_VARIABLE) brick* ;

brick: broadcastBrick | broadcastWaitBrick | changeBrightnessByNBrick |
     changeGhostEffectByNBrick | changeSizeByNBrick | changeVariableBrick | 
     changeVolumeByNBrick | changeXByNBrick | changeYByNBrick;

broadcastBrick: 'broadcast ' USER_VARIABLE ;
broadcastWaitBrick: 'broadcast and wait' USER_VARIABLE;

changeBrightnessByNBrick: 'change brightness by' formula;
changeGhostEffectByNBrick: 'change ghost effect by' formula;
changeSizeByNBrick: 'change size by' formula;
changeVariableBrick: 'change variable' USER_VARIABLE 'by' formula 
                     {variables.add($USER_VARIABLE.text);};
changeVolumeByNBrick: 'change volume by' formula;
changeXByNBrick: 'change X by' formula;
changeYByNBrick: 'change Y by' formula;



formula: BRACKET_OPEN (token+) BRACKET_CLOSE;

token: NUMBER | OPERATOR | SENSOR | FUNCTION_NAME |
       USER_VARIABLE|
       BRACKET_OPEN | BRACKET_CLOSE | FUNCTION_PARAMETER_DELIMITER;           

USER_VARIABLE: '"' STRING '"' ;
NUMBER: (DIGIT)+('.' DIGIT+)?;
FUNCTION_NAME: ('sin' | 'cos' | 'tan' | 'ln' | 'log' | 'sqrt' | 'rand' | 'round' | 
           'abs' | 'pi' | 'mod' | 'arcsin' | 'arccos' | 'arctan' | 'exp' | 
           'max' | 'min' | 'true' | 'false');   
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

fragment STRING: (DIGIT | LETTER | SYMBOL | OPERATOR_SYMBOL | WS)+;
fragment OPERATOR_SYMBOL: '=' | '<' | '>' |'+' | '-' | '*' | '/' | '%' | '^';
fragment ADDITIONAL_SYMBOL: '"';
fragment SYMBOL: ('!' | '@' | '#' | '$' | '_' | '\'' | ';' | '~' |
                  '[' | ']' | '{' | '}' | ':' | ',' | '(' | ')' | '\'');
fragment DIGIT: ('0'..'9');
fragment LETTER: ('a'..'z') | ('A'..'Z');
fragment WS : ('\t' | '\r'? '\n' | ' ') {skip();} ;

