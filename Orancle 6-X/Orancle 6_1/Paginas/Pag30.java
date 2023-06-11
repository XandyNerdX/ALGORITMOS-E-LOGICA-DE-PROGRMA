package Paginas;

import java.util.Scanner;

public class Pag30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Este programa adiciona quatro números.");
        System.out.println("Digite cada numero seguido de Enter.");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int n4 = in.nextInt();
        int total = n1 + n2 + n3 + n4;
        System.out.println("O total é " + total + ".");
    }

}
