/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar CatrobatScript;

formula: (formulaElement)+;
formulaElement: (OPERATOR | NUMBER);

fragment DIGIT: ('0'..'9');
fragment LETTER: ('a'..'z') | ('A'..'Z');
fragment WS : ('\t' | '\r'? '\n' | ' ')+ { $channel = HIDDEN; } ;

NUMBER: (DIGIT)+;
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