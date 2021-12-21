grammar JavaNcars;

/*
 * Parser Rules
 */


// parseTree: packages? imports* types* EOF;
parseTree: code EOF;

// do not use ( )* => ANTLR parsers don't parse if empty parseTree would match the grammar.
code: (methodDeclaration | fieldDeclaration | printStatement)+;

block: '{' blockstatement=blockStatement* '}';

//blockStatement: (localVariableDeclaration | statement | printStatement) ';';
blockStatement: code;
//localVariableDeclaration: type variableDeclarator;
fieldDeclaration: type variableDeclarator ';';

printStatement: 'print' IDENTIFIER';';

//variableDeclarator: variableDeclaratorId '=' variableInitializer;
variableDeclarator: left=variableDeclaratorId '=' right=expression;
//variableDeclaratorId: IDENTIFIER ('[' ']')?;
variableDeclaratorId: IDENTIFIER;
//variableInitializer: arrayInitializer | expression;
//arrayInitializer: '{' (variableInitializer (',' variableInitializer)* (',')? )? '}';

//methodDeclaration: typeOrVoid IDENTIFIER parameters methodBody;
methodDeclaration: IDENTIFIER parameters (body=methodBody)?;
methodBody: block | ';' ;
parameters: '(' parameterList? ')';
parameterList: IDENTIFIER (',' IDENTIFIER)*;
//parameterList: parameter (',' parameter)*;
//parameter: variableDeclaratorId;
//parameter: type variableDeclaratorId;

//typeOrVoid: type | VOID;

//type: BOOLEAN | INT | FLOAT | CHAR | STRING;
//type: BOOLEAN | INT | FLOAT | CHAR;
type: INT;

//statement
//    : blockLabel=block
//    | IF parExpression statement (ELSE statement)?
//    | FOR '(' forControl ')' statement
//    | RETURN expression? ';'
//    | SEMI
//    | statementExpression=expression ';'
//    | identifierLabel=IDENTIFIER ':' statement;

statement
    : blockLabel=block
    | RETURN expression? ';'
    | SEMI
    | statementExpression=expression ';'
    | identifierLabel=IDENTIFIER ':' statement;

//parExpression: '(' expression ')';

//forControl: forInit ';' expression ';' forUpdate=expression;
//forInit: localVariableDeclaration;

//expression
//    : parExpression
//    | expression bop=('*'|'/'|'%') expression
//    | expression bop=('+'|'-') expression
//    | expression bop=('<=' | '>=' | '>' | '<') expression
//    | expression bop=('==' | '!=') expression
//    | expression bop='&' expression
//    | expression bop='^' expression
//    | expression bop='|' expression
//    | IDENTIFIER
//    | literal;

expression
    : left=expression bop=('+'|'-') right=expression
    | IDENTIFIER
    | literal;

//literal: DECIMAL_LITERAL | FLOAT_LITERAL | BOOL_LITERAL | CHAR_LITERAL;
//literal: DECIMAL_LITERAL | FLOAT_LITERAL;
literal: DECIMAL_LITERAL;

/*
 * Lexer Rules
 */

// Keywords
RETURN: 'return';
//BOOLEAN: 'boolean';
INT: 'int';
//FLOAT: 'float';
//CHAR: 'char';
//STRING: 'string';
VOID: 'void';
//CONST: 'const';
IF: 'if';
ELSE: 'else';
FOR: 'for';

// Literals
DECIMAL_LITERAL: '0' | [1-9] Digit*;
//FLOAT_LITERAL: (Digit+ '.' Digit+);
//BOOL_LITERAL: 'true' | 'false';
//CHAR_LITERAL: Letter;
//STRING_LITERAL: Letter+;

// Identifiers
IDENTIFIER: Letter LetterOrDigit*;
//IDENTIFIER: [a-zA-Z] [a-zA-Z0-9];


// Whitespace and Comments
//LINE_COMMENT: '#' ~[\r\n]* -> channel(HIDDEN);
WHITESPACE: [ \t\r\n] -> skip;

// Operators
ADD: '+';
//MUL: '*';
SUB: '-';
//DIV: '/';
//MOD: '%';
//OR: '|';
//AND: '&';
ASSIGN: '=';
//EQ: '==';
//GE: '>=';
//LE: '<=';
//LT: '<';
//GT: '>';
//NE: '!=';
//POW: '^';

// Separators
SEMI: ';';
//COMMA: ',';
//DOT: '.';
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
//LBRACK: '[';
//RBRACK: ']';

// Fragment rules
fragment LetterOrDigit: Letter | Digit;
fragment Letter : [a-zA-Z];
fragment Digit : [0-9];
fragment Dot : '.';
