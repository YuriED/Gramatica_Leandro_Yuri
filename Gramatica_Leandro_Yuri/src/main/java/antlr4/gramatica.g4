grammar gramatica;

TIPO_VAR
    : 'INTEIRO' | 'REAL' | 'TEXTO' | 'BOOLEANO' | 'LISTA';

NUMIT
    : ('0'..'9')+
;

NUMREAL
    : ('0'..'9')+ ('.'('0'..'9')+)?
;

VARIAVEL
    : ('a'..'z' | 'A'..'Z')+ ('a'..'z' | 'A'..'Z' | '0'..'9')*
;

TEXTO
    : '"' .*? '"'
;

OP_ARIT1
    : '+' | '-'
;

OP_ARIT2
    : '*' | '/' | '%'
;

OP_REL
    : '>' | '<' | '>=' | '<=' | '==' | '!='
;

OP_BOOL
    : 'e' | 'ou' | 'nao'
;

programa
    : 'PROGRAMA' VARIAVEL ':' listaDeclaracoes listaFuncoes ':' 'ALGORITMO' listaComandos 'FIM_PROGRAMA'
;

listaDeclaracoes
    : declaracao listaDeclaracoes | declaracao
;

declaracao
    : VARIAVEL ':' TIPO_VAR ('=' expressaoAritmetica | '=' TEXTO | '=' expressaoBool)?
;

listaFuncoes
    : funcao listaFuncoes | funcao
;

funcao
    : 'FUNCAO' VARIAVEL '(' parametros ')' ':' TIPO_VAR 'INICIO' listaComandos 'RETORNAR' expressaoAritmetica 'FIM_FUNCAO'
;

parametros
    : parametro (',' parametro)*
;

parametro
    : VARIAVEL ':' TIPO_VAR
;

expressaoAritmetica
    : expressaoAritmetica OP_ARIT1 termoAritmetico | termoAritmetico
;

termoAritmetico
    : termoAritmetico OP_ARIT2 fatorAritmetico | fatorAritmetico
;

fatorAritmetico
    : NUMIT | NUMREAL | VARIAVEL | '(' expressaoAritmetica ')' | chamarFuncao
;

expressaoBool
    : expressaoBool OP_BOOL termoBool | termoBool
;

termoBool
    : 'VERDADEIRO' | 'FALSO' | expressaoRelacional | '(' expressaoBool ')'
;

chamarFuncao
    : VARIAVEL '(' argumentos ')'
;

argumentos
    : expressaoAritmetica (',' expressaoAritmetica)*
;

expressaoRelacional
    : expressaoAritmetica OP_REL expressaoAritmetica
;

listaComandos
    : comando listaComandos | comando
;

comando
    : comandoAtribuicao |
      comandoEntrada |
      comandoSaida |
      comandoCondicao |
      comandoRepeticao |
      subAlgoritmo |
      comandoLista
;

comandoAtribuicao
    : VARIAVEL '=' expressaoAritmetica | VARIAVEL '=' TEXTO | VARIAVEL '=' expressaoBool
;

comandoEntrada
    : 'LER' VARIAVEL
;

comandoSaida
    : 'IMPRIMIR' (VARIAVEL | expressaoAritmetica | TEXTO)
;

comandoCondicao
    : 'SE' expressaoBool 'ENTAO' subAlgoritmo ('SENAO' subAlgoritmo)?
;

comandoRepeticao
    : 'ENQUANTO' expressaoBool 'FAZER' subAlgoritmo
;

comandoLista
    : VARIAVEL '[' expressaoAritmetica ']' '=' expressaoAritmetica |
      'ADICIONAR' '(' expressaoAritmetica ',' VARIAVEL ')' |
      'REMOVER' '(' expressaoAritmetica ',' VARIAVEL ')'
;

subAlgoritmo
    : 'INICIO' listaComandos 'FIM'
;
