package Exercicios;

public class Ex03 {
    public static void main(String[] args) {

        for (int i = 64; i > 0; i = i / 2) {
            System.out.print(i + " ");
        }

        System.out.println("");
        for (int j = 0; j <= 5; j++) {
            System.out.print(j + " ");
        }

        System.out.println("");
        for (int j = 5; j >= 0; j--) {
            System.out.print(j + " ");
        }

        System.out.println("");
        for (int k = 2; k <= 64; k = k * 2) {
            System.out.print(k + " ");
        }

    }
}
