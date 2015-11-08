// Generated from benke/antlr/protorun/ProtoRun.g4 by ANTLR 4.5
package benke.antlr.protorun;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProtoRunParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProtoRunVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProtoRunParser#orexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrexp(ProtoRunParser.OrexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProtoRunParser#andexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndexp(ProtoRunParser.AndexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProtoRunParser#compareexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareexp(ProtoRunParser.CompareexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProtoRunParser#expadd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpadd(ProtoRunParser.ExpaddContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProtoRunParser#expmul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpmul(ProtoRunParser.ExpmulContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProtoRunParser#expph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpph(ProtoRunParser.ExpphContext ctx);
}