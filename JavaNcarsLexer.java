// Generated from JavaNcars.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaNcarsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, RETURN=4, INT=5, VOID=6, IF=7, ELSE=8, FOR=9, 
		DECIMAL_LITERAL=10, IDENTIFIER=11, WHITESPACE=12, ADD=13, SUB=14, ASSIGN=15, 
		SEMI=16, LPAREN=17, RPAREN=18, LBRACE=19, RBRACE=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "RETURN", "INT", "VOID", "IF", "ELSE", "FOR", 
			"DECIMAL_LITERAL", "IDENTIFIER", "WHITESPACE", "ADD", "SUB", "ASSIGN", 
			"SEMI", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LetterOrDigit", "Letter", 
			"Digit", "Dot"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "','", "':'", "'return'", "'int'", "'void'", "'if'", 
			"'else'", "'for'", null, null, null, "'+'", "'-'", "'='", "';'", "'('", 
			"')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "RETURN", "INT", "VOID", "IF", "ELSE", "FOR", 
			"DECIMAL_LITERAL", "IDENTIFIER", "WHITESPACE", "ADD", "SUB", "ASSIGN", 
			"SEMI", "LPAREN", "RPAREN", "LBRACE", "RBRACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public JavaNcarsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaNcars.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u0088\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13]\n\13\f\13\16\13`\13\13\5\13b\n"+
		"\13\3\f\3\f\7\ff\n\f\f\f\16\fi\13\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\5\26\u0081\n\26\3\27\3\27\3\30\3\30\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\2-\2/\2\61\2\3\2\6\3\2\63;\5\2\13\f\17\17\"\"\4\2C\\c|\3\2"+
		"\62;\2\u0087\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3\63\3\2\2\2\59\3\2"+
		"\2\2\7;\3\2\2\2\t=\3\2\2\2\13D\3\2\2\2\rH\3\2\2\2\17M\3\2\2\2\21P\3\2"+
		"\2\2\23U\3\2\2\2\25a\3\2\2\2\27c\3\2\2\2\31j\3\2\2\2\33n\3\2\2\2\35p\3"+
		"\2\2\2\37r\3\2\2\2!t\3\2\2\2#v\3\2\2\2%x\3\2\2\2\'z\3\2\2\2)|\3\2\2\2"+
		"+\u0080\3\2\2\2-\u0082\3\2\2\2/\u0084\3\2\2\2\61\u0086\3\2\2\2\63\64\7"+
		"r\2\2\64\65\7t\2\2\65\66\7k\2\2\66\67\7p\2\2\678\7v\2\28\4\3\2\2\29:\7"+
		".\2\2:\6\3\2\2\2;<\7<\2\2<\b\3\2\2\2=>\7t\2\2>?\7g\2\2?@\7v\2\2@A\7w\2"+
		"\2AB\7t\2\2BC\7p\2\2C\n\3\2\2\2DE\7k\2\2EF\7p\2\2FG\7v\2\2G\f\3\2\2\2"+
		"HI\7x\2\2IJ\7q\2\2JK\7k\2\2KL\7f\2\2L\16\3\2\2\2MN\7k\2\2NO\7h\2\2O\20"+
		"\3\2\2\2PQ\7g\2\2QR\7n\2\2RS\7u\2\2ST\7g\2\2T\22\3\2\2\2UV\7h\2\2VW\7"+
		"q\2\2WX\7t\2\2X\24\3\2\2\2Yb\7\62\2\2Z^\t\2\2\2[]\5/\30\2\\[\3\2\2\2]"+
		"`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_b\3\2\2\2`^\3\2\2\2aY\3\2\2\2aZ\3\2\2\2"+
		"b\26\3\2\2\2cg\5-\27\2df\5+\26\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2"+
		"\2h\30\3\2\2\2ig\3\2\2\2jk\t\3\2\2kl\3\2\2\2lm\b\r\2\2m\32\3\2\2\2no\7"+
		"-\2\2o\34\3\2\2\2pq\7/\2\2q\36\3\2\2\2rs\7?\2\2s \3\2\2\2tu\7=\2\2u\""+
		"\3\2\2\2vw\7*\2\2w$\3\2\2\2xy\7+\2\2y&\3\2\2\2z{\7}\2\2{(\3\2\2\2|}\7"+
		"\177\2\2}*\3\2\2\2~\u0081\5-\27\2\177\u0081\5/\30\2\u0080~\3\2\2\2\u0080"+
		"\177\3\2\2\2\u0081,\3\2\2\2\u0082\u0083\t\4\2\2\u0083.\3\2\2\2\u0084\u0085"+
		"\t\5\2\2\u0085\60\3\2\2\2\u0086\u0087\7\60\2\2\u0087\62\3\2\2\2\7\2^a"+
		"g\u0080\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}