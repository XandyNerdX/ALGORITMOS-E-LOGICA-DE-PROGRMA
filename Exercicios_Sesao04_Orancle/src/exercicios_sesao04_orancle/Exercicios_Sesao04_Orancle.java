package exercicios_sesao04_orancle;

import java.util.Random;
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

       
       
       //3. Simula o giro de dois dados de seis lados e exibe a soma deles. 


            Random random = new Random();
                int dado1 = random.nextInt(6) + 1;
                int dado2 = random.nextInt(6) + 1;
                int soma01 = dado1 + dado2;
// gera um número aleatório entre 1 e 6

            System.out.print("\n Dado 1: " + dado1);
            System.out.print("\n Dado 2: " + dado2);
            System.out.print("\n Soma dos dados: " + soma01);

        }
       
       
       
        //Problema 2: Processando um nome

        /*
        Visão Geral

                Neste exercício, você desenvolverá um programa java que processa um nome inserido pelo usuário. 
                O programa faz o seguinte:
                Lê o primeiro e o último nomes (lê uma linha inteira como uma única string) e imprime o último nome 
                seguido de uma vírgula e da primeira inicial. (Considere que o usuário digite um nome válido.) 

        */

       


    }
