// Generated from /home/bruno/Facultad/Compiladores/balancellaves/BalanceLLaves/src/main/java/app/llaves.g4 by ANTLR 4.7.1

package app;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link llavesParser}.
 */
public interface llavesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link llavesParser#tipos}.
	 * @param ctx the parse tree
	 */
	void enterTipos(llavesParser.TiposContext ctx);
	/**
	 * Exit a parse tree produced by {@link llavesParser#tipos}.
	 * @param ctx the parse tree
	 */
	void exitTipos(llavesParser.TiposContext ctx);
	/**
	 * Enter a parse tree produced by {@link llavesParser#comparador}.
	 * @param ctx the parse tree
	 */
	void enterComparador(llavesParser.ComparadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link llavesParser#comparador}.
	 * @param ctx the parse tree
	 */
	void exitComparador(llavesParser.ComparadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link llavesParser#terminacion}.
	 * @param ctx the parse tree
	 */
	void enterTerminacion(llavesParser.TerminacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link llavesParser#terminacion}.
	 * @param ctx the parse tree
	 */
	void exitTerminacion(llavesParser.TerminacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link llavesParser#paso}.
	 * @param ctx the parse tree
	 */
	void enterPaso(llavesParser.PasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link llavesParser#paso}.
	 * @param ctx the parse tree
	 */
	void exitPaso(llavesParser.PasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link llavesParser#entrada}.
	 * @param ctx the parse tree
	 */
	void enterEntrada(llavesParser.EntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link llavesParser#entrada}.
	 * @param ctx the parse tree
	 */
	void exitEntrada(llavesParser.EntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link llavesParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(llavesParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link llavesParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(llavesParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link llavesParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(llavesParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link llavesParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(llavesParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link llavesParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(llavesParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link llavesParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(llavesParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link llavesParser#for_stm}.
	 * @param ctx the parse tree
	 */
	void enterFor_stm(llavesParser.For_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link llavesParser#for_stm}.
	 * @param ctx the parse tree
	 */
	void exitFor_stm(llavesParser.For_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link llavesParser#while_stm}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stm(llavesParser.While_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link llavesParser#while_stm}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stm(llavesParser.While_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link llavesParser#if_stm}.
	 * @param ctx the parse tree
	 */
	void enterIf_stm(llavesParser.If_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link llavesParser#if_stm}.
	 * @param ctx the parse tree
	 */
	void exitIf_stm(llavesParser.If_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link llavesParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(llavesParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link llavesParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(llavesParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link llavesParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(llavesParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link llavesParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(llavesParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link llavesParser#asign_stm}.
	 * @param ctx the parse tree
	 */
	void enterAsign_stm(llavesParser.Asign_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link llavesParser#asign_stm}.
	 * @param ctx the parse tree
	 */
	void exitAsign_stm(llavesParser.Asign_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link llavesParser#declare_stm}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_stm(llavesParser.Declare_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link llavesParser#declare_stm}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_stm(llavesParser.Declare_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link llavesParser#increment_stm}.
	 * @param ctx the parse tree
	 */
	void enterIncrement_stm(llavesParser.Increment_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link llavesParser#increment_stm}.
	 * @param ctx the parse tree
	 */
	void exitIncrement_stm(llavesParser.Increment_stmContext ctx);
}