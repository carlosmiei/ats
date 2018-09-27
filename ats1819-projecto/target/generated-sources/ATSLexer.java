// Generated from src/antlr4/ATS.g4 by ANTLR 4.7.1

  import java.awt.geom.Point2D;
  import java.time.LocalDate;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ATSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		STRING=10, DATA=11, DIGIT=12, NUM=13, DECIMAL=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"STRING", "DATA", "DIGIT", "NUM", "DECIMAL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'registar condutor'", "'registar cliente'", "'registar empresa'", 
		"'login'", "'('", "','", "')'", "'logout'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "STRING", 
		"DATA", "DIGIT", "NUM", "DECIMAL", "WS"
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


	 UMeR umer;
	 Client client;
	 Driver driver;
	 User user;
	 String key;
	 String cla;
	 Point2D.Double start= new Point2D.Double();

	  private String unquote(String str) {
	    return str.substring(1,str.length()-1);
	  }


	public ATSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ATS.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u00a0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\7\13o\n\13\f\13\16\13r\13\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f|\n\f\3\f\3\f\3\f\5\f\u0081\n\f\3\f\3\f\3\r\3\r\3\16\7\16"+
		"\u0088\n\16\f\16\16\16\u008b\13\16\3\17\6\17\u008e\n\17\r\17\16\17\u008f"+
		"\3\17\3\17\6\17\u0094\n\17\r\17\16\17\u0095\5\17\u0098\n\17\3\20\6\20"+
		"\u009b\n\20\r\20\16\20\u009c\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\5\4\2$$^^\3\2\62"+
		";\5\2\13\f\17\17\"\"\2\u00a8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7\65\3\2\2\2\tF\3\2\2\2\13W\3\2\2\2\r]"+
		"\3\2\2\2\17_\3\2\2\2\21a\3\2\2\2\23c\3\2\2\2\25j\3\2\2\2\27u\3\2\2\2\31"+
		"\u0084\3\2\2\2\33\u0089\3\2\2\2\35\u008d\3\2\2\2\37\u009a\3\2\2\2!\"\7"+
		"=\2\2\"\4\3\2\2\2#$\7t\2\2$%\7g\2\2%&\7i\2\2&\'\7k\2\2\'(\7u\2\2()\7v"+
		"\2\2)*\7c\2\2*+\7t\2\2+,\7\"\2\2,-\7e\2\2-.\7q\2\2./\7p\2\2/\60\7f\2\2"+
		"\60\61\7w\2\2\61\62\7v\2\2\62\63\7q\2\2\63\64\7t\2\2\64\6\3\2\2\2\65\66"+
		"\7t\2\2\66\67\7g\2\2\678\7i\2\289\7k\2\29:\7u\2\2:;\7v\2\2;<\7c\2\2<="+
		"\7t\2\2=>\7\"\2\2>?\7e\2\2?@\7n\2\2@A\7k\2\2AB\7g\2\2BC\7p\2\2CD\7v\2"+
		"\2DE\7g\2\2E\b\3\2\2\2FG\7t\2\2GH\7g\2\2HI\7i\2\2IJ\7k\2\2JK\7u\2\2KL"+
		"\7v\2\2LM\7c\2\2MN\7t\2\2NO\7\"\2\2OP\7g\2\2PQ\7o\2\2QR\7r\2\2RS\7t\2"+
		"\2ST\7g\2\2TU\7u\2\2UV\7c\2\2V\n\3\2\2\2WX\7n\2\2XY\7q\2\2YZ\7i\2\2Z["+
		"\7k\2\2[\\\7p\2\2\\\f\3\2\2\2]^\7*\2\2^\16\3\2\2\2_`\7.\2\2`\20\3\2\2"+
		"\2ab\7+\2\2b\22\3\2\2\2cd\7n\2\2de\7q\2\2ef\7i\2\2fg\7q\2\2gh\7w\2\2h"+
		"i\7v\2\2i\24\3\2\2\2jp\7$\2\2ko\n\2\2\2lm\7^\2\2mo\t\2\2\2nk\3\2\2\2n"+
		"l\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7$\2\2t"+
		"\26\3\2\2\2uv\5\31\r\2vw\5\31\r\2wx\5\31\r\2xy\5\31\r\2y{\7/\2\2z|\5\31"+
		"\r\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\5\31\r\2~\u0080\7/\2\2\177\u0081"+
		"\5\31\r\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0083\5\31\r\2\u0083\30\3\2\2\2\u0084\u0085\t\3\2\2\u0085\32\3\2\2\2"+
		"\u0086\u0088\t\3\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\34\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008e\t\3\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\u0097\3\2\2\2\u0091\u0093\7\60\2\2\u0092"+
		"\u0094\t\3\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0091\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\36\3\2\2\2\u0099\u009b\t\4\2\2\u009a\u0099\3\2\2"+
		"\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\u009f\b\20\2\2\u009f \3\2\2\2\f\2np{\u0080\u0089\u008f"+
		"\u0095\u0097\u009c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}