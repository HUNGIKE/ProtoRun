package benke;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import benke.antlr.protorun.ProtoRunBaseVisitor;
import benke.antlr.protorun.ProtoRunLexer;
import benke.antlr.protorun.ProtoRunParser;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws IOException {
    	
    	CharStream input=new ANTLRInputStream("100*10+3>20");
    	ProtoRunLexer prlexer=new ProtoRunLexer(input);
    	CommonTokenStream tokens = new CommonTokenStream(prlexer);
    	ProtoRunParser parser = new ProtoRunParser(tokens); 

    	ProtoRunBaseVisitor<Integer> vistor=new ProtoRunBaseVisitor<Integer>();
    	
    	// System.out.println(vistor.visit(parser.expadd()));
    	
    	
    }
}
