import java.util.Scanner;

public class Pag14 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;

        System.out.println("Informe um numero (-1 para encerrar): ");
        int num = console.nextInt();
        while (num != 1) {
            sum = sum + num;
            System.out.println("Informe um numero (-1 para encerrar): ");
            num = console.nextInt();
        } // fim while
        System.out.println("A soma é " + sum);
    }

    /*
     * Os loops while geralmente são usados com uma entrada utilizando a classe
     * Scanner.
     */

}
