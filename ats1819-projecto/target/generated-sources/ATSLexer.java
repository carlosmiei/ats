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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, STRING=8, DATA=9, 
		DIGIT=10, NUM=11, DECIMAL=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "STRING", "DATA", 
		"DIGIT", "NUM", "DECIMAL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'registar condutor'", "'registar cliente'", "'registar empresa'", 
		"'('", "','", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "STRING", "DATA", "DIGIT", 
		"NUM", "DECIMAL", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u008f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\7\t^\n\t\f\t\16\ta\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"k\n\n\3\n\3\n\3\n\5\np\n\n\3\n\3\n\3\13\3\13\3\f\7\fw\n\f\f\f\16\fz\13"+
		"\f\3\r\6\r}\n\r\r\r\16\r~\3\r\3\r\6\r\u0083\n\r\r\r\16\r\u0084\5\r\u0087"+
		"\n\r\3\16\6\16\u008a\n\16\r\16\16\16\u008b\3\16\3\16\2\2\17\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\5\4\2$$^^\3"+
		"\2\62;\5\2\13\f\17\17\"\"\2\u0097\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2"+
		"\2\5\37\3\2\2\2\7\61\3\2\2\2\tB\3\2\2\2\13S\3\2\2\2\rU\3\2\2\2\17W\3\2"+
		"\2\2\21Y\3\2\2\2\23d\3\2\2\2\25s\3\2\2\2\27x\3\2\2\2\31|\3\2\2\2\33\u0089"+
		"\3\2\2\2\35\36\7=\2\2\36\4\3\2\2\2\37 \7t\2\2 !\7g\2\2!\"\7i\2\2\"#\7"+
		"k\2\2#$\7u\2\2$%\7v\2\2%&\7c\2\2&\'\7t\2\2\'(\7\"\2\2()\7e\2\2)*\7q\2"+
		"\2*+\7p\2\2+,\7f\2\2,-\7w\2\2-.\7v\2\2./\7q\2\2/\60\7t\2\2\60\6\3\2\2"+
		"\2\61\62\7t\2\2\62\63\7g\2\2\63\64\7i\2\2\64\65\7k\2\2\65\66\7u\2\2\66"+
		"\67\7v\2\2\678\7c\2\289\7t\2\29:\7\"\2\2:;\7e\2\2;<\7n\2\2<=\7k\2\2=>"+
		"\7g\2\2>?\7p\2\2?@\7v\2\2@A\7g\2\2A\b\3\2\2\2BC\7t\2\2CD\7g\2\2DE\7i\2"+
		"\2EF\7k\2\2FG\7u\2\2GH\7v\2\2HI\7c\2\2IJ\7t\2\2JK\7\"\2\2KL\7g\2\2LM\7"+
		"o\2\2MN\7r\2\2NO\7t\2\2OP\7g\2\2PQ\7u\2\2QR\7c\2\2R\n\3\2\2\2ST\7*\2\2"+
		"T\f\3\2\2\2UV\7.\2\2V\16\3\2\2\2WX\7+\2\2X\20\3\2\2\2Y_\7$\2\2Z^\n\2\2"+
		"\2[\\\7^\2\2\\^\t\2\2\2]Z\3\2\2\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2"+
		"\2\2`b\3\2\2\2a_\3\2\2\2bc\7$\2\2c\22\3\2\2\2de\5\25\13\2ef\5\25\13\2"+
		"fg\5\25\13\2gh\5\25\13\2hj\7/\2\2ik\5\25\13\2ji\3\2\2\2jk\3\2\2\2kl\3"+
		"\2\2\2lm\5\25\13\2mo\7/\2\2np\5\25\13\2on\3\2\2\2op\3\2\2\2pq\3\2\2\2"+
		"qr\5\25\13\2r\24\3\2\2\2st\t\3\2\2t\26\3\2\2\2uw\t\3\2\2vu\3\2\2\2wz\3"+
		"\2\2\2xv\3\2\2\2xy\3\2\2\2y\30\3\2\2\2zx\3\2\2\2{}\t\3\2\2|{\3\2\2\2}"+
		"~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0086\3\2\2\2\u0080\u0082\7\60\2"+
		"\2\u0081\u0083\t\3\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0080\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\32\3\2\2\2\u0088\u008a\t\4\2\2\u0089\u0088\3\2\2"+
		"\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u008e\b\16\2\2\u008e\34\3\2\2\2\f\2]_jox~\u0084\u0086\u008b"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}