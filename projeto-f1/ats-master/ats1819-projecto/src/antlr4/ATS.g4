grammar ATS;

@header
{
  import java.awt.geom.Point2D;
  import java.time.LocalDate;
  import java.util.concurrent.ThreadLocalRandom;
  import java.util.*;
}

@members
{
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
      | login
      |logout
      | recusar
      |solicitar
      | viajar
      |end
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
                      System.out.println("registou:" +regista + "utilizadores:" + umer.getAllDrivers().size());

                      //Criar veiculo aletorio
                      String plate  = String.valueOf(contadormatriculas); contadormatriculas++;
                      Double reliable = ThreadLocalRandom.current().nextDouble(0, 100);
                      Point2D.Double position = new Point2D.Double(ThreadLocalRandom.current().nextDouble(0, 100),ThreadLocalRandom.current().nextDouble(0, 100));
                      Vehicle carro = new Car(plate, reliable, position,$email.text);
                      umer.registerVehicleP(carro);
                      System.out.println("Matricula : " + plate + " reliable: " + reliable + " condutor_ " + $email.text);
                      System.out.println("Numero de vehiculos : " + umer.getVehiclesP().size());
                      //criar veiculo aletorio

                      }

                  | 'registar condutor' email=STRING name=STRING pass=STRING rua=STRING dat=DATA comp=NUM emp=STRING {

                      LocalDate localDate = LocalDate.parse($dat.text);
                      double value = Double.parseDouble($comp.text);
                      String company = $emp.text;
                      driver = new Driver($email.text,$name.text,$pass.text,$rua.text,localDate,value,company);
                      boolean regista = umer.registerUser(driver,company);
                      System.out.println("registou emp:" +regista + "utilizadores:" + umer.getAllDrivers().size());

                      //Criar veiculo aletorio
                      String plate  = String.valueOf(contadormatriculas); contadormatriculas++;
                      Double reliable = ThreadLocalRandom.current().nextDouble(0, 100);
                      Point2D.Double position = new Point2D.Double(ThreadLocalRandom.current().nextDouble(0, 100),ThreadLocalRandom.current().nextDouble(0, 100));
                      Car carro = new Car(plate, reliable, position,$email.text);
                      umer.registerVehicleP(carro);

                      System.out.println("Matricula : " + plate + " reliable: " + reliable + " condutor_ " + $email.text);
                      System.out.println("Numero de vehiculos : " + umer.getVehiclesP().size());
                      //criar veiculo aletorio



                     }
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


login: 'login' nome=STRING pass=STRING {


                    String result = umer.loginUmer($nome.text,$pass.text);

                    if (result != null) {
                       key = $nome.text;
                       cla = result;
                       System.out.println("Sucesso no login!");

                    } else {System.out.println("Erro login");}
}
      ;


solicitar: 'solicitar' pos=posicao {
                  Point2D.Double ponto = $pos.pos;
                  Client client = umer.getClients().get(key);
                  Trip trip = umer.newTripClosest(client,ponto);

                  if (trip == null) {System.out.println("A VIAGEM VEIO VAZIA");}
                  else {

                      System.out.println("IUPI TEMOS VIAGEM");
                      viagensSolicitadas.add(trip);
                    //  System.out.println(trip.toString());

                  }


                }
                ;
viajar: 'viajar' {

            if (key != null) {
            int numA = viagensSolicitadas.size();
            Trip viajar = viajar(key);
            int numD = viagensSolicitadas.size();

            if (viajar==null) {System.out.println("Nao conseguiu viajar, nao tinha viagens!");}
            else {

                System.out.println("Cliente: " + viajar.getClient() + "DRIVER: " + viajar.getDriver() + "matricula :" + viajar.getLicencePlate() );

                try{
                umer.addTrip(  viajar.getClient(), viajar.getDriver(), trip.getLicencePlate(),viajar);
                System.out.println("Numero antes: " + numA + "Numero depois: " + numD);
            } catch (Exception e) {System.out.println("EXCEPAO!!" + e);}

            }
          } else {}

         }
        ;

recusar: 'recusar viagem' {
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
        ;

logout: 'logout' {
      key=null;
      cla=null;

}
      ;

posicao returns [Point2D.Double pos]
      :'(' prim=DECIMAL ',' seg=DECIMAL')' {

              Point2D.Double po = new Point2D.Double();
              po.setLocation(Double.parseDouble($prim.text),Double.parseDouble($seg.text));
              $pos=po;}
      ;


end : 'EOF' {
    System.out.println("EXECUTADO!");
    try{
      umer.saveUMeR("umerData-tests");
    } catch(Exception e) {System.out.println("ERRO :!!!!" + e);}
    }

    ;

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
