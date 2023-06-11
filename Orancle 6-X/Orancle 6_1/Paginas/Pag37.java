package Paginas;

public class Pag37 {
    public static void main(String[] args) {
        int i = 10;
        for (; i >= 0; i--) {
            System.out.println(i);
        }
    }

    /*
     * Isso tmb funciona
     * mas i existe fora do escopo do loop for
     * se i for apenas um contador de loops, a variavel estara consumindo memoria
     * mantenha o escopo restrito (o mais restrito possivel)
     * variaveis perdidas complicam o codigo e aumenta a possibilidade de bugs!
     */

}
