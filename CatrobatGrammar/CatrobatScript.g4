grammar CatrobatScript;

options {language = Java;}

@header {
         import java.util.HashSet;
         }
@members {         
         HashSet<String> variables = new HashSet<String>();
         }


formula: (token+);

token: NUMBER | OPERATOR | SENSOR | FUNCTION_NAME |
       USER_VARIABLE {variables.add($USER_VARIABLE.text);} |
       BRACKET_OPEN | BRACKET_CLOSE | FUNCTION_PARAMETER_DELIMITER;
           

NUMBER: (DIGIT)+('.' DIGIT+)?;

FUNCTION_NAME: ('SIN' | 'COS' | 'TAN' | 'LN' | 'LOG' | 'SQRT' | 'RAND' | 'ROUND' | 
           'ABS' | 'PI' | 'MOD' | 'ARCSIN' | 'ARCCOS' | 'ARCTAN' | 'EXP' | 
           'MAX' | 'MIN' | 'TRUE' | 'FALSE');    

OPERATOR: ('AND' | 'OR' | '=' | '!=' | '<=' | '>=' | '<' | '>' | 
          '+' | '-' | '*' | '/' | '%' | '^' | 'NOT');

SENSOR: ('x_acceleration' | 'y_acceleration' | 'z_acceleration' |
         'compass_direction' | 'x_inclination' | 'y_inclination' |
         'object_x' | 'object_y' | 
         'object_ghosteffect' | 'object_brightness' | 'object_size' |
         'object_rotation' | 'object_layer');

USER_VARIABLE: ('"' (DIGIT | LETTER)+ '"');
BRACKET_OPEN: '(';
BRACKET_CLOSE: ')';
FUNCTION_PARAMETER_DELIMITER: ',';

fragment DIGIT: ('0'..'9');
fragment LETTER: ('a'..'z') | ('A'..'Z');
fragment WS : ('\t' | '\r'? '\n' | ' ') {skip();} ;

