/*
    adapted from https://github.com/antlr/grammars-v4/blob/master/sqlite/SQLite.g4
*/


grammar ItnmDump;


parse
 : ( sql_stmt_list )* EOF
 ;


sql_stmt_list
 : ';'* insert_stmt ( ';'+ insert_stmt )* ';'*
 ;


database_name
 : IDENTIFIER
 ;

table_name 
 : IDENTIFIER
 ;

column_name 
 : IDENTIFIER
 ;

key_name 
 : IDENTIFIER
 ;


literal_value
 : NUMERIC_LITERAL
 | STRING_LITERAL
 | EMPTY_STRING
 ;

expr
 : literal_value
 | oql_hash
 | oql_array
 ;


oql_kv 
    : key_name '=' expr
    ;

oql_hash
    : OPEN_BRACE oql_kv (',' oql_kv)* CLOSE_BRACE
    ;

oql_array
    : OPEN_SQUARE expr (',' expr)* CLOSE_SQUARE
    ;

insert_stmt
 :  K_INSERT K_INTO
   database_name '.' table_name ( '(' column_name ( ',' column_name )* ')' )?
   ( K_VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
   )
 ;


SPACES
 : [ \u000B\t\r\n] -> channel(HIDDEN)
 ;


SCOL : ';';
DOT : '.';
OPEN_PAR : '(';
CLOSE_PAR : ')';
OPEN_BRACE : '{';
CLOSE_BRACE : '}';
OPEN_SQUARE : '[';
CLOSE_SQUARE : ']';
COMMA : ',';
ASSIGN : '=';
STAR : '*';
PLUS : '+';
MINUS : '-';
TILDE : '~';
PIPE2 : '||';
DIV : '/';
MOD : '%';
LT2 : '<<';
GT2 : '>>';
AMP : '&';
PIPE : '|';
LT : '<';
LT_EQ : '<=';
GT : '>';
GT_EQ : '>=';
NOT_EQ1 : '!=';
NOT_EQ2 : '<>';


K_INSERT : I N S E R T;
K_INTO : I N T O;
K_VALUES : V A L U E S;


IDENTIFIER
 : '`' (~'`' | '``')* '`'
 | [a-zA-Z_] [a-zA-Z_0-9]* 
 ;

NUMERIC_LITERAL
 : DIGIT+ ( '.' DIGIT* )? ( E [-+]? DIGIT+ )?
 | '.' DIGIT+ ( E [-+]? DIGIT+ )?
 ;

BIND_PARAMETER
 : '?' DIGIT*
 | [:@$] IDENTIFIER
 ;

STRING_LITERAL
 : '\'' ( ~'\'' | '\'\'' )* '\''
 | '"' (~'"' | '""')* '"'
 ;

EMPTY_STRING
 : '\'\''
 | '""';


SINGLE_LINE_COMMENT
 : '--' ~[\r\n]* -> channel(HIDDEN)
 ;

MULTILINE_COMMENT
 : '/*' .*? ( '*/' | EOF ) -> channel(HIDDEN)
 ;



UNEXPECTED_CHAR
 : .
 ;

fragment DIGIT : [0-9];

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];