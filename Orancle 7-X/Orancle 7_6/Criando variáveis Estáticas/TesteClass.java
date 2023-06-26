public class TesteClass {
    public static void main(String[] args) {
        int x;
        x = RedBumper.orientation; // Acesasr variável estatica

        RedBumper rb01 = new RedBumper(90); // Instância
        int y;
        y = rb01.rotation; // Acessar variável de instância

    }// fim do método main
}// fim da classe TestClass
