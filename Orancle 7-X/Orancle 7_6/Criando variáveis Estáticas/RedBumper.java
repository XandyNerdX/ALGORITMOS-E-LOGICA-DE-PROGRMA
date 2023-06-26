public class RedBumper {
    // campos
    public static int orientation = 45; // Variável estática
    public int rotation; // variável de instância

    // Construtor
    public RedBumper(int rotation) {
        this.rotation = rotation;
    }// fim construtor

    // Métodos
    public void display() {
        System.out.println(orientation); // Acessar variável estátiva
        System.out.println(rotation); // Acessar variável de instância
    }// fim do método display

} // fim da classe RedBumper