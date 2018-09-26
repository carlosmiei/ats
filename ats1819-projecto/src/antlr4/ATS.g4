grammar ATS;

@header
{
  import java.awt.geom.Point2D;
  import java.time.LocalDate;
}

@members
{
 UMeR umer;
 Client client;
 Driver driver;
 User user;
 Point2D.Double start= new Point2D.Double();

  private String unquote(String str) {
    return str.substring(1,str.length()-1);
  }
}

/**
 *
 * REGRAS
 *
 */



actions: action ';' actions
       | action ';'
       ;

action: registo
//     | login
//    |logout
//   | recusar
     ;

registo:registarCondutor
       |registarCliente
       |registarEmpresa
       ;

registarCondutor: 'registar condutor' email=STRING name=STRING pass=STRING rua=STRING dat=DATA comp=NUM {

                      LocalDate localDate = LocalDate.parse($dat.text);
                      double value = Double.parseDouble($comp.text);
                      String company = null;
                      driver = new Driver($email.text,$name.text,$pass.text,$rua.text,localDate,value,company);
                      boolean regista = umer.registerUser(driver,company);
                      System.out.println("registou:" +regista + "utilizadores:" + umer.getAllDrivers().size());    }

                  | 'registar condutor' email=STRING name=STRING pass=STRING rua=STRING dat=DATA comp=NUM emp=STRING {

                      LocalDate localDate = LocalDate.parse($dat.text);
                      double value = Double.parseDouble($comp.text);
                      String company = $emp.text;
                      driver = new Driver($email.text,$name.text,$pass.text,$rua.text,localDate,value,company);
                      boolean regista = umer.registerUser(driver,company);
                      System.out.println("registou emp:" +regista + "utilizadores:" + umer.getAllDrivers().size());  }
                  ;


registarCliente:'registar cliente' email=STRING name=STRING pass=STRING rua=STRING dat=DATA p=posicao {
                      LocalDate localDate = LocalDate.parse($dat.text);
                      Point2D.Double ponto = $p.pos;
                      client = new Client($email.text,$name.text,$pass.text,$rua.text,localDate);
                      client.setPosition(ponto);
                      boolean regista = umer.registerUser(client,null);
                      System.out.println("registou cliente:" +regista + "utilizadores:" + umer.getClients().size());  }


               ;

registarEmpresa: 'registar empresa' nome=STRING pass=STRING {
                boolean regista = umer.registerCompany($nome.text,$pass.text);
                System.out.println("registou: " + regista);

}
            ;


posicao returns [Point2D.Double pos]
      :'(' prim=DECIMAL ',' seg=DECIMAL')' {

              Point2D.Double po = new Point2D.Double();
              po.setLocation(Double.parseDouble($prim.text),Double.parseDouble($seg.text));
              $pos=po;}
      ;
/*
registar: 'registar condutor' email=STRING nome=STRING pass=STRING data=DATA valor=NUM {


  System.out.println("teste" + $email.text + "pass" + $pass.text + "data" + $data.text+ "valor" +$valor.text);


  }
        ;

/*
login: 'login' user=STRING pass=STRING {}
     ;

logout: 'logout'
      ;


recusar: 'recusar viagem'
       ;

solicitar: 'solicitar' '(' DECIMAL ',' DECIMAL ')'
         ;

log : EOF  {if (umer==null){System.out.println("ta a null");}  }
    ;

*/

log : EOF ;

/*
 *
 * TOKENS
 *
 */

/*uma string entre aspas */
STRING : '"' (~[\\"] | '\\' [\\"])* '"' ;

/** data no formato YYYY-MM-DD */
DATA : DIGIT DIGIT DIGIT DIGIT '-' DIGIT? DIGIT '-' DIGIT? DIGIT ;

/** dígito */
DIGIT : [0-9] ;

NUM : [0-9]*;

DECIMAL : [0-9]+('.'[0-9]+)?;

/** espaço em branco (que é ignorado) */
WS : [ \t\r\n]+ -> skip ;
