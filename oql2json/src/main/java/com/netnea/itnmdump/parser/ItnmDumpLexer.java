// Generated from ../grammar/ItnmDump.g4 by ANTLR 4.5
package com.netnea.itnmdump.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ItnmDumpLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SPACES", "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "OPEN_BRACE", "CLOSE_BRACE", 
		"OPEN_SQUARE", "CLOSE_SQUARE", "COMMA", "ASSIGN", "STAR", "PLUS", "MINUS", 
		"TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", "PIPE", "LT", "LT_EQ", 
		"GT", "GT_EQ", "NOT_EQ1", "NOT_EQ2", "K_INSERT", "K_INTO", "K_VALUES", 
		"IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", "EMPTY_STRING", 
		"SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "UNEXPECTED_CHAR", "DIGIT", 
		"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
		"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
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


	public ItnmDumpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ItnmDump.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2)\u0194\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 "+
		"\3!\3!\3!\3!\7!\u00e0\n!\f!\16!\u00e3\13!\3!\3!\3!\7!\u00e8\n!\f!\16!"+
		"\u00eb\13!\5!\u00ed\n!\3\"\6\"\u00f0\n\"\r\"\16\"\u00f1\3\"\3\"\7\"\u00f6"+
		"\n\"\f\"\16\"\u00f9\13\"\5\"\u00fb\n\"\3\"\3\"\5\"\u00ff\n\"\3\"\6\"\u0102"+
		"\n\"\r\"\16\"\u0103\5\"\u0106\n\"\3\"\3\"\6\"\u010a\n\"\r\"\16\"\u010b"+
		"\3\"\3\"\5\"\u0110\n\"\3\"\6\"\u0113\n\"\r\"\16\"\u0114\5\"\u0117\n\""+
		"\5\"\u0119\n\"\3#\3#\7#\u011d\n#\f#\16#\u0120\13#\3#\3#\5#\u0124\n#\3"+
		"$\3$\3$\3$\7$\u012a\n$\f$\16$\u012d\13$\3$\3$\3$\3$\3$\7$\u0134\n$\f$"+
		"\16$\u0137\13$\3$\5$\u013a\n$\3%\3%\3%\3%\5%\u0140\n%\3&\3&\3&\3&\7&\u0146"+
		"\n&\f&\16&\u0149\13&\3&\3&\3\'\3\'\3\'\3\'\7\'\u0151\n\'\f\'\16\'\u0154"+
		"\13\'\3\'\3\'\3\'\5\'\u0159\n\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,"+
		"\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3"+
		"\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3"+
		">\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3\u0152\2D\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q\2S"+
		"\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177"+
		"\2\u0081\2\u0083\2\u0085\2\3\2&\5\2\13\r\17\17\"\"\3\2bb\5\2C\\aac|\6"+
		"\2\62;C\\aac|\4\2--//\5\2&&<<BB\3\2))\3\2$$\4\2\f\f\17\17\3\2\62;\4\2"+
		"CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4"+
		"\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTt"+
		"t\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\u0192"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3\u0087\3\2\2\2\5\u008b"+
		"\3\2\2\2\7\u008d\3\2\2\2\t\u008f\3\2\2\2\13\u0091\3\2\2\2\r\u0093\3\2"+
		"\2\2\17\u0095\3\2\2\2\21\u0097\3\2\2\2\23\u0099\3\2\2\2\25\u009b\3\2\2"+
		"\2\27\u009d\3\2\2\2\31\u009f\3\2\2\2\33\u00a1\3\2\2\2\35\u00a3\3\2\2\2"+
		"\37\u00a5\3\2\2\2!\u00a7\3\2\2\2#\u00aa\3\2\2\2%\u00ac\3\2\2\2\'\u00ae"+
		"\3\2\2\2)\u00b1\3\2\2\2+\u00b4\3\2\2\2-\u00b6\3\2\2\2/\u00b8\3\2\2\2\61"+
		"\u00ba\3\2\2\2\63\u00bd\3\2\2\2\65\u00bf\3\2\2\2\67\u00c2\3\2\2\29\u00c5"+
		"\3\2\2\2;\u00c8\3\2\2\2=\u00cf\3\2\2\2?\u00d4\3\2\2\2A\u00ec\3\2\2\2C"+
		"\u0118\3\2\2\2E\u0123\3\2\2\2G\u0139\3\2\2\2I\u013f\3\2\2\2K\u0141\3\2"+
		"\2\2M\u014c\3\2\2\2O\u015c\3\2\2\2Q\u015e\3\2\2\2S\u0160\3\2\2\2U\u0162"+
		"\3\2\2\2W\u0164\3\2\2\2Y\u0166\3\2\2\2[\u0168\3\2\2\2]\u016a\3\2\2\2_"+
		"\u016c\3\2\2\2a\u016e\3\2\2\2c\u0170\3\2\2\2e\u0172\3\2\2\2g\u0174\3\2"+
		"\2\2i\u0176\3\2\2\2k\u0178\3\2\2\2m\u017a\3\2\2\2o\u017c\3\2\2\2q\u017e"+
		"\3\2\2\2s\u0180\3\2\2\2u\u0182\3\2\2\2w\u0184\3\2\2\2y\u0186\3\2\2\2{"+
		"\u0188\3\2\2\2}\u018a\3\2\2\2\177\u018c\3\2\2\2\u0081\u018e\3\2\2\2\u0083"+
		"\u0190\3\2\2\2\u0085\u0192\3\2\2\2\u0087\u0088\t\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u008a\b\2\2\2\u008a\4\3\2\2\2\u008b\u008c\7=\2\2\u008c\6\3"+
		"\2\2\2\u008d\u008e\7\60\2\2\u008e\b\3\2\2\2\u008f\u0090\7*\2\2\u0090\n"+
		"\3\2\2\2\u0091\u0092\7+\2\2\u0092\f\3\2\2\2\u0093\u0094\7}\2\2\u0094\16"+
		"\3\2\2\2\u0095\u0096\7\177\2\2\u0096\20\3\2\2\2\u0097\u0098\7]\2\2\u0098"+
		"\22\3\2\2\2\u0099\u009a\7_\2\2\u009a\24\3\2\2\2\u009b\u009c\7.\2\2\u009c"+
		"\26\3\2\2\2\u009d\u009e\7?\2\2\u009e\30\3\2\2\2\u009f\u00a0\7,\2\2\u00a0"+
		"\32\3\2\2\2\u00a1\u00a2\7-\2\2\u00a2\34\3\2\2\2\u00a3\u00a4\7/\2\2\u00a4"+
		"\36\3\2\2\2\u00a5\u00a6\7\u0080\2\2\u00a6 \3\2\2\2\u00a7\u00a8\7~\2\2"+
		"\u00a8\u00a9\7~\2\2\u00a9\"\3\2\2\2\u00aa\u00ab\7\61\2\2\u00ab$\3\2\2"+
		"\2\u00ac\u00ad\7\'\2\2\u00ad&\3\2\2\2\u00ae\u00af\7>\2\2\u00af\u00b0\7"+
		">\2\2\u00b0(\3\2\2\2\u00b1\u00b2\7@\2\2\u00b2\u00b3\7@\2\2\u00b3*\3\2"+
		"\2\2\u00b4\u00b5\7(\2\2\u00b5,\3\2\2\2\u00b6\u00b7\7~\2\2\u00b7.\3\2\2"+
		"\2\u00b8\u00b9\7>\2\2\u00b9\60\3\2\2\2\u00ba\u00bb\7>\2\2\u00bb\u00bc"+
		"\7?\2\2\u00bc\62\3\2\2\2\u00bd\u00be\7@\2\2\u00be\64\3\2\2\2\u00bf\u00c0"+
		"\7@\2\2\u00c0\u00c1\7?\2\2\u00c1\66\3\2\2\2\u00c2\u00c3\7#\2\2\u00c3\u00c4"+
		"\7?\2\2\u00c48\3\2\2\2\u00c5\u00c6\7>\2\2\u00c6\u00c7\7@\2\2\u00c7:\3"+
		"\2\2\2\u00c8\u00c9\5c\62\2\u00c9\u00ca\5m\67\2\u00ca\u00cb\5w<\2\u00cb"+
		"\u00cc\5[.\2\u00cc\u00cd\5u;\2\u00cd\u00ce\5y=\2\u00ce<\3\2\2\2\u00cf"+
		"\u00d0\5c\62\2\u00d0\u00d1\5m\67\2\u00d1\u00d2\5y=\2\u00d2\u00d3\5o8\2"+
		"\u00d3>\3\2\2\2\u00d4\u00d5\5}?\2\u00d5\u00d6\5S*\2\u00d6\u00d7\5i\65"+
		"\2\u00d7\u00d8\5{>\2\u00d8\u00d9\5[.\2\u00d9\u00da\5w<\2\u00da@\3\2\2"+
		"\2\u00db\u00e1\7b\2\2\u00dc\u00e0\n\3\2\2\u00dd\u00de\7b\2\2\u00de\u00e0"+
		"\7b\2\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e4\u00ed\7b\2\2\u00e5\u00e9\t\4\2\2\u00e6\u00e8\t\5\2\2\u00e7"+
		"\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00db\3\2\2\2\u00ec"+
		"\u00e5\3\2\2\2\u00edB\3\2\2\2\u00ee\u00f0\5Q)\2\u00ef\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00fa\3\2"+
		"\2\2\u00f3\u00f7\7\60\2\2\u00f4\u00f6\5Q)\2\u00f5\u00f4\3\2\2\2\u00f6"+
		"\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fb\3\2"+
		"\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00f3\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u0105\3\2\2\2\u00fc\u00fe\5[.\2\u00fd\u00ff\t\6\2\2\u00fe\u00fd\3\2\2"+
		"\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u0102\5Q)\2\u0101\u0100"+
		"\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0106\3\2\2\2\u0105\u00fc\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0119\3\2"+
		"\2\2\u0107\u0109\7\60\2\2\u0108\u010a\5Q)\2\u0109\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0116\3\2"+
		"\2\2\u010d\u010f\5[.\2\u010e\u0110\t\6\2\2\u010f\u010e\3\2\2\2\u010f\u0110"+
		"\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u0113\5Q)\2\u0112\u0111\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2"+
		"\2\2\u0116\u010d\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118"+
		"\u00ef\3\2\2\2\u0118\u0107\3\2\2\2\u0119D\3\2\2\2\u011a\u011e\7A\2\2\u011b"+
		"\u011d\5Q)\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2"+
		"\2\u011e\u011f\3\2\2\2\u011f\u0124\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122"+
		"\t\7\2\2\u0122\u0124\5A!\2\u0123\u011a\3\2\2\2\u0123\u0121\3\2\2\2\u0124"+
		"F\3\2\2\2\u0125\u012b\7)\2\2\u0126\u012a\n\b\2\2\u0127\u0128\7)\2\2\u0128"+
		"\u012a\7)\2\2\u0129\u0126\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012d\3\2"+
		"\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012e\u013a\7)\2\2\u012f\u0135\7$\2\2\u0130\u0134\n\t\2"+
		"\2\u0131\u0132\7$\2\2\u0132\u0134\7$\2\2\u0133\u0130\3\2\2\2\u0133\u0131"+
		"\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013a\7$\2\2\u0139\u0125\3\2"+
		"\2\2\u0139\u012f\3\2\2\2\u013aH\3\2\2\2\u013b\u013c\7)\2\2\u013c\u0140"+
		"\7)\2\2\u013d\u013e\7$\2\2\u013e\u0140\7$\2\2\u013f\u013b\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u0140J\3\2\2\2\u0141\u0142\7/\2\2\u0142\u0143\7/\2\2\u0143"+
		"\u0147\3\2\2\2\u0144\u0146\n\n\2\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2"+
		"\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u014a\u014b\b&\2\2\u014bL\3\2\2\2\u014c\u014d\7\61\2\2"+
		"\u014d\u014e\7,\2\2\u014e\u0152\3\2\2\2\u014f\u0151\13\2\2\2\u0150\u014f"+
		"\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153"+
		"\u0158\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\7,\2\2\u0156\u0159\7\61"+
		"\2\2\u0157\u0159\7\2\2\3\u0158\u0155\3\2\2\2\u0158\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015b\b\'\2\2\u015bN\3\2\2\2\u015c\u015d\13\2\2\2"+
		"\u015dP\3\2\2\2\u015e\u015f\t\13\2\2\u015fR\3\2\2\2\u0160\u0161\t\f\2"+
		"\2\u0161T\3\2\2\2\u0162\u0163\t\r\2\2\u0163V\3\2\2\2\u0164\u0165\t\16"+
		"\2\2\u0165X\3\2\2\2\u0166\u0167\t\17\2\2\u0167Z\3\2\2\2\u0168\u0169\t"+
		"\20\2\2\u0169\\\3\2\2\2\u016a\u016b\t\21\2\2\u016b^\3\2\2\2\u016c\u016d"+
		"\t\22\2\2\u016d`\3\2\2\2\u016e\u016f\t\23\2\2\u016fb\3\2\2\2\u0170\u0171"+
		"\t\24\2\2\u0171d\3\2\2\2\u0172\u0173\t\25\2\2\u0173f\3\2\2\2\u0174\u0175"+
		"\t\26\2\2\u0175h\3\2\2\2\u0176\u0177\t\27\2\2\u0177j\3\2\2\2\u0178\u0179"+
		"\t\30\2\2\u0179l\3\2\2\2\u017a\u017b\t\31\2\2\u017bn\3\2\2\2\u017c\u017d"+
		"\t\32\2\2\u017dp\3\2\2\2\u017e\u017f\t\33\2\2\u017fr\3\2\2\2\u0180\u0181"+
		"\t\34\2\2\u0181t\3\2\2\2\u0182\u0183\t\35\2\2\u0183v\3\2\2\2\u0184\u0185"+
		"\t\36\2\2\u0185x\3\2\2\2\u0186\u0187\t\37\2\2\u0187z\3\2\2\2\u0188\u0189"+
		"\t \2\2\u0189|\3\2\2\2\u018a\u018b\t!\2\2\u018b~\3\2\2\2\u018c\u018d\t"+
		"\"\2\2\u018d\u0080\3\2\2\2\u018e\u018f\t#\2\2\u018f\u0082\3\2\2\2\u0190"+
		"\u0191\t$\2\2\u0191\u0084\3\2\2\2\u0192\u0193\t%\2\2\u0193\u0086\3\2\2"+
		"\2\35\2\u00df\u00e1\u00e9\u00ec\u00f1\u00f7\u00fa\u00fe\u0103\u0105\u010b"+
		"\u010f\u0114\u0116\u0118\u011e\u0123\u0129\u012b\u0133\u0135\u0139\u013f"+
		"\u0147\u0152\u0158\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}