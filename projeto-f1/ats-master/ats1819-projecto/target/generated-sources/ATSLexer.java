// Generated from src/antlr4/ATS.g4 by ANTLR 4.7.1

  import java.awt.geom.Point2D;
  import java.time.LocalDate;
  import java.util.concurrent.ThreadLocalRandom;
  import java.util.*;

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
		T__9=10, STRING=11, DATA=12, DIGIT=13, NUM=14, DECIMAL=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "STRING", "DATA", "DIGIT", "NUM", "DECIMAL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'registar condutor'", "'registar cliente'", "'registar empresa'", 
		"'login'", "'solicitar'", "'viajar'", "'('", "','", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "STRING", 
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
	 int contadormatriculas=1;
	 Vehicle car;
	 Trip trip;
	 ArrayList<Trip> viagensSolicitadas;

	  private String unquote(String str) {
	    return str.substring(1,str.length()-1);
	  }

	  private Trip viajar(String key) {
	    Trip remover=null;int stop=0;
	    for (Trip object: viagensSolicitadas) {

	          if((object.getDriver().equals(key)) && stop==0 ){
	            remover=object;
	            stop=1;
	          }
	    }

	    Boolean res = viagensSolicitadas.remove(remover);
	    return remover;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u00ac\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\7\f{"+
		"\n\f\f\f\16\f~\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0088\n\r\3\r"+
		"\3\r\3\r\5\r\u008d\n\r\3\r\3\r\3\16\3\16\3\17\7\17\u0094\n\17\f\17\16"+
		"\17\u0097\13\17\3\20\6\20\u009a\n\20\r\20\16\20\u009b\3\20\3\20\6\20\u00a0"+
		"\n\20\r\20\16\20\u00a1\5\20\u00a4\n\20\3\21\6\21\u00a7\n\21\r\21\16\21"+
		"\u00a8\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22\3\2\5\4\2$$^^\3\2\62;\5\2\13\f\17\17"+
		"\"\"\2\u00b4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\3#\3\2\2\2\5%\3\2\2\2\7\67\3\2\2\2\tH\3\2\2\2\13Y\3\2\2\2\r_\3\2"+
		"\2\2\17i\3\2\2\2\21p\3\2\2\2\23r\3\2\2\2\25t\3\2\2\2\27v\3\2\2\2\31\u0081"+
		"\3\2\2\2\33\u0090\3\2\2\2\35\u0095\3\2\2\2\37\u0099\3\2\2\2!\u00a6\3\2"+
		"\2\2#$\7=\2\2$\4\3\2\2\2%&\7t\2\2&\'\7g\2\2\'(\7i\2\2()\7k\2\2)*\7u\2"+
		"\2*+\7v\2\2+,\7c\2\2,-\7t\2\2-.\7\"\2\2./\7e\2\2/\60\7q\2\2\60\61\7p\2"+
		"\2\61\62\7f\2\2\62\63\7w\2\2\63\64\7v\2\2\64\65\7q\2\2\65\66\7t\2\2\66"+
		"\6\3\2\2\2\678\7t\2\289\7g\2\29:\7i\2\2:;\7k\2\2;<\7u\2\2<=\7v\2\2=>\7"+
		"c\2\2>?\7t\2\2?@\7\"\2\2@A\7e\2\2AB\7n\2\2BC\7k\2\2CD\7g\2\2DE\7p\2\2"+
		"EF\7v\2\2FG\7g\2\2G\b\3\2\2\2HI\7t\2\2IJ\7g\2\2JK\7i\2\2KL\7k\2\2LM\7"+
		"u\2\2MN\7v\2\2NO\7c\2\2OP\7t\2\2PQ\7\"\2\2QR\7g\2\2RS\7o\2\2ST\7r\2\2"+
		"TU\7t\2\2UV\7g\2\2VW\7u\2\2WX\7c\2\2X\n\3\2\2\2YZ\7n\2\2Z[\7q\2\2[\\\7"+
		"i\2\2\\]\7k\2\2]^\7p\2\2^\f\3\2\2\2_`\7u\2\2`a\7q\2\2ab\7n\2\2bc\7k\2"+
		"\2cd\7e\2\2de\7k\2\2ef\7v\2\2fg\7c\2\2gh\7t\2\2h\16\3\2\2\2ij\7x\2\2j"+
		"k\7k\2\2kl\7c\2\2lm\7l\2\2mn\7c\2\2no\7t\2\2o\20\3\2\2\2pq\7*\2\2q\22"+
		"\3\2\2\2rs\7.\2\2s\24\3\2\2\2tu\7+\2\2u\26\3\2\2\2v|\7$\2\2w{\n\2\2\2"+
		"xy\7^\2\2y{\t\2\2\2zw\3\2\2\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2"+
		"}\177\3\2\2\2~|\3\2\2\2\177\u0080\7$\2\2\u0080\30\3\2\2\2\u0081\u0082"+
		"\5\33\16\2\u0082\u0083\5\33\16\2\u0083\u0084\5\33\16\2\u0084\u0085\5\33"+
		"\16\2\u0085\u0087\7/\2\2\u0086\u0088\5\33\16\2\u0087\u0086\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\5\33\16\2\u008a\u008c\7"+
		"/\2\2\u008b\u008d\5\33\16\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\5\33\16\2\u008f\32\3\2\2\2\u0090\u0091\t\3"+
		"\2\2\u0091\34\3\2\2\2\u0092\u0094\t\3\2\2\u0093\u0092\3\2\2\2\u0094\u0097"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\36\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u009a\t\3\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a3\3\2\2\2\u009d"+
		"\u009f\7\60\2\2\u009e\u00a0\t\3\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3"+
		"\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3"+
		"\u009d\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4 \3\2\2\2\u00a5\u00a7\t\4\2\2"+
		"\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\b\21\2\2\u00ab\"\3\2\2\2\f\2"+
		"z|\u0087\u008c\u0095\u009b\u00a1\u00a3\u00a8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}