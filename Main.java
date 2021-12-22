import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.STGroupString;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    //toggle gameboy-mode
    static boolean flagGameBoy = true;

    public static void main(String[] args) {
        String declare = "int c= 3;int b=2;"; //works
        String print = "int i = 5; print i;"; //works
        String twodeclare = "int c= 3; c=2;";
        String declarePrint = "int c= 13;int b=2; int d =10; int e=210; print c;"; //works
        String callMethod = "int a=1;int b=2;int c=3;setTile(a, c, b);"; //works
        String callMethod2 = "int a=1;int b=2;int c=3;setTile(1, 1, 1);"; //works
        String method = "int c = 3; function(i,j){ int c = 3;}"; //methodbody intc=3 ??
        String program1 = "int a = 21; int b = 21; int c = a + b; int d = 4; print c;"; //works
        String friendlyFace = readFromFile(System.getProperty("user.dir") + "/code/friendly-face.ncars");
        CharStream inputStream = CharStreams.fromString(friendlyFace);
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

        if(flagGameBoy){
            main += "call waitVBlank\r\nret";
            //main = "call clearVRAM;\r\n" + main + "call waitVBlank\r\nret";
        }

        String indentedRam = indentInnerCode(ram, 4);
        String indentedMain = indentInnerCode(main, 6);
        String indentedFun = indentInnerCode(fun, 6).substring(4);
        System.out.println(indentedFun);

        String includes = ".include \"../framework.asm\"\r\n";
        String ramSection = "  .ramsection \"Definitions\" slot 1\r\n" + indentedRam + "  .ends\r\n";
        if(ram.equals("")){ ramSection = "";}

        String mainSection = ".section \"main\"\r\n" + "  main:\r\n" + indentedMain + indentedFun+ ".ends\r\n";
        String asm = includes + ramSection + mainSection;
        if(flagGameBoy){
            asm = includes + "\r\n.name \"Game\"\r\n\r\n" + ramSection + mainSection;
        }


        String path = System.getProperty("user.dir") + "/asm/code.asm";
        printToFile(path, asm);
    }

    private static String readFromFile (String path) {
        StringBuilder sourcecode = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = reader.readLine()) != null) {
                sourcecode.append(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sourcecode.toString();
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