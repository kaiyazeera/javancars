import org.antlr.v4.runtime.tree.*;

public class JavaNcarsVisitorInstance extends JavaNcarsBaseVisitor<String> {

    // @return methodName of calling method
    String getMethodName(){
        return new Throwable().getStackTrace()[1].getMethodName();
    }

    void print(String str){
        System.out.println(str);
    }

    String crlf(){ return "\r\n";}

    @Override
    public String visitParseTree(JavaNcarsParser.ParseTreeContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public String visitCode(JavaNcarsParser.CodeContext ctx) {
        StringBuilder ret = new StringBuilder();
        for(ParseTree p: ctx.children){
            ret.append(this.visit(p));
        }
        return ret.toString();
    }

    @Override
    public String visitBlock(JavaNcarsParser.BlockContext ctx) {
        return this.visit(ctx.blockstatement);
    }
    //TODO
    @Override
    public String visitBlockStatement(JavaNcarsParser.BlockStatementContext ctx) {
        String a = this.visit(ctx.getChild(0));
        print(ctx.getChild(0).getText());
        //returns null
        return "A"  + crlf() + "ENDOFFUN" + crlf(); //methodenkoerper
        //return this.visit(ctx.getChild(0));
    }

    @Override
    public String visitFieldDeclaration(JavaNcarsParser.FieldDeclarationContext ctx) {
        //ignore type for now
        return this.visit(ctx.children.get(1));
    }

    @Override
    public String visitPrintStatement(JavaNcarsParser.PrintStatementContext ctx) {
        visitChildren(ctx);
        String printMe = ctx.getChild(1).getText();
        String code = "push af" + crlf() + "ld a, (" + printMe + ")" + crlf();
        return code + "call printByte" + crlf();
    }

    @Override
    public String visitVariableDeclarator(JavaNcarsParser.VariableDeclaratorContext ctx) {
        String declaration = this.visit(ctx.getChild(0));
        String key = ctx.left.getText();
        String value;
        if (ctx.getChild(2).getChildCount() == 1) {
            value = ctx.right.getText();
            return declaration + "ld a, " + value + "\r\nld ("+ key + "), a" +  crlf();
        } else {
            value = this.visit(ctx.getChild(2));
            String store = "ld (" + key + "), a" + crlf();
            return declaration + value + store ;
        }
    }

    @Override
    public String visitVariableDeclaratorId(JavaNcarsParser.VariableDeclaratorIdContext ctx) {
        return ctx.getText() + " db" + crlf();
    }

    @Override
    public String visitMethodDeclaration(JavaNcarsParser.MethodDeclarationContext ctx) {
        StringBuilder ret = new StringBuilder();

        String methodBody = this.visit(ctx.body);
        if (! methodBody.equals("")){
            // is declaration
            ret.append(this.visit(ctx.getChild(1)));
            ret.append(methodBody);
            return ctx.getChild(0).getText() + ":" + crlf() + ret;
        } else {
            // is call
            String args = this.visit(ctx.getChild(1));
            //String args = "ld " + + crlf(); // load arguments
            return args + "call " + ctx.getChild(0).getText() + crlf();
        }
    }

    @Override
    public String visitMethodBody(JavaNcarsParser.MethodBodyContext ctx) {
        if (this.visit(ctx.getChild(0)) == null){
            return "";
        }
        return this.visit(ctx.getChild(0));
    }

    @Override
    public String visitParameters(JavaNcarsParser.ParametersContext ctx) {
        return this.visit(ctx.getChild(1));
    }

    @Override
    public String visitParameterList(JavaNcarsParser.ParameterListContext ctx) {
        StringBuilder ret = new StringBuilder();
        for(int i=0; (i< ctx.children.size() && i < 11); i = i + 2){
            char locVar = switch (i) {
                case 0 -> 'c';
                case 2 -> 'b';
                case 4 -> 'e';
                case 6 -> 'd';
                case 8 -> 'l';
                case 10 -> 'h';
                default -> 'a';
            };
            ret.append("ld ").append(locVar).append(", (").append(ctx.getChild(i).getText()).append(")").append(crlf());
        }

        return ret.toString();
    }


    @Override
    public String visitType(JavaNcarsParser.TypeContext ctx) {
        //not yet supported
        return null;
    }
    //TODO
    @Override
    public String visitStatement(JavaNcarsParser.StatementContext ctx) {
        visitChildren(ctx);
        System.out.println(getMethodName() +" has children: " + ctx.getChild(0));
        return null;
    }
    //TODO
    @Override
    public String visitExpression(JavaNcarsParser.ExpressionContext ctx) {
        String result = "";
        if(ctx.bop != null){
            String bop = ctx.bop.getText();
            switch(bop){
                case "+":
                    result = "ld a, (" + ctx.left.getText() + ")" + crlf();
                    result += "ld b, a" +crlf();
                    result += "ld a, (" + ctx.right.getText() + ")" + crlf();
                    result += "add " + ctx.right.getText() + crlf();
                    break;
                default:
                    break;
            }
        } else {
            result = ctx.getChild(0).getText();
        }
        return result;
    }

    @Override
    public String visitLiteral(JavaNcarsParser.LiteralContext ctx) {
        //not yet supported
        return null;
    }
}