grammar ProtoRun;

@header {
    package benke.antlr.protorun;
}


orexp : andexp ( '||' andexp )*;
andexp : compareexp ( '&&' compareexp)*;

compareexp : '!' compareexp |
	     expadd (('=='|'>' |'<') expadd )+ | 
             Bool;

expadd : expmul ( ('+'|'-') expmul )* ;
expmul : expph ( ('*'|'/') expph )* ;
expph : Int | '(' expadd  ')';


Bool : 'true' | 'false'; 
Int : [1-9][0-9]* ;

WS : [ \t\r\n]+ -> skip ;
