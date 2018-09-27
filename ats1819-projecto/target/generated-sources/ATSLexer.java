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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, STRING=9, 
		DATA=10, DIGIT=11, NUM=12, DECIMAL=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "STRING", 
		"DATA", "DIGIT", "NUM", "DECIMAL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'registar condutor'", "'registar cliente'", "'registar empresa'", 
		"'login'", "'('", "','", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "STRING", "DATA", 
		"DIGIT", "NUM", "DECIMAL", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u0097\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\7\nf\n\n\f\n\16\ni\13\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13s\n\13\3\13\3\13\3\13\5\13x\n"+
		"\13\3\13\3\13\3\f\3\f\3\r\7\r\177\n\r\f\r\16\r\u0082\13\r\3\16\6\16\u0085"+
		"\n\16\r\16\16\16\u0086\3\16\3\16\6\16\u008b\n\16\r\16\16\16\u008c\5\16"+
		"\u008f\n\16\3\17\6\17\u0092\n\17\r\17\16\17\u0093\3\17\3\17\2\2\20\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2"+
		"\5\4\2$$^^\3\2\62;\5\2\13\f\17\17\"\"\2\u009f\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7\63\3\2\2\2\tD\3\2\2\2\13U\3"+
		"\2\2\2\r[\3\2\2\2\17]\3\2\2\2\21_\3\2\2\2\23a\3\2\2\2\25l\3\2\2\2\27{"+
		"\3\2\2\2\31\u0080\3\2\2\2\33\u0084\3\2\2\2\35\u0091\3\2\2\2\37 \7=\2\2"+
		" \4\3\2\2\2!\"\7t\2\2\"#\7g\2\2#$\7i\2\2$%\7k\2\2%&\7u\2\2&\'\7v\2\2\'"+
		"(\7c\2\2()\7t\2\2)*\7\"\2\2*+\7e\2\2+,\7q\2\2,-\7p\2\2-.\7f\2\2./\7w\2"+
		"\2/\60\7v\2\2\60\61\7q\2\2\61\62\7t\2\2\62\6\3\2\2\2\63\64\7t\2\2\64\65"+
		"\7g\2\2\65\66\7i\2\2\66\67\7k\2\2\678\7u\2\289\7v\2\29:\7c\2\2:;\7t\2"+
		"\2;<\7\"\2\2<=\7e\2\2=>\7n\2\2>?\7k\2\2?@\7g\2\2@A\7p\2\2AB\7v\2\2BC\7"+
		"g\2\2C\b\3\2\2\2DE\7t\2\2EF\7g\2\2FG\7i\2\2GH\7k\2\2HI\7u\2\2IJ\7v\2\2"+
		"JK\7c\2\2KL\7t\2\2LM\7\"\2\2MN\7g\2\2NO\7o\2\2OP\7r\2\2PQ\7t\2\2QR\7g"+
		"\2\2RS\7u\2\2ST\7c\2\2T\n\3\2\2\2UV\7n\2\2VW\7q\2\2WX\7i\2\2XY\7k\2\2"+
		"YZ\7p\2\2Z\f\3\2\2\2[\\\7*\2\2\\\16\3\2\2\2]^\7.\2\2^\20\3\2\2\2_`\7+"+
		"\2\2`\22\3\2\2\2ag\7$\2\2bf\n\2\2\2cd\7^\2\2df\t\2\2\2eb\3\2\2\2ec\3\2"+
		"\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7$\2\2k\24\3"+
		"\2\2\2lm\5\27\f\2mn\5\27\f\2no\5\27\f\2op\5\27\f\2pr\7/\2\2qs\5\27\f\2"+
		"rq\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\5\27\f\2uw\7/\2\2vx\5\27\f\2wv\3\2\2"+
		"\2wx\3\2\2\2xy\3\2\2\2yz\5\27\f\2z\26\3\2\2\2{|\t\3\2\2|\30\3\2\2\2}\177"+
		"\t\3\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2"+
		"\2\u0081\32\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0085\t\3\2\2\u0084\u0083"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u008e\3\2\2\2\u0088\u008a\7\60\2\2\u0089\u008b\t\3\2\2\u008a\u0089\3"+
		"\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008f\3\2\2\2\u008e\u0088\3\2\2\2\u008e\u008f\3\2\2\2\u008f\34\3\2\2"+
		"\2\u0090\u0092\t\4\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\b\17\2\2"+
		"\u0096\36\3\2\2\2\f\2egrw\u0080\u0086\u008c\u008e\u0093\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}