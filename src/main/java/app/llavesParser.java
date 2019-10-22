// Generated from /home/bruno/Facultad/Compiladores/balancellaves/BalanceLLaves/src/main/java/app/llaves.g4 by ANTLR 4.7.1

package app;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class llavesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, LA=2, LC=3, PA=4, PC=5, IF_KEY=6, FOR_KEY=7, WHILE_KEY=8, CHAR_ASIGNACION=9, 
		EQU=10, LT=11, LEQ=12, GT=13, GEQ=14, NEQ=15, ADD=16, SUB=17, MUL=18, 
		DIV=19, MOD=20, INT_TYPE=21, LONG_TYPE=22, BOOLEAN_TYPE=23, ENTERO=24, 
		IDS=25, OPERADOR=26, INCREMENTO=27, OTRO=28;
	public static final int
		RULE_tipos = 0, RULE_comparador = 1, RULE_terminacion = 2, RULE_paso = 3, 
		RULE_entrada = 4, RULE_instrucciones = 5, RULE_instruccion = 6, RULE_bloque = 7, 
		RULE_for_stm = 8, RULE_while_stm = 9, RULE_if_stm = 10, RULE_declaracion = 11, 
		RULE_asignacion = 12, RULE_asign_stm = 13, RULE_declare_stm = 14, RULE_increment_stm = 15;
	public static final String[] ruleNames = {
		"tipos", "comparador", "terminacion", "paso", "entrada", "instrucciones", 
		"instruccion", "bloque", "for_stm", "while_stm", "if_stm", "declaracion", 
		"asignacion", "asign_stm", "declare_stm", "increment_stm"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'{'", "'}'", "'('", "')'", "'if'", "'for'", "'while'", "'='", 
		"'=='", "'<'", "'<='", "'>'", "'>='", "'!='", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'int'", "'long'", "'boolean'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "LA", "LC", "PA", "PC", "IF_KEY", "FOR_KEY", "WHILE_KEY", 
		"CHAR_ASIGNACION", "EQU", "LT", "LEQ", "GT", "GEQ", "NEQ", "ADD", "SUB", 
		"MUL", "DIV", "MOD", "INT_TYPE", "LONG_TYPE", "BOOLEAN_TYPE", "ENTERO", 
		"IDS", "OPERADOR", "INCREMENTO", "OTRO"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "llaves.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public llavesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TiposContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(llavesParser.INT_TYPE, 0); }
		public TerminalNode LONG_TYPE() { return getToken(llavesParser.LONG_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(llavesParser.BOOLEAN_TYPE, 0); }
		public TiposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).enterTipos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).exitTipos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof llavesVisitor ) return ((llavesVisitor<? extends T>)visitor).visitTipos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TiposContext tipos() throws RecognitionException {
		TiposContext _localctx = new TiposContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tipos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << BOOLEAN_TYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparadorContext extends ParserRuleContext {
		public TerminalNode EQU() { return getToken(llavesParser.EQU, 0); }
		public TerminalNode LT() { return getToken(llavesParser.LT, 0); }
		public TerminalNode LEQ() { return getToken(llavesParser.LEQ, 0); }
		public TerminalNode GT() { return getToken(llavesParser.GT, 0); }
		public TerminalNode GEQ() { return getToken(llavesParser.GEQ, 0); }
		public TerminalNode NEQ() { return getToken(llavesParser.NEQ, 0); }
		public ComparadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).enterComparador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).exitComparador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof llavesVisitor ) return ((llavesVisitor<? extends T>)visitor).visitComparador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparadorContext comparador() throws RecognitionException {
		ComparadorContext _localctx = new ComparadorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comparador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQU) | (1L << LT) | (1L << LEQ) | (1L << GT) | (1L << GEQ) | (1L << NEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminacionContext extends ParserRuleContext {
		public List<TerminalNode> IDS() { return getTokens(llavesParser.IDS); }
		public TerminalNode IDS(int i) {
			return getToken(llavesParser.IDS, i);
		}
		public ComparadorContext comparador() {
			return getRuleContext(ComparadorContext.class,0);
		}
		public TerminalNode ENTERO() { return getToken(llavesParser.ENTERO, 0); }
		public TerminacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).enterTerminacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).exitTerminacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof llavesVisitor ) return ((llavesVisitor<? extends T>)visitor).visitTerminacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminacionContext terminacion() throws RecognitionException {
		TerminacionContext _localctx = new TerminacionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_terminacion);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(IDS);
				setState(37);
				comparador();
				setState(38);
				match(ENTERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				match(IDS);
				setState(41);
				comparador();
				setState(42);
				match(IDS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PasoContext extends ParserRuleContext {
		public TerminalNode IDS() { return getToken(llavesParser.IDS, 0); }
		public TerminalNode INCREMENTO() { return getToken(llavesParser.INCREMENTO, 0); }
		public TerminalNode OPERADOR() { return getToken(llavesParser.OPERADOR, 0); }
		public TerminalNode CHAR_ASIGNACION() { return getToken(llavesParser.CHAR_ASIGNACION, 0); }
		public TerminalNode ENTERO() { return getToken(llavesParser.ENTERO, 0); }
		public PasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).enterPaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).exitPaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof llavesVisitor ) return ((llavesVisitor<? extends T>)visitor).visitPaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PasoContext paso() throws RecognitionException {
		PasoContext _localctx = new PasoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_paso);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(IDS);
				setState(47);
				match(INCREMENTO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				match(IDS);
				setState(49);
				match(OPERADOR);
				setState(50);
				match(CHAR_ASIGNACION);
				setState(51);
				match(ENTERO);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntradaContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public EntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).enterEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).exitEntrada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof llavesVisitor ) return ((llavesVisitor<? extends T>)visitor).visitEntrada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntradaContext entrada() throws RecognitionException {
		EntradaContext _localctx = new EntradaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_entrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			instrucciones();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof llavesVisitor ) return ((llavesVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instrucciones);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LA:
			case IF_KEY:
			case FOR_KEY:
			case WHILE_KEY:
			case INT_TYPE:
			case LONG_TYPE:
			case BOOLEAN_TYPE:
			case IDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				instruccion();
				setState(57);
				instrucciones();
				}
				break;
			case EOF:
			case LC:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstruccionContext extends ParserRuleContext {
		public For_stmContext for_stm() {
			return getRuleContext(For_stmContext.class,0);
		}
		public While_stmContext while_stm() {
			return getRuleContext(While_stmContext.class,0);
		}
		public If_stmContext if_stm() {
			return getRuleContext(If_stmContext.class,0);
		}
		public Asign_stmContext asign_stm() {
			return getRuleContext(Asign_stmContext.class,0);
		}
		public Declare_stmContext declare_stm() {
			return getRuleContext(Declare_stmContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof llavesVisitor ) return ((llavesVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instruccion);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				for_stm();
				}
				break;
			case WHILE_KEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				while_stm();
				}
				break;
			case IF_KEY:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				if_stm();
				}
				break;
			case IDS:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				asign_stm();
				}
				break;
			case INT_TYPE:
			case LONG_TYPE:
			case BOOLEAN_TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				declare_stm();
				}
				break;
			case LA:
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				bloque();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LA() { return getToken(llavesParser.LA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LC() { return getToken(llavesParser.LC, 0); }
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof llavesVisitor ) return ((llavesVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(LA);
			setState(71);
			instrucciones();
			setState(72);
			match(LC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_stmContext extends ParserRuleContext {
		public TerminalNode FOR_KEY() { return getToken(llavesParser.FOR_KEY, 0); }
		public TerminalNode PA() { return getToken(llavesParser.PA, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminacionContext terminacion() {
			return getRuleContext(TerminacionContext.class,0);
		}
		public PasoContext paso() {
			return getRuleContext(PasoContext.class,0);
		}
		public TerminalNode PC() { return getToken(llavesParser.PC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public For_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).enterFor_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).exitFor_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof llavesVisitor ) return ((llavesVisitor<? extends T>)visitor).visitFor_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmContext for_stm() throws RecognitionException {
		For_stmContext _localctx = new For_stmContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_for_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(FOR_KEY);
			setState(75);
			match(PA);
			setState(76);
			asignacion();
			setState(77);
			match(T__0);
			setState(78);
			terminacion();
			setState(79);
			match(T__0);
			setState(80);
			paso();
			setState(81);
			match(PC);
			setState(82);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_stmContext extends ParserRuleContext {
		public TerminalNode WHILE_KEY() { return getToken(llavesParser.WHILE_KEY, 0); }
		public TerminalNode PA() { return getToken(llavesParser.PA, 0); }
		public TerminacionContext terminacion() {
			return getRuleContext(TerminacionContext.class,0);
		}
		public TerminalNode PC() { return getToken(llavesParser.PC, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public While_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).enterWhile_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).exitWhile_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof llavesVisitor ) return ((llavesVisitor<? extends T>)visitor).visitWhile_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmContext while_stm() throws RecognitionException {
		While_stmContext _localctx = new While_stmContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(WHILE_KEY);
			setState(85);
			match(PA);
			setState(86);
			terminacion();
			setState(87);
			match(PC);
			setState(88);
			instruccion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmContext extends ParserRuleContext {
		public TerminalNode IF_KEY() { return getToken(llavesParser.IF_KEY, 0); }
		public TerminalNode PA() { return getToken(llavesParser.PA, 0); }
		public TerminacionContext terminacion() {
			return getRuleContext(TerminacionContext.class,0);
		}
		public TerminalNode PC() { return getToken(llavesParser.PC, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public If_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).enterIf_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).exitIf_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof llavesVisitor ) return ((llavesVisitor<? extends T>)visitor).visitIf_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmContext if_stm() throws RecognitionException {
		If_stmContext _localctx = new If_stmContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(IF_KEY);
			setState(91);
			match(PA);
			setState(92);
			terminacion();
			setState(93);
			match(PC);
			setState(94);
			instruccion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracionContext extends ParserRuleContext {
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof llavesVisitor ) return ((llavesVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			tipos();
			setState(97);
			asignacion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionContext extends ParserRuleContext {
		public List<TerminalNode> IDS() { return getTokens(llavesParser.IDS); }
		public TerminalNode IDS(int i) {
			return getToken(llavesParser.IDS, i);
		}
		public TerminalNode CHAR_ASIGNACION() { return getToken(llavesParser.CHAR_ASIGNACION, 0); }
		public TerminalNode ENTERO() { return getToken(llavesParser.ENTERO, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof llavesVisitor ) return ((llavesVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_asignacion);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(IDS);
				setState(100);
				match(CHAR_ASIGNACION);
				setState(101);
				match(IDS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(IDS);
				setState(103);
				match(CHAR_ASIGNACION);
				setState(104);
				match(ENTERO);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Asign_stmContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public Asign_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asign_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).enterAsign_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).exitAsign_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof llavesVisitor ) return ((llavesVisitor<? extends T>)visitor).visitAsign_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asign_stmContext asign_stm() throws RecognitionException {
		Asign_stmContext _localctx = new Asign_stmContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_asign_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			asignacion();
			setState(108);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_stmContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public Declare_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).enterDeclare_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).exitDeclare_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof llavesVisitor ) return ((llavesVisitor<? extends T>)visitor).visitDeclare_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_stmContext declare_stm() throws RecognitionException {
		Declare_stmContext _localctx = new Declare_stmContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declare_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			declaracion();
			setState(111);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Increment_stmContext extends ParserRuleContext {
		public PasoContext paso() {
			return getRuleContext(PasoContext.class,0);
		}
		public Increment_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).enterIncrement_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof llavesListener ) ((llavesListener)listener).exitIncrement_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof llavesVisitor ) return ((llavesVisitor<? extends T>)visitor).visitIncrement_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Increment_stmContext increment_stm() throws RecognitionException {
		Increment_stmContext _localctx = new Increment_stmContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_increment_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			paso();
			setState(114);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36w\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4/\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"\67\n\5\3\6\3\6\3\7\3\7\3\7\3\7\5\7?\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bG"+
		"\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16l\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\4\3\2\27\31\3\2"+
		"\f\21\2o\2\"\3\2\2\2\4$\3\2\2\2\6.\3\2\2\2\b\66\3\2\2\2\n8\3\2\2\2\f>"+
		"\3\2\2\2\16F\3\2\2\2\20H\3\2\2\2\22L\3\2\2\2\24V\3\2\2\2\26\\\3\2\2\2"+
		"\30b\3\2\2\2\32k\3\2\2\2\34m\3\2\2\2\36p\3\2\2\2 s\3\2\2\2\"#\t\2\2\2"+
		"#\3\3\2\2\2$%\t\3\2\2%\5\3\2\2\2&\'\7\33\2\2\'(\5\4\3\2()\7\32\2\2)/\3"+
		"\2\2\2*+\7\33\2\2+,\5\4\3\2,-\7\33\2\2-/\3\2\2\2.&\3\2\2\2.*\3\2\2\2/"+
		"\7\3\2\2\2\60\61\7\33\2\2\61\67\7\35\2\2\62\63\7\33\2\2\63\64\7\34\2\2"+
		"\64\65\7\13\2\2\65\67\7\32\2\2\66\60\3\2\2\2\66\62\3\2\2\2\67\t\3\2\2"+
		"\289\5\f\7\29\13\3\2\2\2:;\5\16\b\2;<\5\f\7\2<?\3\2\2\2=?\3\2\2\2>:\3"+
		"\2\2\2>=\3\2\2\2?\r\3\2\2\2@G\5\22\n\2AG\5\24\13\2BG\5\26\f\2CG\5\34\17"+
		"\2DG\5\36\20\2EG\5\20\t\2F@\3\2\2\2FA\3\2\2\2FB\3\2\2\2FC\3\2\2\2FD\3"+
		"\2\2\2FE\3\2\2\2G\17\3\2\2\2HI\7\4\2\2IJ\5\f\7\2JK\7\5\2\2K\21\3\2\2\2"+
		"LM\7\t\2\2MN\7\6\2\2NO\5\32\16\2OP\7\3\2\2PQ\5\6\4\2QR\7\3\2\2RS\5\b\5"+
		"\2ST\7\7\2\2TU\5\20\t\2U\23\3\2\2\2VW\7\n\2\2WX\7\6\2\2XY\5\6\4\2YZ\7"+
		"\7\2\2Z[\5\16\b\2[\25\3\2\2\2\\]\7\b\2\2]^\7\6\2\2^_\5\6\4\2_`\7\7\2\2"+
		"`a\5\16\b\2a\27\3\2\2\2bc\5\2\2\2cd\5\32\16\2d\31\3\2\2\2ef\7\33\2\2f"+
		"g\7\13\2\2gl\7\33\2\2hi\7\33\2\2ij\7\13\2\2jl\7\32\2\2ke\3\2\2\2kh\3\2"+
		"\2\2l\33\3\2\2\2mn\5\32\16\2no\7\3\2\2o\35\3\2\2\2pq\5\30\r\2qr\7\3\2"+
		"\2r\37\3\2\2\2st\5\b\5\2tu\7\3\2\2u!\3\2\2\2\7.\66>Fk";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}