 package exercicios_sesao04_orancle;

import java.util.Scanner;

public class Exercicios_Sesao04_Orancle {

    /*
    Formula:

        int f = 1000;
        System.out.println("celsius: " + (f-32)* 5/9);
    */
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
            System.out.print("a TEMPERATURA EM Fahrenheit: ");
            int f = scanner.nextInt();
            System.out.println("Temperatura em Fahrenheit: " + (f-32)* 5/9);

    }
   }


