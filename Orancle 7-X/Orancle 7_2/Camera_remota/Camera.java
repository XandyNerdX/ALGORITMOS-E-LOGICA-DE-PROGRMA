import java.rmi.Remote;

public class Camera {

    //Exemplo 01: Trabalhando com referencia!
    
    Camera remote01 = new Camera();
    Camera remote02 = new Camera();

    remote1.play();
    remote2.play();

    //Exemplo 02: Trabalhando com referencia!



    Camera remote1 = new Camera(); //new --> so existe um objeto! (CAMERA!)
    Camera remote2 = remote1;

    //Camera --> Tipo de referencia
    //remote1 --> Variavel de referencia
    //New camera --> Tipo de objeto

    TV remote3 = new TV();
    remote3.menu();

    remote1.play();
    remote2.stop();

    


}
