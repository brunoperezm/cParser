package app;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.text.SimpleDateFormat;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
// import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;


public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println("Hello Java");

        // create a CharStream that reads from file
        CharStream input = CharStreams.fromFileName("src/main/java/app/entrada.txt");
        // CharStream input = CharStreams.fromFileName("/var/log/kern.log.1");

        // create a lexer that feeds off of input CharStream
        llavesLexer lexer = new llavesLexer(input);

        // create listener

        llavesBaseListener listener = new Listener();


        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        llavesParser parser = new llavesParser(tokens);

        parser.addParseListener(listener);

        // Solicito al parser que comience indicando una regla gramatical
        // En este caso la regla es el simbolo inicial
        // TODO: anadir balance de llaves parentesis y corchetes
        ParseTree tree = parser.entrada();
        System.out.println(tree.toStringTree(parser));
        System.out.println(listener);

    }
}
