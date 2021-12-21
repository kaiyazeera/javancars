// Generated from JavaNcars.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaNcarsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaNcarsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaNcarsParser#parseTree}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParseTree(JavaNcarsParser.ParseTreeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaNcarsParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(JavaNcarsParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaNcarsParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JavaNcarsParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaNcarsParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(JavaNcarsParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaNcarsParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(JavaNcarsParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaNcarsParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(JavaNcarsParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaNcarsParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(JavaNcarsParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaNcarsParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(JavaNcarsParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaNcarsParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(JavaNcarsParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaNcarsParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(JavaNcarsParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaNcarsParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(JavaNcarsParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaNcarsParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(JavaNcarsParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaNcarsParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JavaNcarsParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaNcarsParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavaNcarsParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaNcarsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JavaNcarsParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaNcarsParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(JavaNcarsParser.LiteralContext ctx);
}