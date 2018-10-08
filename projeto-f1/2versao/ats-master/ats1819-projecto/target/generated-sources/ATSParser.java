// Generated from src/antlr4/ATS.g4 by ANTLR 4.7.1

    import java.awt.geom.Point2D;
    import java.time.LocalDate;
    import java.util.concurrent.ThreadLocalRandom;
    import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ATSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, VEICULO=16, 
		STRING=17, DATA=18, DIGIT=19, NUM=20, DECIMAL=21, WS=22;
	public static final int
		RULE_actions = 0, RULE_action = 1, RULE_registo = 2, RULE_registarCondutor = 3, 
		RULE_registarCliente = 4, RULE_registarEmpresa = 5, RULE_registarVeiculo = 6, 
		RULE_registarVeiculoEmpresa = 7, RULE_login = 8, RULE_solicitar = 9, RULE_viajar = 10, 
		RULE_recusar = 11, RULE_logout = 12, RULE_posicao = 13, RULE_end = 14;
	public static final String[] ruleNames = {
		"actions", "action", "registo", "registarCondutor", "registarCliente", 
		"registarEmpresa", "registarVeiculo", "registarVeiculoEmpresa", "login", 
		"solicitar", "viajar", "recusar", "logout", "posicao", "end"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'registar condutor'", "'registar cliente'", "'registar empresa'", 
		"'registar'", "'empresa'", "'login'", "'solicitar'", "'viajar'", "'recusar viagem'", 
		"'logout'", "'('", "','", "')'", "'EOF'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "VEICULO", "STRING", "DATA", "DIGIT", "NUM", "DECIMAL", 
		"WS"
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
	public String getGrammarFileName() { return "ATS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    UMeR umer;
	    Client client;
	    Driver driver;
	    User user;
	    String key;
	    String cla;
	    Point2D.Double start = new Point2D.Double();
	    int contadormatriculas = 1;
	    Vehicle car;
	    Trip trip;
	    ArrayList<Trip> viagensSolicitadas = new ArrayList<Trip>();
	    int contadorfinal;

	    private String unquote(String str) {
	        return str.substring(1,str.length()-1);
	    }

	    private Trip viajar(String key) {
	        Trip remover = null;
	        int stop = 0;

	        for (Trip object: viagensSolicitadas) {
	            if ((object.getDriver().equals(key)) && stop == 0) {
	                remover = object;
	                stop = 1;
	            }
	        }

	        Boolean res = viagensSolicitadas.remove(remover);
	        return remover;
	    }

	    private Trip viajarQualquer() {
	        Trip remover = null;
	        int tam = viagensSolicitadas.size();

	        if (tam > 0)
	            return viagensSolicitadas.remove(tam-1);

	        return remover;
	    }

	public ATSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ActionsContext extends ParserRuleContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public ActionsContext actions() {
			return getRuleContext(ActionsContext.class,0);
		}
		public ActionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actions; }
	}

	public final ActionsContext actions() throws RecognitionException {
		ActionsContext _localctx = new ActionsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_actions);
		try {
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				action();
				setState(31);
				match(T__0);
				setState(32);
				actions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				action();
				setState(35);
				match(T__0);
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

	public static class ActionContext extends ParserRuleContext {
		public RegistoContext registo() {
			return getRuleContext(RegistoContext.class,0);
		}
		public LoginContext login() {
			return getRuleContext(LoginContext.class,0);
		}
		public LogoutContext logout() {
			return getRuleContext(LogoutContext.class,0);
		}
		public RecusarContext recusar() {
			return getRuleContext(RecusarContext.class,0);
		}
		public SolicitarContext solicitar() {
			return getRuleContext(SolicitarContext.class,0);
		}
		public ViajarContext viajar() {
			return getRuleContext(ViajarContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_action);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				registo();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				login();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				logout();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				recusar();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(43);
				solicitar();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 6);
				{
				setState(44);
				viajar();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 7);
				{
				setState(45);
				end();
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

	public static class RegistoContext extends ParserRuleContext {
		public RegistarCondutorContext registarCondutor() {
			return getRuleContext(RegistarCondutorContext.class,0);
		}
		public RegistarClienteContext registarCliente() {
			return getRuleContext(RegistarClienteContext.class,0);
		}
		public RegistarEmpresaContext registarEmpresa() {
			return getRuleContext(RegistarEmpresaContext.class,0);
		}
		public RegistarVeiculoContext registarVeiculo() {
			return getRuleContext(RegistarVeiculoContext.class,0);
		}
		public RegistarVeiculoEmpresaContext registarVeiculoEmpresa() {
			return getRuleContext(RegistarVeiculoEmpresaContext.class,0);
		}
		public RegistoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registo; }
	}

	public final RegistoContext registo() throws RecognitionException {
		RegistoContext _localctx = new RegistoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_registo);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				registarCondutor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				registarCliente();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				registarEmpresa();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				registarVeiculo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				registarVeiculoEmpresa();
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

	public static class RegistarCondutorContext extends ParserRuleContext {
		public Token email;
		public Token name;
		public Token pass;
		public Token rua;
		public Token dat;
		public Token comp;
		public Token emp;
		public List<TerminalNode> STRING() { return getTokens(ATSParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ATSParser.STRING, i);
		}
		public TerminalNode DATA() { return getToken(ATSParser.DATA, 0); }
		public TerminalNode NUM() { return getToken(ATSParser.NUM, 0); }
		public RegistarCondutorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registarCondutor; }
	}

	public final RegistarCondutorContext registarCondutor() throws RecognitionException {
		RegistarCondutorContext _localctx = new RegistarCondutorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_registarCondutor);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(T__1);
				setState(56);
				((RegistarCondutorContext)_localctx).email = match(STRING);
				setState(57);
				((RegistarCondutorContext)_localctx).name = match(STRING);
				setState(58);
				((RegistarCondutorContext)_localctx).pass = match(STRING);
				setState(59);
				((RegistarCondutorContext)_localctx).rua = match(STRING);
				setState(60);
				((RegistarCondutorContext)_localctx).dat = match(DATA);
				setState(61);
				((RegistarCondutorContext)_localctx).comp = match(NUM);

				    LocalDate localDate = LocalDate.parse((((RegistarCondutorContext)_localctx).dat!=null?((RegistarCondutorContext)_localctx).dat.getText():null));
				    double value = Double.parseDouble((((RegistarCondutorContext)_localctx).comp!=null?((RegistarCondutorContext)_localctx).comp.getText():null));
				    String company = null;
				    driver = new Driver((((RegistarCondutorContext)_localctx).email!=null?((RegistarCondutorContext)_localctx).email.getText():null),(((RegistarCondutorContext)_localctx).name!=null?((RegistarCondutorContext)_localctx).name.getText():null),(((RegistarCondutorContext)_localctx).pass!=null?((RegistarCondutorContext)_localctx).pass.getText():null),(((RegistarCondutorContext)_localctx).rua!=null?((RegistarCondutorContext)_localctx).rua.getText():null),localDate,value,company);

				    // Criar veiculo aletorio
				    String plate  = String.valueOf(contadormatriculas); contadormatriculas++;
				    Double reliable = ThreadLocalRandom.current().nextDouble(0, 100);
				    Point2D.Double position = new Point2D.Double(ThreadLocalRandom.current().nextDouble(0, 100), ThreadLocalRandom.current().nextDouble(0, 100));
				    Vehicle carro = new Car(plate, reliable, position,(((RegistarCondutorContext)_localctx).email!=null?((RegistarCondutorContext)_localctx).email.getText():null));
				    umer.registerVehicleP(carro);
				    System.out.println("Matricula : " + plate + " reliable: " + reliable + " condutor_ " + (((RegistarCondutorContext)_localctx).email!=null?((RegistarCondutorContext)_localctx).email.getText():null));
				    System.out.println("Numero de vehiculos : " + umer.getVehiclesP().size());

				    // Registar veiculo no condutor
				    driver.setVehicle(plate);
				    boolean regista = umer.registerUser(driver,company);
				    System.out.println("registou:" +regista + "utilizadores:" + umer.getAllDrivers().size());

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(T__1);
				setState(64);
				((RegistarCondutorContext)_localctx).email = match(STRING);
				setState(65);
				((RegistarCondutorContext)_localctx).name = match(STRING);
				setState(66);
				((RegistarCondutorContext)_localctx).pass = match(STRING);
				setState(67);
				((RegistarCondutorContext)_localctx).rua = match(STRING);
				setState(68);
				((RegistarCondutorContext)_localctx).dat = match(DATA);
				setState(69);
				((RegistarCondutorContext)_localctx).comp = match(NUM);
				setState(70);
				((RegistarCondutorContext)_localctx).emp = match(STRING);

				    LocalDate localDate = LocalDate.parse((((RegistarCondutorContext)_localctx).dat!=null?((RegistarCondutorContext)_localctx).dat.getText():null));
				    double value = Double.parseDouble((((RegistarCondutorContext)_localctx).comp!=null?((RegistarCondutorContext)_localctx).comp.getText():null));
				    String company = (((RegistarCondutorContext)_localctx).emp!=null?((RegistarCondutorContext)_localctx).emp.getText():null);
				    driver = new Driver((((RegistarCondutorContext)_localctx).email!=null?((RegistarCondutorContext)_localctx).email.getText():null),(((RegistarCondutorContext)_localctx).name!=null?((RegistarCondutorContext)_localctx).name.getText():null),(((RegistarCondutorContext)_localctx).pass!=null?((RegistarCondutorContext)_localctx).pass.getText():null),(((RegistarCondutorContext)_localctx).rua!=null?((RegistarCondutorContext)_localctx).rua.getText():null),localDate,value,company);
				    // boolean regista = umer.registerUser(driver,company);

				    //Criar veiculo aletorio
				    String plate  = String.valueOf(contadormatriculas); contadormatriculas++;
				    Double reliable = ThreadLocalRandom.current().nextDouble(0, 100);
				    Point2D.Double position = new Point2D.Double(ThreadLocalRandom.current().nextDouble(0, 100), ThreadLocalRandom.current().nextDouble(0, 100));
				    Car carro = new Car(plate, reliable, position, (((RegistarCondutorContext)_localctx).email!=null?((RegistarCondutorContext)_localctx).email.getText():null));
				    umer.registerVehicleP(carro);

				    System.out.println("Matricula : " + plate + " reliable: " + reliable + " condutor_ " + (((RegistarCondutorContext)_localctx).email!=null?((RegistarCondutorContext)_localctx).email.getText():null));
				    System.out.println("Numero de vehiculos : " + umer.getVehiclesP().size());

				    //registar veiculo condutor_
				    driver.setVehicle(plate);
				    boolean regista = umer.registerUser(driver, company);
				    System.out.println("registou emp:" +regista + "utilizadores:" + umer.getAllDrivers().size());

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

	public static class RegistarClienteContext extends ParserRuleContext {
		public Token email;
		public Token name;
		public Token pass;
		public Token rua;
		public Token dat;
		public PosicaoContext p;
		public List<TerminalNode> STRING() { return getTokens(ATSParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ATSParser.STRING, i);
		}
		public TerminalNode DATA() { return getToken(ATSParser.DATA, 0); }
		public PosicaoContext posicao() {
			return getRuleContext(PosicaoContext.class,0);
		}
		public RegistarClienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registarCliente; }
	}

	public final RegistarClienteContext registarCliente() throws RecognitionException {
		RegistarClienteContext _localctx = new RegistarClienteContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_registarCliente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__2);
			setState(75);
			((RegistarClienteContext)_localctx).email = match(STRING);
			setState(76);
			((RegistarClienteContext)_localctx).name = match(STRING);
			setState(77);
			((RegistarClienteContext)_localctx).pass = match(STRING);
			setState(78);
			((RegistarClienteContext)_localctx).rua = match(STRING);
			setState(79);
			((RegistarClienteContext)_localctx).dat = match(DATA);
			setState(80);
			((RegistarClienteContext)_localctx).p = posicao();

			    LocalDate localDate = LocalDate.parse((((RegistarClienteContext)_localctx).dat!=null?((RegistarClienteContext)_localctx).dat.getText():null));
			    Point2D.Double ponto = ((RegistarClienteContext)_localctx).p.pos;
			    client = new Client((((RegistarClienteContext)_localctx).email!=null?((RegistarClienteContext)_localctx).email.getText():null), (((RegistarClienteContext)_localctx).name!=null?((RegistarClienteContext)_localctx).name.getText():null), (((RegistarClienteContext)_localctx).pass!=null?((RegistarClienteContext)_localctx).pass.getText():null), (((RegistarClienteContext)_localctx).rua!=null?((RegistarClienteContext)_localctx).rua.getText():null), localDate);
			    client.setPosition(ponto);
			    boolean regista = umer.registerUser(client, null);
			    System.out.println("registou cliente:" + regista + "utilizadores:" + umer.getClients().size());

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

	public static class RegistarEmpresaContext extends ParserRuleContext {
		public Token nome;
		public Token pass;
		public List<TerminalNode> STRING() { return getTokens(ATSParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ATSParser.STRING, i);
		}
		public RegistarEmpresaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registarEmpresa; }
	}

	public final RegistarEmpresaContext registarEmpresa() throws RecognitionException {
		RegistarEmpresaContext _localctx = new RegistarEmpresaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_registarEmpresa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__3);
			setState(84);
			((RegistarEmpresaContext)_localctx).nome = match(STRING);
			setState(85);
			((RegistarEmpresaContext)_localctx).pass = match(STRING);

			    boolean regista = umer.registerCompany((((RegistarEmpresaContext)_localctx).nome!=null?((RegistarEmpresaContext)_localctx).nome.getText():null), (((RegistarEmpresaContext)_localctx).pass!=null?((RegistarEmpresaContext)_localctx).pass.getText():null));
			    System.out.println("registouE: " +  (((RegistarEmpresaContext)_localctx).nome!=null?((RegistarEmpresaContext)_localctx).nome.getText():null) + regista);

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

	public static class RegistarVeiculoContext extends ParserRuleContext {
		public Token tipo;
		public Token matricula;
		public Token rel;
		public PosicaoContext pos;
		public Token emailOwner;
		public TerminalNode VEICULO() { return getToken(ATSParser.VEICULO, 0); }
		public List<TerminalNode> STRING() { return getTokens(ATSParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ATSParser.STRING, i);
		}
		public TerminalNode NUM() { return getToken(ATSParser.NUM, 0); }
		public PosicaoContext posicao() {
			return getRuleContext(PosicaoContext.class,0);
		}
		public RegistarVeiculoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registarVeiculo; }
	}

	public final RegistarVeiculoContext registarVeiculo() throws RecognitionException {
		RegistarVeiculoContext _localctx = new RegistarVeiculoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_registarVeiculo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__4);
			setState(89);
			((RegistarVeiculoContext)_localctx).tipo = match(VEICULO);
			setState(90);
			((RegistarVeiculoContext)_localctx).matricula = match(STRING);
			setState(91);
			((RegistarVeiculoContext)_localctx).rel = match(NUM);
			setState(92);
			((RegistarVeiculoContext)_localctx).pos = posicao();
			setState(93);
			((RegistarVeiculoContext)_localctx).emailOwner = match(STRING);

			    Point2D.Double ponto = ((RegistarVeiculoContext)_localctx).pos.pos;
			    Vehicle v = null;
			    switch ((((RegistarVeiculoContext)_localctx).tipo!=null?((RegistarVeiculoContext)_localctx).tipo.getText():null)) {
			            case "carro":          v = new Car((((RegistarVeiculoContext)_localctx).matricula!=null?((RegistarVeiculoContext)_localctx).matricula.getText():null),Double.parseDouble((((RegistarVeiculoContext)_localctx).rel!=null?((RegistarVeiculoContext)_localctx).rel.getText():null)),ponto,(((RegistarVeiculoContext)_localctx).emailOwner!=null?((RegistarVeiculoContext)_localctx).emailOwner.getText():null));
			                     break;
			            case "mota":           v = new Bike((((RegistarVeiculoContext)_localctx).matricula!=null?((RegistarVeiculoContext)_localctx).matricula.getText():null),Double.parseDouble((((RegistarVeiculoContext)_localctx).rel!=null?((RegistarVeiculoContext)_localctx).rel.getText():null)),ponto,(((RegistarVeiculoContext)_localctx).emailOwner!=null?((RegistarVeiculoContext)_localctx).emailOwner.getText():null));
			                     break;
			            case "carrinha":       v =  new Van((((RegistarVeiculoContext)_localctx).matricula!=null?((RegistarVeiculoContext)_localctx).matricula.getText():null),Double.parseDouble((((RegistarVeiculoContext)_localctx).rel!=null?((RegistarVeiculoContext)_localctx).rel.getText():null)),ponto,(((RegistarVeiculoContext)_localctx).emailOwner!=null?((RegistarVeiculoContext)_localctx).emailOwner.getText():null));
			                     break;
			            case "helicoptero":    v = new Helicopter((((RegistarVeiculoContext)_localctx).matricula!=null?((RegistarVeiculoContext)_localctx).matricula.getText():null),Double.parseDouble((((RegistarVeiculoContext)_localctx).rel!=null?((RegistarVeiculoContext)_localctx).rel.getText():null)),ponto,(((RegistarVeiculoContext)_localctx).emailOwner!=null?((RegistarVeiculoContext)_localctx).emailOwner.getText():null));
			                     break;
			            default:
			                  System.out.println("ERROs");
			}
			          System.out.println("REGISTEI VEICULO" + (((RegistarVeiculoContext)_localctx).tipo!=null?((RegistarVeiculoContext)_localctx).tipo.getText():null) + "MATRICULA" + (((RegistarVeiculoContext)_localctx).matricula!=null?((RegistarVeiculoContext)_localctx).matricula.getText():null));
			          //Buscar o condutor_e eliminar veiculo atual
			          Driver d = umer.getAllDrivers().get((((RegistarVeiculoContext)_localctx).emailOwner!=null?((RegistarVeiculoContext)_localctx).emailOwner.getText():null));
			          Vehicle ve = umer.getAllVehicles().get(d.getVehicle());
			          umer.removeVehicle(ve);

			          //Adicionar o novo e muda o condutor
			          boolean regista =   umer.registerVehicleP(v);
			          umer.changeDriverVehicle((((RegistarVeiculoContext)_localctx).emailOwner!=null?((RegistarVeiculoContext)_localctx).emailOwner.getText():null),(((RegistarVeiculoContext)_localctx).matricula!=null?((RegistarVeiculoContext)_localctx).matricula.getText():null));

			          if (regista == false) {System.out.println("Problema ao registar Veiculo");}

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

	public static class RegistarVeiculoEmpresaContext extends ParserRuleContext {
		public Token tipo;
		public Token matricula;
		public Token rel;
		public PosicaoContext pos;
		public Token empresa;
		public TerminalNode VEICULO() { return getToken(ATSParser.VEICULO, 0); }
		public List<TerminalNode> STRING() { return getTokens(ATSParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ATSParser.STRING, i);
		}
		public TerminalNode NUM() { return getToken(ATSParser.NUM, 0); }
		public PosicaoContext posicao() {
			return getRuleContext(PosicaoContext.class,0);
		}
		public RegistarVeiculoEmpresaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registarVeiculoEmpresa; }
	}

	public final RegistarVeiculoEmpresaContext registarVeiculoEmpresa() throws RecognitionException {
		RegistarVeiculoEmpresaContext _localctx = new RegistarVeiculoEmpresaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_registarVeiculoEmpresa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__4);
			setState(97);
			((RegistarVeiculoEmpresaContext)_localctx).tipo = match(VEICULO);
			setState(98);
			((RegistarVeiculoEmpresaContext)_localctx).matricula = match(STRING);
			setState(99);
			((RegistarVeiculoEmpresaContext)_localctx).rel = match(NUM);
			setState(100);
			((RegistarVeiculoEmpresaContext)_localctx).pos = posicao();
			setState(101);
			match(T__5);
			setState(102);
			((RegistarVeiculoEmpresaContext)_localctx).empresa = match(STRING);

			    System.out.println("ENTREI" + " " + (((RegistarVeiculoEmpresaContext)_localctx).matricula!=null?((RegistarVeiculoEmpresaContext)_localctx).matricula.getText():null) + (((RegistarVeiculoEmpresaContext)_localctx).rel!=null?((RegistarVeiculoEmpresaContext)_localctx).rel.getText():null) + (((RegistarVeiculoEmpresaContext)_localctx).empresa!=null?((RegistarVeiculoEmpresaContext)_localctx).empresa.getText():null));
			    Point2D.Double ponto = ((RegistarVeiculoEmpresaContext)_localctx).pos.pos;
			    Vehicle v = null;
			    switch ((((RegistarVeiculoEmpresaContext)_localctx).tipo!=null?((RegistarVeiculoEmpresaContext)_localctx).tipo.getText():null)) {
			            case "carro":          v = new Car((((RegistarVeiculoEmpresaContext)_localctx).matricula!=null?((RegistarVeiculoEmpresaContext)_localctx).matricula.getText():null),Double.parseDouble((((RegistarVeiculoEmpresaContext)_localctx).rel!=null?((RegistarVeiculoEmpresaContext)_localctx).rel.getText():null)),ponto,(((RegistarVeiculoEmpresaContext)_localctx).empresa!=null?((RegistarVeiculoEmpresaContext)_localctx).empresa.getText():null));
			                     break;
			            case "mota":           v = new Bike((((RegistarVeiculoEmpresaContext)_localctx).matricula!=null?((RegistarVeiculoEmpresaContext)_localctx).matricula.getText():null),Double.parseDouble((((RegistarVeiculoEmpresaContext)_localctx).rel!=null?((RegistarVeiculoEmpresaContext)_localctx).rel.getText():null)),ponto,(((RegistarVeiculoEmpresaContext)_localctx).empresa!=null?((RegistarVeiculoEmpresaContext)_localctx).empresa.getText():null));
			                     break;
			            case "carrinha":       v = new Van((((RegistarVeiculoEmpresaContext)_localctx).matricula!=null?((RegistarVeiculoEmpresaContext)_localctx).matricula.getText():null),Double.parseDouble((((RegistarVeiculoEmpresaContext)_localctx).rel!=null?((RegistarVeiculoEmpresaContext)_localctx).rel.getText():null)),ponto,(((RegistarVeiculoEmpresaContext)_localctx).empresa!=null?((RegistarVeiculoEmpresaContext)_localctx).empresa.getText():null));
			                     break;
			            case "helicoptero":    v = new Helicopter((((RegistarVeiculoEmpresaContext)_localctx).matricula!=null?((RegistarVeiculoEmpresaContext)_localctx).matricula.getText():null),Double.parseDouble((((RegistarVeiculoEmpresaContext)_localctx).rel!=null?((RegistarVeiculoEmpresaContext)_localctx).rel.getText():null)),ponto,(((RegistarVeiculoEmpresaContext)_localctx).empresa!=null?((RegistarVeiculoEmpresaContext)_localctx).empresa.getText():null));
			                     break;
			            default:
			                  System.out.println("ERROs");
			}



			          //Regista veiculo
			          boolean regista =   umer.registerCompanyVehicle((((RegistarVeiculoEmpresaContext)_localctx).empresa!=null?((RegistarVeiculoEmpresaContext)_localctx).empresa.getText():null),v);

			          if (regista == false) {System.out.println("Problema ao registar Veiculo");}

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

	public static class LoginContext extends ParserRuleContext {
		public Token nome;
		public Token pass;
		public List<TerminalNode> STRING() { return getTokens(ATSParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ATSParser.STRING, i);
		}
		public LoginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_login; }
	}

	public final LoginContext login() throws RecognitionException {
		LoginContext _localctx = new LoginContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_login);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__6);
			setState(106);
			((LoginContext)_localctx).nome = match(STRING);
			setState(107);
			((LoginContext)_localctx).pass = match(STRING);

			    String result = umer.loginUmer((((LoginContext)_localctx).nome!=null?((LoginContext)_localctx).nome.getText():null), (((LoginContext)_localctx).pass!=null?((LoginContext)_localctx).pass.getText():null));

			    if (result != null) {
			        key = (((LoginContext)_localctx).nome!=null?((LoginContext)_localctx).nome.getText():null);
			        cla = result;
			        System.out.println("Sucesso no login!");
			    } else
			        System.out.println("Erro login");

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

	public static class SolicitarContext extends ParserRuleContext {
		public PosicaoContext pos;
		public PosicaoContext posicao() {
			return getRuleContext(PosicaoContext.class,0);
		}
		public SolicitarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_solicitar; }
	}

	public final SolicitarContext solicitar() throws RecognitionException {
		SolicitarContext _localctx = new SolicitarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_solicitar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__7);
			setState(111);
			((SolicitarContext)_localctx).pos = posicao();

			    Point2D.Double ponto = ((SolicitarContext)_localctx).pos.pos;
			    Client client = umer.getClients().get(key);
			    Trip trip = umer.newTripClosest(client, ponto);

			    if (trip == null) {
			        System.out.println("A VIAGEM VEIO VAZIA");
			    } else {
			        System.out.println(" TEMOS VIAGEM SOLICITADA" + "CONTADOR : " + contadorfinal++);
			        viagensSolicitadas.add(trip);
			        // System.out.println(trip.toString());
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

	public static class ViajarContext extends ParserRuleContext {
		public ViajarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viajar; }
	}

	public final ViajarContext viajar() throws RecognitionException {
		ViajarContext _localctx = new ViajarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_viajar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__8);

			    if (key != null) {
			        System.out.println("Tamanho antes de chamar a funcao:" + viagensSolicitadas.size());
			        Trip vTemp = viajarQualquer();
			        System.out.println("Tamanho depois de chamar a funcao:" + viagensSolicitadas.size());

			        if (vTemp == null) {
			            System.out.println("Nao conseguiu viajar, nao tinha viagens!");
			        } else {
			            Client c = umer.getClients().get(vTemp.getClient());
			            Driver d = umer.getAllDrivers().get(key);

			            if (d == null) System.out.println("condutor esta null");

			            String matricula = d.getVehicle();
			            Vehicle v = umer.getAllVehicles().get(matricula);

			            Trip vfinal  = umer.newTrip(c,d,v,vTemp.getEnd());
			            umer.addTrip(vfinal.getClient(), vfinal.getDriver(), vfinal.getLicencePlate(), vfinal);
			        }
			    } else {}

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

	public static class RecusarContext extends ParserRuleContext {
		public RecusarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recusar; }
	}

	public final RecusarContext recusar() throws RecognitionException {
		RecusarContext _localctx = new RecusarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_recusar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__9);

			    int numA = viagensSolicitadas.size();
			    Trip viajar = viajarQualquer();
			    int numD = viagensSolicitadas.size();

			    if (viajar != null) {
			        System.out.println("Viagem removida com sucesso; numero de viagens \n" +"tam antes: " + numA + "tam depois" + numD);
			    } else {
			        System.out.println("Nao conseguiu remover, nao tinha viagens!");
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

	public static class LogoutContext extends ParserRuleContext {
		public LogoutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logout; }
	}

	public final LogoutContext logout() throws RecognitionException {
		LogoutContext _localctx = new LogoutContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_logout);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__10);

			    key = null;
			    cla = null;

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

	public static class PosicaoContext extends ParserRuleContext {
		public Point2D.Double pos;
		public Token prim;
		public Token seg;
		public List<TerminalNode> DECIMAL() { return getTokens(ATSParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(ATSParser.DECIMAL, i);
		}
		public PosicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posicao; }
	}

	public final PosicaoContext posicao() throws RecognitionException {
		PosicaoContext _localctx = new PosicaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_posicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__11);
			setState(124);
			((PosicaoContext)_localctx).prim = match(DECIMAL);
			setState(125);
			match(T__12);
			setState(126);
			((PosicaoContext)_localctx).seg = match(DECIMAL);
			setState(127);
			match(T__13);

			    Point2D.Double po = new Point2D.Double();
			    po.setLocation(Double.parseDouble((((PosicaoContext)_localctx).prim!=null?((PosicaoContext)_localctx).prim.getText():null)), Double.parseDouble((((PosicaoContext)_localctx).seg!=null?((PosicaoContext)_localctx).seg.getText():null)));
			    ((PosicaoContext)_localctx).pos =  po;

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

	public static class EndContext extends ParserRuleContext {
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__14);

			    System.out.println("EXECUTADO! Viagens Retidas: " + viagensSolicitadas.size());
			    try {
			        umer.saveUMeR("umerData-tests");
			    } catch (Exception e) {
			        System.out.println("ERRO! : " + e);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\u0088\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\5\2(\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\5\48\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5K\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2\2\u0084\2\'\3"+
		"\2\2\2\4\60\3\2\2\2\6\67\3\2\2\2\bJ\3\2\2\2\nL\3\2\2\2\fU\3\2\2\2\16Z"+
		"\3\2\2\2\20b\3\2\2\2\22k\3\2\2\2\24p\3\2\2\2\26t\3\2\2\2\30w\3\2\2\2\32"+
		"z\3\2\2\2\34}\3\2\2\2\36\u0084\3\2\2\2 !\5\4\3\2!\"\7\3\2\2\"#\5\2\2\2"+
		"#(\3\2\2\2$%\5\4\3\2%&\7\3\2\2&(\3\2\2\2\' \3\2\2\2\'$\3\2\2\2(\3\3\2"+
		"\2\2)\61\5\6\4\2*\61\5\22\n\2+\61\5\32\16\2,\61\5\30\r\2-\61\5\24\13\2"+
		".\61\5\26\f\2/\61\5\36\20\2\60)\3\2\2\2\60*\3\2\2\2\60+\3\2\2\2\60,\3"+
		"\2\2\2\60-\3\2\2\2\60.\3\2\2\2\60/\3\2\2\2\61\5\3\2\2\2\628\5\b\5\2\63"+
		"8\5\n\6\2\648\5\f\7\2\658\5\16\b\2\668\5\20\t\2\67\62\3\2\2\2\67\63\3"+
		"\2\2\2\67\64\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2\28\7\3\2\2\29:\7\4\2\2"+
		":;\7\23\2\2;<\7\23\2\2<=\7\23\2\2=>\7\23\2\2>?\7\24\2\2?@\7\26\2\2@K\b"+
		"\5\1\2AB\7\4\2\2BC\7\23\2\2CD\7\23\2\2DE\7\23\2\2EF\7\23\2\2FG\7\24\2"+
		"\2GH\7\26\2\2HI\7\23\2\2IK\b\5\1\2J9\3\2\2\2JA\3\2\2\2K\t\3\2\2\2LM\7"+
		"\5\2\2MN\7\23\2\2NO\7\23\2\2OP\7\23\2\2PQ\7\23\2\2QR\7\24\2\2RS\5\34\17"+
		"\2ST\b\6\1\2T\13\3\2\2\2UV\7\6\2\2VW\7\23\2\2WX\7\23\2\2XY\b\7\1\2Y\r"+
		"\3\2\2\2Z[\7\7\2\2[\\\7\22\2\2\\]\7\23\2\2]^\7\26\2\2^_\5\34\17\2_`\7"+
		"\23\2\2`a\b\b\1\2a\17\3\2\2\2bc\7\7\2\2cd\7\22\2\2de\7\23\2\2ef\7\26\2"+
		"\2fg\5\34\17\2gh\7\b\2\2hi\7\23\2\2ij\b\t\1\2j\21\3\2\2\2kl\7\t\2\2lm"+
		"\7\23\2\2mn\7\23\2\2no\b\n\1\2o\23\3\2\2\2pq\7\n\2\2qr\5\34\17\2rs\b\13"+
		"\1\2s\25\3\2\2\2tu\7\13\2\2uv\b\f\1\2v\27\3\2\2\2wx\7\f\2\2xy\b\r\1\2"+
		"y\31\3\2\2\2z{\7\r\2\2{|\b\16\1\2|\33\3\2\2\2}~\7\16\2\2~\177\7\27\2\2"+
		"\177\u0080\7\17\2\2\u0080\u0081\7\27\2\2\u0081\u0082\7\20\2\2\u0082\u0083"+
		"\b\17\1\2\u0083\35\3\2\2\2\u0084\u0085\7\21\2\2\u0085\u0086\b\20\1\2\u0086"+
		"\37\3\2\2\2\6\'\60\67J";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}