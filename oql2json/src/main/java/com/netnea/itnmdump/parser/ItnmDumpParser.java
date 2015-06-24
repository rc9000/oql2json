// Generated from ../grammar/ItnmDump.g4 by ANTLR 4.5
package com.netnea.itnmdump.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ItnmDumpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACES=1, SCOL=2, DOT=3, OPEN_PAR=4, CLOSE_PAR=5, OPEN_BRACE=6, CLOSE_BRACE=7, 
		OPEN_SQUARE=8, CLOSE_SQUARE=9, COMMA=10, ASSIGN=11, STAR=12, PLUS=13, 
		MINUS=14, TILDE=15, PIPE2=16, DIV=17, MOD=18, LT2=19, GT2=20, AMP=21, 
		PIPE=22, LT=23, LT_EQ=24, GT=25, GT_EQ=26, NOT_EQ1=27, NOT_EQ2=28, K_INSERT=29, 
		K_INTO=30, K_VALUES=31, IDENTIFIER=32, NUMERIC_LITERAL=33, BIND_PARAMETER=34, 
		STRING_LITERAL=35, EMPTY_STRING=36, SINGLE_LINE_COMMENT=37, MULTILINE_COMMENT=38, 
		UNEXPECTED_CHAR=39;
	public static final int
		RULE_parse = 0, RULE_sql_stmt_list = 1, RULE_database_name = 2, RULE_table_name = 3, 
		RULE_column_name = 4, RULE_key_name = 5, RULE_literal_value = 6, RULE_expr = 7, 
		RULE_oql_kv = 8, RULE_oql_hash = 9, RULE_oql_array = 10, RULE_insert_stmt = 11;
	public static final String[] ruleNames = {
		"parse", "sql_stmt_list", "database_name", "table_name", "column_name", 
		"key_name", "literal_value", "expr", "oql_kv", "oql_hash", "oql_array", 
		"insert_stmt"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "';'", "'.'", "'('", "')'", "'{'", "'}'", "'['", "']'", "','", 
		"'='", "'*'", "'+'", "'-'", "'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", 
		"'&'", "'|'", "'<'", "'<='", "'>'", "'>='", "'!='", "'<>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACES", "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "OPEN_BRACE", 
		"CLOSE_BRACE", "OPEN_SQUARE", "CLOSE_SQUARE", "COMMA", "ASSIGN", "STAR", 
		"PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", 
		"PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "NOT_EQ1", "NOT_EQ2", "K_INSERT", 
		"K_INTO", "K_VALUES", "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", 
		"STRING_LITERAL", "EMPTY_STRING", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", 
		"UNEXPECTED_CHAR"
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
	public String getGrammarFileName() { return "ItnmDump.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ItnmDumpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ItnmDumpParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItnmDumpListener ) ((ItnmDumpListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItnmDumpListener ) ((ItnmDumpListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL || _la==K_INSERT) {
				{
				{
				setState(24);
				sql_stmt_list();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			match(EOF);
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

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Insert_stmtContext> insert_stmt() {
			return getRuleContexts(Insert_stmtContext.class);
		}
		public Insert_stmtContext insert_stmt(int i) {
			return getRuleContext(Insert_stmtContext.class,i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItnmDumpListener ) ((ItnmDumpListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItnmDumpListener ) ((ItnmDumpListener)listener).exitSql_stmt_list(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(32);
				match(SCOL);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			insert_stmt();
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(40); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(39);
						match(SCOL);
						}
						}
						setState(42); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(44);
					insert_stmt();
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(50);
					match(SCOL);
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class Database_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ItnmDumpParser.IDENTIFIER, 0); }
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItnmDumpListener ) ((ItnmDumpListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItnmDumpListener ) ((ItnmDumpListener)listener).exitDatabase_name(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(IDENTIFIER);
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

	public static class Table_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ItnmDumpParser.IDENTIFIER, 0); }
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItnmDumpListener ) ((ItnmDumpListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItnmDumpListener ) ((ItnmDumpListener)listener).exitTable_name(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(IDENTIFIER);
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

	public static class Column_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ItnmDumpParser.IDENTIFIER, 0); }
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItnmDumpListener ) ((ItnmDumpListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItnmDumpListener ) ((ItnmDumpListener)listener).exitColumn_name(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(IDENTIFIER);
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

	public static class Key_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ItnmDumpParser.IDENTIFIER, 0); }
		public Key_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItnmDumpListener ) ((ItnmDumpListener)listener).enterKey_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItnmDumpListener ) ((ItnmDumpListener)listener).exitKey_name(this);
		}
	}

	public final Key_nameContext key_name() throws RecognitionException {
		Key_nameContext _localctx = new Key_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_key_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(IDENTIFIER);
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

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(ItnmDumpParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ItnmDumpParser.STRING_LITERAL, 0); }
		public TerminalNode EMPTY_STRING() { return getToken(ItnmDumpParser.EMPTY_STRING, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItnmDumpListener ) ((ItnmDumpListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItnmDumpListener ) ((ItnmDumpListener)listener).exitLiteral_value(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_LITERAL) | (1L << STRING_LITERAL) | (1L << EMPTY_STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Oql_hashContext oql_hash() {
			return getRuleContext(Oql_hashContext.class,0);
		}
		public Oql_arrayContext oql_array() {
			return getRuleContext(Oql_arrayContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItnmDumpListener ) ((ItnmDumpListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItnmDumpListener ) ((ItnmDumpListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr);
		try {
			setState(69);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case EMPTY_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				literal_value();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				oql_hash();
				}
				break;
			case OPEN_SQUARE:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				oql_array();
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

	public static class Oql_kvContext extends ParserRuleContext {
		public Key_nameContext key_name() {
			return getRuleContext(Key_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Oql_kvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oql_kv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItnmDumpListener ) ((ItnmDumpListener)listener).enterOql_kv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItnmDumpListener ) ((ItnmDumpListener)listener).exitOql_kv(this);
		}
	}

	public final Oql_kvContext oql_kv() throws RecognitionException {
		Oql_kvContext _localctx = new Oql_kvContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_oql_kv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			key_name();
			setState(72);
			match(ASSIGN);
			setState(73);
			expr();
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

	public static class Oql_hashContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(ItnmDumpParser.OPEN_BRACE, 0); }
		public List<Oql_kvContext> oql_kv() {
			return getRuleContexts(Oql_kvContext.class);
		}
		public Oql_kvContext oql_kv(int i) {
			return getRuleContext(Oql_kvContext.class,i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(ItnmDumpParser.CLOSE_BRACE, 0); }
		public Oql_hashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oql_hash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItnmDumpListener ) ((ItnmDumpListener)listener).enterOql_hash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItnmDumpListener ) ((ItnmDumpListener)listener).exitOql_hash(this);
		}
	}

	public final Oql_hashContext oql_hash() throws RecognitionException {
		Oql_hashContext _localctx = new Oql_hashContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_oql_hash);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(OPEN_BRACE);
			setState(76);
			oql_kv();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(77);
				match(COMMA);
				setState(78);
				oql_kv();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			match(CLOSE_BRACE);
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

	public static class Oql_arrayContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE() { return getToken(ItnmDumpParser.OPEN_SQUARE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_SQUARE() { return getToken(ItnmDumpParser.CLOSE_SQUARE, 0); }
		public Oql_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oql_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItnmDumpListener ) ((ItnmDumpListener)listener).enterOql_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItnmDumpListener ) ((ItnmDumpListener)listener).exitOql_array(this);
		}
	}

	public final Oql_arrayContext oql_array() throws RecognitionException {
		Oql_arrayContext _localctx = new Oql_arrayContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_oql_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(OPEN_SQUARE);
			setState(87);
			expr();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(88);
				match(COMMA);
				setState(89);
				expr();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			match(CLOSE_SQUARE);
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

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode K_INSERT() { return getToken(ItnmDumpParser.K_INSERT, 0); }
		public TerminalNode K_INTO() { return getToken(ItnmDumpParser.K_INTO, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_VALUES() { return getToken(ItnmDumpParser.K_VALUES, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItnmDumpListener ) ((ItnmDumpListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItnmDumpListener ) ((ItnmDumpListener)listener).exitInsert_stmt(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(K_INSERT);
			setState(98);
			match(K_INTO);
			setState(99);
			database_name();
			setState(100);
			match(DOT);
			setState(101);
			table_name();
			setState(113);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(102);
				match(OPEN_PAR);
				setState(103);
				column_name();
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(104);
					match(COMMA);
					setState(105);
					column_name();
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(111);
				match(CLOSE_PAR);
				}
			}

			{
			setState(115);
			match(K_VALUES);
			setState(116);
			match(OPEN_PAR);
			setState(117);
			expr();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(118);
				match(COMMA);
				setState(119);
				expr();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(CLOSE_PAR);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(126);
				match(COMMA);
				setState(127);
				match(OPEN_PAR);
				setState(128);
				expr();
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(129);
					match(COMMA);
					setState(130);
					expr();
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(136);
				match(CLOSE_PAR);
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u0092\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\3\2\3\3\7\3$\n"+
		"\3\f\3\16\3\'\13\3\3\3\3\3\6\3+\n\3\r\3\16\3,\3\3\7\3\60\n\3\f\3\16\3"+
		"\63\13\3\3\3\7\3\66\n\3\f\3\16\39\13\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\t\5\tH\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13"+
		"R\n\13\f\13\16\13U\13\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f]\n\f\f\f\16\f`"+
		"\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\rm\n\r\f\r\16\rp\13"+
		"\r\3\r\3\r\5\rt\n\r\3\r\3\r\3\r\3\r\3\r\7\r{\n\r\f\r\16\r~\13\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\7\r\u0086\n\r\f\r\16\r\u0089\13\r\3\r\3\r\7\r\u008d"+
		"\n\r\f\r\16\r\u0090\13\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\3"+
		"\4\2##%&\u0093\2\35\3\2\2\2\4%\3\2\2\2\6:\3\2\2\2\b<\3\2\2\2\n>\3\2\2"+
		"\2\f@\3\2\2\2\16B\3\2\2\2\20G\3\2\2\2\22I\3\2\2\2\24M\3\2\2\2\26X\3\2"+
		"\2\2\30c\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2"+
		"\2\35\36\3\2\2\2\36 \3\2\2\2\37\35\3\2\2\2 !\7\2\2\3!\3\3\2\2\2\"$\7\4"+
		"\2\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2(\61"+
		"\5\30\r\2)+\7\4\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-.\3\2\2\2"+
		".\60\5\30\r\2/*\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\67"+
		"\3\2\2\2\63\61\3\2\2\2\64\66\7\4\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3"+
		"\2\2\2\678\3\2\2\28\5\3\2\2\29\67\3\2\2\2:;\7\"\2\2;\7\3\2\2\2<=\7\"\2"+
		"\2=\t\3\2\2\2>?\7\"\2\2?\13\3\2\2\2@A\7\"\2\2A\r\3\2\2\2BC\t\2\2\2C\17"+
		"\3\2\2\2DH\5\16\b\2EH\5\24\13\2FH\5\26\f\2GD\3\2\2\2GE\3\2\2\2GF\3\2\2"+
		"\2H\21\3\2\2\2IJ\5\f\7\2JK\7\r\2\2KL\5\20\t\2L\23\3\2\2\2MN\7\b\2\2NS"+
		"\5\22\n\2OP\7\f\2\2PR\5\22\n\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2"+
		"TV\3\2\2\2US\3\2\2\2VW\7\t\2\2W\25\3\2\2\2XY\7\n\2\2Y^\5\20\t\2Z[\7\f"+
		"\2\2[]\5\20\t\2\\Z\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^"+
		"\3\2\2\2ab\7\13\2\2b\27\3\2\2\2cd\7\37\2\2de\7 \2\2ef\5\6\4\2fg\7\5\2"+
		"\2gs\5\b\5\2hi\7\6\2\2in\5\n\6\2jk\7\f\2\2km\5\n\6\2lj\3\2\2\2mp\3\2\2"+
		"\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7\7\2\2rt\3\2\2\2sh\3\2\2"+
		"\2st\3\2\2\2tu\3\2\2\2uv\7!\2\2vw\7\6\2\2w|\5\20\t\2xy\7\f\2\2y{\5\20"+
		"\t\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177"+
		"\u008e\7\7\2\2\u0080\u0081\7\f\2\2\u0081\u0082\7\6\2\2\u0082\u0087\5\20"+
		"\t\2\u0083\u0084\7\f\2\2\u0084\u0086\5\20\t\2\u0085\u0083\3\2\2\2\u0086"+
		"\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\7\2\2\u008b\u008d\3\2\2\2\u008c"+
		"\u0080\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\31\3\2\2\2\u0090\u008e\3\2\2\2\17\35%,\61\67GS^ns|\u0087\u008e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}