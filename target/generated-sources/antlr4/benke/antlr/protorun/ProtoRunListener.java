// Generated from benke/antlr/protorun/ProtoRun.g4 by ANTLR 4.5
package benke.antlr.protorun;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProtoRunParser}.
 */
public interface ProtoRunListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProtoRunParser#orexp}.
	 * @param ctx the parse tree
	 */
	void enterOrexp(ProtoRunParser.OrexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProtoRunParser#orexp}.
	 * @param ctx the parse tree
	 */
	void exitOrexp(ProtoRunParser.OrexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProtoRunParser#andexp}.
	 * @param ctx the parse tree
	 */
	void enterAndexp(ProtoRunParser.AndexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProtoRunParser#andexp}.
	 * @param ctx the parse tree
	 */
	void exitAndexp(ProtoRunParser.AndexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProtoRunParser#compareexp}.
	 * @param ctx the parse tree
	 */
	void enterCompareexp(ProtoRunParser.CompareexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProtoRunParser#compareexp}.
	 * @param ctx the parse tree
	 */
	void exitCompareexp(ProtoRunParser.CompareexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProtoRunParser#expadd}.
	 * @param ctx the parse tree
	 */
	void enterExpadd(ProtoRunParser.ExpaddContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProtoRunParser#expadd}.
	 * @param ctx the parse tree
	 */
	void exitExpadd(ProtoRunParser.ExpaddContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProtoRunParser#expmul}.
	 * @param ctx the parse tree
	 */
	void enterExpmul(ProtoRunParser.ExpmulContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProtoRunParser#expmul}.
	 * @param ctx the parse tree
	 */
	void exitExpmul(ProtoRunParser.ExpmulContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProtoRunParser#expph}.
	 * @param ctx the parse tree
	 */
	void enterExpph(ProtoRunParser.ExpphContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProtoRunParser#expph}.
	 * @param ctx the parse tree
	 */
	void exitExpph(ProtoRunParser.ExpphContext ctx);
}