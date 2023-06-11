package Paginas;

public class Pag25_loop {
    public static void main(String[] args) {

        System.out.println("SEM LOOP: \n");

        // Repetição sem o Loop:
        System.out.println("1 ao quadrado = " + 1 * 1);
        System.out.println("2 ao quadrado = " + 2 * 2);
        System.out.println("3 ao quadrado = " + 3 * 3);
        System.out.println("4 ao quadrado = " + 4 * 4);
        System.out.println("5 ao quadrado = " + 5 * 5);

        // Repetição com o Loop for:

        System.out.println("\n" +
                " COM LOOP: \n");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i ao quadrado = " + i * i);
        } // fim do loop

        /*
         * Isso e otimo para:
         * contar
         * calcular vaores rapidamente!
         */
    }

}
