package exercicios_sesao04_orancle;

import java.util.Scanner;

public class Exercicios_Sesao04_Orancle {

    /*
    Formula:
        int f = 1000;
        System.out.println("celsius: " + (f-32)* 5/9);
    */

    //⦁	Converte a temperatura fornecida de Fahrenheit para Celsius.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a TEMPERATURA EM Fahrenheit: ");
        int f = scanner.nextInt();
        System.out.println("Temperatura em Fahrenheit: " + (f-32)* 5/9);

        //⦁	Calcula o tamanho da hipotenusa de um triângulo dado o comprimento de seus lados.
        System.out.print("Comprimento do primeiro cateto: ");
        double cateto1 = scanner.nextDouble();

        System.out.print("Comprimento do segundo cateto: ");
        double cateto2 = scanner.nextDouble();

        double hipotenusa = Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
        System.out.print("Hipotenusa: " + hipotenusa);
    }
}