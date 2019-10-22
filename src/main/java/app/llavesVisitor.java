// Generated from /home/bruno/Facultad/Compiladores/balancellaves/BalanceLLaves/src/main/java/app/llaves.g4 by ANTLR 4.7.1

package app;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link llavesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface llavesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link llavesParser#tipos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipos(llavesParser.TiposContext ctx);
	/**
	 * Visit a parse tree produced by {@link llavesParser#comparador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparador(llavesParser.ComparadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link llavesParser#terminacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminacion(llavesParser.TerminacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link llavesParser#paso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaso(llavesParser.PasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link llavesParser#entrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntrada(llavesParser.EntradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link llavesParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(llavesParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link llavesParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(llavesParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link llavesParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(llavesParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link llavesParser#for_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stm(llavesParser.For_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link llavesParser#while_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stm(llavesParser.While_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link llavesParser#if_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stm(llavesParser.If_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link llavesParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(llavesParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link llavesParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(llavesParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link llavesParser#asign_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsign_stm(llavesParser.Asign_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link llavesParser#declare_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_stm(llavesParser.Declare_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link llavesParser#increment_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement_stm(llavesParser.Increment_stmContext ctx);
}