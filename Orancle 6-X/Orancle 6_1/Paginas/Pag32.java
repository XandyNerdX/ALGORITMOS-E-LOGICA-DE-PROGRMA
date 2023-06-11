package Paginas;

import java.util.Scanner;

public class Pag32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 100;
        int total = 0;

        System.out.println("Este programa adiciona" + n + "Numeros.");
        for (int i = 0; i < n; i++) {
            System.out.println("Digite seu proximo numero: ");
            int value = in.nextInt();
            total += value;
        } // fim for
        System.out.println("O total: " + total + ".");
    }

}
