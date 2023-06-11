public class Pag13 {

    /*
     * Vamos retornar ao cenario de contagem regressiva
     * 
     * 
     * se trocar o i-- por i++ vai ficar num loop infinito!
     */
    public static void main(String[] args) {
        int i = 10;
        System.out.println("Contagem Regressiva para Lançamento!");
        while (i >= 0) {
            System.out.println(i);
            i--;
        }

        System.out.println("decolar");
    }

}
