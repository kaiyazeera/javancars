import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String declare = "int c= 3;int b=2;"; //works
        String print = "int i = 5; print i;"; //works
        String declarePrint = "int c= 13;int b=2; int d =10; int e=210; print c;"; //works
        String callMethod = "int a=1;int b=2;int c=3;setTile(a, c, b);"; //works
        String method = "int c = 3; function(i,j){ int c = 3;}"; //methodbody intc=3 ??
        String program1 = "int a = 21; int b = 21; int c = a + b; int d = 4; print c;"; //works
        CharStream inputStream = CharStreams.fromString(program1);
        JavaNcarsLexer lexer = new JavaNcarsLexer(inputStream);
        JavaNcarsParser parser = new JavaNcarsParser(new CommonTokenStream(lexer));

        ParseTree tree = parser.parseTree();
        JavaNcarsVisitorInstance visitor = new JavaNcarsVisitorInstance();
        String code = visitor.visit(tree);
        generateCode(code);
    }

    private static void generateCode(String code){
        String[] filteredRam = filterSections(code);
        String ram = filteredRam[0], main = filteredRam[1] , fun = filteredRam[2];
        String indentedRam = indentInnerCode(ram, 4);
        String indentedMain = indentInnerCode(main, 8);
        String indentedFun = indentInnerCode(fun, 8).substring(4);
        System.out.println(indentedFun);

        String includes = ".include \"../framework.asm\"\r\n";
        String ramSection = "  .ramsection \"Definitions\" slot 1\r\n" + indentedRam + "  .ends\r\n";
        String mainSection = "  .section \"main\"\r\n" + "    main:\r\n" + indentedMain + indentedFun+ "  .ends\r\n";
        String asm = includes + ramSection + mainSection;

        String path = System.getProperty("user.dir") + "/asm/code.asm";
        printToFile(path, asm);
    }

    private static void printToFile(String path, String str) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            writer.write(str);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String indentInnerCode(String str, int depth){
        String indentionChar = " ";
        String marker = "\r\n";
        String replacement = marker + indentionChar.repeat(depth);
        return indentionChar.repeat(depth) + (str.replaceAll(marker , replacement).trim() + marker);
    }

    private static String[] filterSections(String code){
        StringBuilder main = new StringBuilder(), ram = new StringBuilder(), function = new StringBuilder();
        StringTokenizer tokenizer = new StringTokenizer(code, "\r\n");
        boolean withinFunction = false;
        while(tokenizer.hasMoreTokens()){
            String line = tokenizer.nextToken();
            if (line.matches("\\w db")) {
                ram.append(line).append("\r\n");
            } else if (withinFunction || line.endsWith(":") ) {
                if(line.endsWith(":")){
                    withinFunction = true;
                    function.append(line).append("\r\n");
                } else if (line.equals("ENDOFFUN")){
                    withinFunction = false;
                } else {
                    function.append(line).append("\r\n");
                }
            } else {
                main.append(line).append("\r\n");
            }
        }

        return new String[] {ram.toString(), main.toString(), function.toString()};
    }

}