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
}

/**
 *
 * REGRAS
 *
 */

actions : action ';' actions
        | action ';'
;

action : registo
       | login
       | logout
       | recusar
       | solicitar
       | viajar
       | end
;

registo : registarCondutor
        | registarCliente
        | registarEmpresa
;

registarCondutor : 'registar condutor' email=STRING name=STRING pass=STRING rua=STRING dat=DATA comp=NUM 
{
    LocalDate localDate = LocalDate.parse($dat.text);
    double value = Double.parseDouble($comp.text);
    String company = null;
    driver = new Driver($email.text,$name.text,$pass.text,$rua.text,localDate,value,company);

    // Criar veiculo aletorio
    String plate  = String.valueOf(contadormatriculas); contadormatriculas++;
    Double reliable = ThreadLocalRandom.current().nextDouble(0, 100);
    Point2D.Double position = new Point2D.Double(ThreadLocalRandom.current().nextDouble(0, 100), ThreadLocalRandom.current().nextDouble(0, 100));
    Vehicle carro = new Car(plate, reliable, position,$email.text);
    umer.registerVehicleP(carro);
    System.out.println("Matricula : " + plate + " reliable: " + reliable + " condutor_ " + $email.text);
    System.out.println("Numero de vehiculos : " + umer.getVehiclesP().size());
    
    // Registar veiculo no condutor
    driver.setVehicle(plate);
    boolean regista = umer.registerUser(driver,company);
    System.out.println("registou:" +regista + "utilizadores:" + umer.getAllDrivers().size());
}
| 'registar condutor' email=STRING name=STRING pass=STRING rua=STRING dat=DATA comp=NUM emp=STRING 
{
    LocalDate localDate = LocalDate.parse($dat.text);
    double value = Double.parseDouble($comp.text);
    String company = $emp.text;
    driver = new Driver($email.text,$name.text,$pass.text,$rua.text,localDate,value,company);
    // boolean regista = umer.registerUser(driver,company);

    //Criar veiculo aletorio
    String plate  = String.valueOf(contadormatriculas); contadormatriculas++;
    Double reliable = ThreadLocalRandom.current().nextDouble(0, 100);
    Point2D.Double position = new Point2D.Double(ThreadLocalRandom.current().nextDouble(0, 100), ThreadLocalRandom.current().nextDouble(0, 100));
    Car carro = new Car(plate, reliable, position, $email.text);
    umer.registerVehicleP(carro);

    System.out.println("Matricula : " + plate + " reliable: " + reliable + " condutor_ " + $email.text);
    System.out.println("Numero de vehiculos : " + umer.getVehiclesP().size());

    //registar veiculo condutor_
    driver.setVehicle(plate);
    boolean regista = umer.registerUser(driver, company);
    System.out.println("registou emp:" +regista + "utilizadores:" + umer.getAllDrivers().size());
}
;

registarCliente : 'registar cliente' email=STRING name=STRING pass=STRING rua=STRING dat=DATA p=posicao 
{
    LocalDate localDate = LocalDate.parse($dat.text);
    Point2D.Double ponto = $p.pos;
    client = new Client($email.text, $name.text, $pass.text, $rua.text, localDate);
    client.setPosition(ponto);
    boolean regista = umer.registerUser(client, null);
    System.out.println("registou cliente:" + regista + "utilizadores:" + umer.getClients().size());  
}
;

registarEmpresa : 'registar empresa' nome=STRING pass=STRING
{
    boolean regista = umer.registerCompany($nome.text, $pass.text);
    System.out.println("registou: " + regista);
}
;

registarCarro : 'registar carro' matricula=STRING preco=NUM pos=posicao emailOwner=STRING
{
    Point2D.Double ponto = $pos.pos;
 
    Vehicle v = new Vehicle();
    v.setLicencePlate(matricula);
    v.setPrice(preco);
    v.setPosition(ponto);
    v.setOwner(emailOwner);
    
    if (umer.getCompanies().containsKey(emailOwner) {
        // Adicionar o carro à respetiva empresa e ao total de veículos.
        umer.registerCompanyVehicle(emailOwner, v);
    } else if (umer.getAllDrivers().containsKey(emailOwner)) {
        // Adicionar o carro ao respetivo condutor e ao total de veículos.
        Driver d = umer.getAllDrivers.get(emailOwner);
        d.setVehicle(matricula);
        
        umer.getAllDrivers().replace(emailOwner, d);
    } else {
        // Email não existente. Adicionar o carro ao total de veículos.
        umer.getAllVehicles().put(matricula, v);
    }
}
;

registarCarrinha : 'registar carrinha' matricula=STRING preco=NUM pos=posicao emailCondutor=STRING
{
                    
}
;

registarMota : 'registar mota' matricula=STRING preco=NUM pos=posicao emailCondutor=STRING
{

}
;

registarHeli : 'registar helicoptero' matricula=STRING preco=NUM pos=posicao emailCondutor=STRING
{
                
}
;

login : 'login' nome=STRING pass=STRING
{
    String result = umer.loginUmer($nome.text,$pass.text);
    
    if (result != null) {
        key = $nome.text;
        cla = result;
        System.out.println("Sucesso no login!");
    } else 
        System.out.println("Erro login");
}
;


solicitar : 'solicitar' pos=posicao 
{
    Point2D.Double ponto = $pos.pos;
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
;

viajar : 'viajar' 
{
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
;

recusar : 'recusar viagem'
{
    int numA = viagensSolicitadas.size();
    Trip viajar = viajarQualquer();
    int numD = viagensSolicitadas.size();
    
    if (viajar != null) {
        System.out.println("Viagem removida com sucesso; numero de viagens \n" +"tam antes: " + numA + "tam depois" + numD);
    } else {
        System.out.println("Nao conseguiu remover, nao tinha viagens!");
    }
}
;

logout : 'logout'
{
    key = null;
    cla = null;
}
;

posicao returns [Point2D.Double pos] : '(' prim=DECIMAL ',' seg=DECIMAL')' 
{
    Point2D.Double po = new Point2D.Double();
    po.setLocation(Double.parseDouble($prim.text), Double.parseDouble($seg.text));
    $pos = po;
}
;


end : 'EOF' 
{
    System.out.println("EXECUTADO! Viagens Retidas: " + viagensSolicitadas.size());
    try {
        umer.saveUMeR("umerData-tests");
    } catch (Exception e) {
        System.out.println("ERRO! : " + e);
    }
}
;


/*
 *
 * TOKENS
 *
 */

/* Uma String entre aspas */
STRING : '"' (~[\\"] | '\\' [\\"])* '"' ;

/* Data no formato YYYY-MM-DD */
DATA : DIGIT DIGIT DIGIT DIGIT '-' DIGIT? DIGIT '-' DIGIT? DIGIT ;

/* Dígito */
DIGIT : [0-9] ;

NUM : [0-9]*;

DECIMAL : [0-9]+('.'[0-9]+)?;

/* Espaço em branco (que é ignorado) */
WS : [ \t\r\n]+ -> skip ;
