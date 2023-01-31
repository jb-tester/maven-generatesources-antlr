package org.example;



import foo.ExpLexer;
import foo.ExpParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class ANTLRDemo {
    public static void main(String[] args) throws Exception {
        CharStream in = new ANTLRInputStream("12*(5-6)"); ;
        ExpLexer lexer = new ExpLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExpParser parser = new ExpParser(tokens);
        System.out.println(parser.eval().getText());
    }
}