grammar llaves;
@header {
package app;
}

LA: '{';
LC: '}';

PA: '(';
PC: ')';

IF_KEY: 'if';
FOR_KEY: 'for';
WHILE_KEY: 'while';

CHAR_ASIGNACION: '=';
EQU: '==';
LT : '<';
LEQ: '<=';
GT : '>';
GEQ: '>=';
NEQ: '!=';

ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
MOD: '%';

INT_TYPE : 'int';
LONG_TYPE : 'long';
BOOLEAN_TYPE : 'boolean';

fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];

ENTERO: DIGITO+;
IDS: (LETRA | '_') (LETRA | ENTERO | '_')*;
OPERADOR
    : ADD 
    | SUB 
    | MUL 
    | DIV 
    | MOD
    ;


INCREMENTO 
    : '++' 
    | '--'
    ;

tipos
    : INT_TYPE
    | LONG_TYPE
    | BOOLEAN_TYPE
    ;

comparador
    : EQU 
    | LT 
    | LEQ 
    | GT 
    | GEQ 
    | NEQ;

OTRO: [ \n\r\t] -> skip;



terminacion
    : IDS comparador  ENTERO
    | IDS comparador IDS
    ;
paso
    : IDS INCREMENTO
    | IDS OPERADOR CHAR_ASIGNACION ENTERO
    ;

entrada
    : instrucciones
    ;

instrucciones
    : instruccion instrucciones 
    |
    ;

instruccion: for_stm 
    | while_stm
    | if_stm
    | asign_stm
    | declare_stm
    | bloque;

bloque: LA instrucciones LC;

for_stm
    : FOR_KEY PA asignacion ';' terminacion ';' paso PC bloque;
while_stm
    : WHILE_KEY PA terminacion PC instruccion;
if_stm
    : IF_KEY PA terminacion PC instruccion;

declaracion
    : tipos asignacion
    ;

asignacion
    : IDS CHAR_ASIGNACION IDS
	| IDS CHAR_ASIGNACION ENTERO
    ;

asign_stm : asignacion ';';
declare_stm : declaracion ';';

increment_stm : paso ';';