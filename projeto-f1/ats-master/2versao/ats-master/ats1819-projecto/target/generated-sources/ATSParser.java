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
		T__9=10, T__10=11, T__11=12, T__12=13, STRING=14, DATA=15, DIGIT=16, NUM=17, 
		DECIMAL=18, WS=19;
	public static final int
		RULE_actions = 0, RULE_action = 1, RULE_registo = 2, RULE_registarCondutor = 3, 
		RULE_registarCliente = 4, RULE_registarEmpresa = 5, RULE_login = 6, RULE_solicitar = 7, 
		RULE_viajar = 8, RULE_recusar = 9, RULE_logout = 10, RULE_posicao = 11, 
		RULE_end = 12;
	public static final String[] ruleNames = {
		"actions", "action", "registo", "registarCondutor", "registarCliente", 
		"registarEmpresa", "login", "solicitar", "viajar", "recusar", "logout", 
		"posicao", "end"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'registar condutor'", "'registar cliente'", "'registar empresa'", 
		"'login'", "'solicitar'", "'viajar'", "'recusar viagem'", "'logout'", 
		"'('", "','", "')'", "'EOF'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "STRING", "DATA", "DIGIT", "NUM", "DECIMAL", "WS"
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
	 Point2D.Double start= new Point2D.Double();
	 int contadormatriculas=1;
	 Vehicle car;
	 Trip trip;
	 ArrayList<Trip> viagensSolicitadas = new ArrayList<Trip>();
	int contadorfinal;
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

	  private Trip viajarQualquer() {
	    Trip remover=null;
	    int tam=viagensSolicitadas.size();

	            if (tam >0) {

	              remover= viagensSolicitadas.remove(tam-1);
	            }
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
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				action();
				setState(27);
				match(T__0);
				setState(28);
				actions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				action();
				setState(31);
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
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				registo();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				login();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				logout();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				recusar();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				solicitar();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 6);
				{
				setState(40);
				viajar();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 7);
				{
				setState(41);
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
		public RegistoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registo; }
	}

	public final RegistoContext registo() throws RecognitionException {
		RegistoContext _localctx = new RegistoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_registo);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				registarCondutor();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				registarCliente();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				registarEmpresa();
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
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(T__1);
				setState(50);
				((RegistarCondutorContext)_localctx).email = match(STRING);
				setState(51);
				((RegistarCondutorContext)_localctx).name = match(STRING);
				setState(52);
				((RegistarCondutorContext)_localctx).pass = match(STRING);
				setState(53);
				((RegistarCondutorContext)_localctx).rua = match(STRING);
				setState(54);
				((RegistarCondutorContext)_localctx).dat = match(DATA);
				setState(55);
				((RegistarCondutorContext)_localctx).comp = match(NUM);


				                      LocalDate localDate = LocalDate.parse((((RegistarCondutorContext)_localctx).dat!=null?((RegistarCondutorContext)_localctx).dat.getText():null));
				                      double value = Double.parseDouble((((RegistarCondutorContext)_localctx).comp!=null?((RegistarCondutorContext)_localctx).comp.getText():null));
				                      String company = null;
				                      driver = new Driver((((RegistarCondutorContext)_localctx).email!=null?((RegistarCondutorContext)_localctx).email.getText():null),(((RegistarCondutorContext)_localctx).name!=null?((RegistarCondutorContext)_localctx).name.getText():null),(((RegistarCondutorContext)_localctx).pass!=null?((RegistarCondutorContext)_localctx).pass.getText():null),(((RegistarCondutorContext)_localctx).rua!=null?((RegistarCondutorContext)_localctx).rua.getText():null),localDate,value,company);



				                      //Criar veiculo aletorio
				                      String plate  = String.valueOf(contadormatriculas); contadormatriculas++;
				                      Double reliable = ThreadLocalRandom.current().nextDouble(0, 100);
				                      Point2D.Double position = new Point2D.Double(ThreadLocalRandom.current().nextDouble(0, 100),ThreadLocalRandom.current().nextDouble(0, 100));
				                      Vehicle carro = new Car(plate, reliable, position,(((RegistarCondutorContext)_localctx).email!=null?((RegistarCondutorContext)_localctx).email.getText():null));
				                      umer.registerVehicleP(carro);
				                      System.out.println("Matricula : " + plate + " reliable: " + reliable + " condutor_ " + (((RegistarCondutorContext)_localctx).email!=null?((RegistarCondutorContext)_localctx).email.getText():null));
				                      System.out.println("Numero de vehiculos : " + umer.getVehiclesP().size());
				                      //criar veiculo aletorio

				                      // registar veiculo no condutor_

				                      driver.setVehicle(plate);
				                      boolean regista = umer.registerUser(driver,company);
				                      System.out.println("registou:" +regista + "utilizadores:" + umer.getAllDrivers().size());

				                      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(T__1);
				setState(58);
				((RegistarCondutorContext)_localctx).email = match(STRING);
				setState(59);
				((RegistarCondutorContext)_localctx).name = match(STRING);
				setState(60);
				((RegistarCondutorContext)_localctx).pass = match(STRING);
				setState(61);
				((RegistarCondutorContext)_localctx).rua = match(STRING);
				setState(62);
				((RegistarCondutorContext)_localctx).dat = match(DATA);
				setState(63);
				((RegistarCondutorContext)_localctx).comp = match(NUM);
				setState(64);
				((RegistarCondutorContext)_localctx).emp = match(STRING);


				                      LocalDate localDate = LocalDate.parse((((RegistarCondutorContext)_localctx).dat!=null?((RegistarCondutorContext)_localctx).dat.getText():null));
				                      double value = Double.parseDouble((((RegistarCondutorContext)_localctx).comp!=null?((RegistarCondutorContext)_localctx).comp.getText():null));
				                      String company = (((RegistarCondutorContext)_localctx).emp!=null?((RegistarCondutorContext)_localctx).emp.getText():null);
				                      driver = new Driver((((RegistarCondutorContext)_localctx).email!=null?((RegistarCondutorContext)_localctx).email.getText():null),(((RegistarCondutorContext)_localctx).name!=null?((RegistarCondutorContext)_localctx).name.getText():null),(((RegistarCondutorContext)_localctx).pass!=null?((RegistarCondutorContext)_localctx).pass.getText():null),(((RegistarCondutorContext)_localctx).rua!=null?((RegistarCondutorContext)_localctx).rua.getText():null),localDate,value,company);
				                    //  boolean regista = umer.registerUser(driver,company);


				                      //Criar veiculo aletorio
				                      String plate  = String.valueOf(contadormatriculas); contadormatriculas++;
				                      Double reliable = ThreadLocalRandom.current().nextDouble(0, 100);
				                      Point2D.Double position = new Point2D.Double(ThreadLocalRandom.current().nextDouble(0, 100),ThreadLocalRandom.current().nextDouble(0, 100));
				                      Car carro = new Car(plate, reliable, position,(((RegistarCondutorContext)_localctx).email!=null?((RegistarCondutorContext)_localctx).email.getText():null));
				                      umer.registerVehicleP(carro);

				                      System.out.println("Matricula : " + plate + " reliable: " + reliable + " condutor_ " + (((RegistarCondutorContext)_localctx).email!=null?((RegistarCondutorContext)_localctx).email.getText():null));
				                      System.out.println("Numero de vehiculos : " + umer.getVehiclesP().size());
				                      //criar veiculo aletorio

				                      //registar veiculo condutor_
				                      driver.setVehicle(plate);
				                      boolean regista = umer.registerUser(driver,company);
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
			setState(68);
			match(T__2);
			setState(69);
			((RegistarClienteContext)_localctx).email = match(STRING);
			setState(70);
			((RegistarClienteContext)_localctx).name = match(STRING);
			setState(71);
			((RegistarClienteContext)_localctx).pass = match(STRING);
			setState(72);
			((RegistarClienteContext)_localctx).rua = match(STRING);
			setState(73);
			((RegistarClienteContext)_localctx).dat = match(DATA);
			setState(74);
			((RegistarClienteContext)_localctx).p = posicao();

			                      LocalDate localDate = LocalDate.parse((((RegistarClienteContext)_localctx).dat!=null?((RegistarClienteContext)_localctx).dat.getText():null));
			                      Point2D.Double ponto = ((RegistarClienteContext)_localctx).p.pos;
			                      client = new Client((((RegistarClienteContext)_localctx).email!=null?((RegistarClienteContext)_localctx).email.getText():null),(((RegistarClienteContext)_localctx).name!=null?((RegistarClienteContext)_localctx).name.getText():null),(((RegistarClienteContext)_localctx).pass!=null?((RegistarClienteContext)_localctx).pass.getText():null),(((RegistarClienteContext)_localctx).rua!=null?((RegistarClienteContext)_localctx).rua.getText():null),localDate);
			                      client.setPosition(ponto);
			                      boolean regista = umer.registerUser(client,null);
			                      System.out.println("registou cliente:" +regista + "utilizadores:" + umer.getClients().size());  
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
			setState(77);
			match(T__3);
			setState(78);
			((RegistarEmpresaContext)_localctx).nome = match(STRING);
			setState(79);
			((RegistarEmpresaContext)_localctx).pass = match(STRING);


			                     boolean regista = umer.registerCompany((((RegistarEmpresaContext)_localctx).nome!=null?((RegistarEmpresaContext)_localctx).nome.getText():null),(((RegistarEmpresaContext)_localctx).pass!=null?((RegistarEmpresaContext)_localctx).pass.getText():null));
			                     System.out.println("registou: " + regista);


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
		enterRule(_localctx, 12, RULE_login);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__4);
			setState(83);
			((LoginContext)_localctx).nome = match(STRING);
			setState(84);
			((LoginContext)_localctx).pass = match(STRING);



			                    String result = umer.loginUmer((((LoginContext)_localctx).nome!=null?((LoginContext)_localctx).nome.getText():null),(((LoginContext)_localctx).pass!=null?((LoginContext)_localctx).pass.getText():null));

			                    if (result != null) {
			                       key = (((LoginContext)_localctx).nome!=null?((LoginContext)_localctx).nome.getText():null);
			                       cla = result;
			                       System.out.println("Sucesso no login!");

			                    } else {System.out.println("Erro login");}

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
		enterRule(_localctx, 14, RULE_solicitar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__5);
			setState(88);
			((SolicitarContext)_localctx).pos = posicao();

			                  Point2D.Double ponto = ((SolicitarContext)_localctx).pos.pos;
			                  Client client = umer.getClients().get(key);
			                  Trip trip = umer.newTripClosest(client,ponto);

			                  if (trip == null) {System.out.println("A VIAGEM VEIO VAZIA");}
			                  else {

			                      System.out.println(" TEMOS VIAGEM SOLICITADA" + "CONTADOR : " + contadorfinal++);
			                      viagensSolicitadas.add(trip);
			                    //  System.out.println(trip.toString());

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
		enterRule(_localctx, 16, RULE_viajar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__6);


			            if (key != null) {




			            Trip vTemp = viajarQualquer();



			            if (vTemp==null) {System.out.println("Nao conseguiu viajar, nao tinha viagens!");}
			            else {

			                Driver d = umer.getAllDrivers().get(key); if (d==null) {System.out.println("condutor esta null");}
			                String matricula = d.getVehicle();
			                System.out.println("CONSEGIU VIAJAR!! Matricula_ " + matricula);
			                Trip viajar = new Trip (vTemp.getID(),vTemp.getStart(), vTemp.getEnd(),vTemp.getTime(),vTemp.getPrice(),vTemp.getDate(),matricula,key,vTemp.getClient(),vTemp.getRating(),vTemp.getEstimatedTimeToDest(),vTemp.getTaxiPos(),vTemp.getEstimatedTimeToClient(),vTemp.getRealTimeToClient(),vTemp.getEstimatedPrice());
			                umer.addTrip(  viajar.getClient(), viajar.getDriver(), viajar.getLicencePlate(),viajar);


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
		enterRule(_localctx, 18, RULE_recusar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__7);

			                  int numA = viagensSolicitadas.size();
			                  Trip viajar = viajar(key);
			                  int numD = viagensSolicitadas.size();
			                  if (viajar != null) {

			                      System.out.println("Viagem removida com sucesso; numero de viagens \n" +"tam antes: " +numA + "tam depois" + numD);
			                    }
			                    else {
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
		enterRule(_localctx, 20, RULE_logout);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__8);

			      key=null;
			      cla=null;


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
		enterRule(_localctx, 22, RULE_posicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__9);
			setState(101);
			((PosicaoContext)_localctx).prim = match(DECIMAL);
			setState(102);
			match(T__10);
			setState(103);
			((PosicaoContext)_localctx).seg = match(DECIMAL);
			setState(104);
			match(T__11);


			              Point2D.Double po = new Point2D.Double();
			              po.setLocation(Double.parseDouble((((PosicaoContext)_localctx).prim!=null?((PosicaoContext)_localctx).prim.getText():null)),Double.parseDouble((((PosicaoContext)_localctx).seg!=null?((PosicaoContext)_localctx).seg.getText():null)));
			              ((PosicaoContext)_localctx).pos = po;
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
		enterRule(_localctx, 24, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__12);

			    System.out.println("EXECUTADO! viagens retidas: " + viagensSolicitadas.size());
			    try{
			      umer.saveUMeR("umerData-tests");
			    } catch(Exception e) {System.out.println("ERRO :!!!!" + e);}
			    
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2$\n\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\5\4\62\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5E\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\2\2\2m\2#\3\2\2\2\4,\3\2\2\2\6\61\3\2\2\2\bD\3\2\2\2\nF\3\2\2\2\fO\3"+
		"\2\2\2\16T\3\2\2\2\20Y\3\2\2\2\22]\3\2\2\2\24`\3\2\2\2\26c\3\2\2\2\30"+
		"f\3\2\2\2\32m\3\2\2\2\34\35\5\4\3\2\35\36\7\3\2\2\36\37\5\2\2\2\37$\3"+
		"\2\2\2 !\5\4\3\2!\"\7\3\2\2\"$\3\2\2\2#\34\3\2\2\2# \3\2\2\2$\3\3\2\2"+
		"\2%-\5\6\4\2&-\5\16\b\2\'-\5\26\f\2(-\5\24\13\2)-\5\20\t\2*-\5\22\n\2"+
		"+-\5\32\16\2,%\3\2\2\2,&\3\2\2\2,\'\3\2\2\2,(\3\2\2\2,)\3\2\2\2,*\3\2"+
		"\2\2,+\3\2\2\2-\5\3\2\2\2.\62\5\b\5\2/\62\5\n\6\2\60\62\5\f\7\2\61.\3"+
		"\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\7\3\2\2\2\63\64\7\4\2\2\64\65\7\20"+
		"\2\2\65\66\7\20\2\2\66\67\7\20\2\2\678\7\20\2\289\7\21\2\29:\7\23\2\2"+
		":E\b\5\1\2;<\7\4\2\2<=\7\20\2\2=>\7\20\2\2>?\7\20\2\2?@\7\20\2\2@A\7\21"+
		"\2\2AB\7\23\2\2BC\7\20\2\2CE\b\5\1\2D\63\3\2\2\2D;\3\2\2\2E\t\3\2\2\2"+
		"FG\7\5\2\2GH\7\20\2\2HI\7\20\2\2IJ\7\20\2\2JK\7\20\2\2KL\7\21\2\2LM\5"+
		"\30\r\2MN\b\6\1\2N\13\3\2\2\2OP\7\6\2\2PQ\7\20\2\2QR\7\20\2\2RS\b\7\1"+
		"\2S\r\3\2\2\2TU\7\7\2\2UV\7\20\2\2VW\7\20\2\2WX\b\b\1\2X\17\3\2\2\2YZ"+
		"\7\b\2\2Z[\5\30\r\2[\\\b\t\1\2\\\21\3\2\2\2]^\7\t\2\2^_\b\n\1\2_\23\3"+
		"\2\2\2`a\7\n\2\2ab\b\13\1\2b\25\3\2\2\2cd\7\13\2\2de\b\f\1\2e\27\3\2\2"+
		"\2fg\7\f\2\2gh\7\24\2\2hi\7\r\2\2ij\7\24\2\2jk\7\16\2\2kl\b\r\1\2l\31"+
		"\3\2\2\2mn\7\17\2\2no\b\16\1\2o\33\3\2\2\2\6#,\61D";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}