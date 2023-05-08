//<<<<<<< HEAD
 package exercicios_sesao04_orancle;
//=======

//>>>>>>> 8277c46020d8928317caa3967a8790ee92fa78ef

//<<<<<<< HEAD
import java.util.Scanner;

//=======
import java.util.Random;
import java.util.Scanner;

//>>>>>>> 8277c46020d8928317caa3967a8790ee92fa78ef
public class Exercicios_Sesao04_Orancle {

//<<<<<<< HEAD
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
   
//=======
    /*
    Formula:
        int f = 1000;
        System.out.println("celsius: " + (f-32)* 5/9);
    */

    //⦁	Converte a temperatura fornecida de Fahrenheit para Celsius.
    

    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("|             Converte a temperatura fornecida de Fahrenheit para Celsius.          | ");
        System.out.println("-------------------------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a temperatura em Fahrenheit: ");
        int f = scanner.nextInt();
        System.out.println("Temperatura em Grau celsius: " + (f-32)* 5/9);

        
        
        //⦁	Calcula o tamanho da hipotenusa de um triângulo dado o comprimento de seus lados.
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("| Calcula o tamanho da hipotenusa de um triângulo dado o comprimento de seus lados  | ");
        System.out.println("-------------------------------------------------------------------------------------");
        
        System.out.print("Informe comprimento do primeiro cateto: ");
        double cateto1 = scanner.nextDouble();

        System.out.print("Informe comprimento do segundo cateto: ");
        double cateto2 = scanner.nextDouble();

        double hipotenusa = Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
        System.out.print("Hipotenusa: " + hipotenusa);

       
       
        System.out.println("\n-------------------------------------------------------------------------------------");
        System.out.println("|                    Gera um numero aleatorio entre 1 e 6                           | ");
        System.out.println("-------------------------------------------------------------------------------------");


            Random random = new Random();
                int dado1 = random.nextInt(6) + 1;
                int dado2 = random.nextInt(6) + 1;
                int soma01 = dado1 + dado2;
// gera um número aleatório entre 1 e 6

      


            System.out.print("\n Dado 1: " + dado1);
            System.out.print("\n Dado 2: " + dado2);
            System.out.print("\n Soma dos dados: " + soma01);

        
       
       
       
        //Problema 2: Processando um nome

        /*
        Visão Geral

                Neste exercício, você desenvolverá um programa java que processa um nome inserido pelo usuário. 
                O programa faz o seguinte:
                Lê o primeiro e o último nomes (lê uma linha inteira como uma única string) e imprime o último nome 
                seguido de uma vírgula e da primeira inicial. (Considere que o usuário digite um nome válido.) 

        */

        System.out.println("\n-------------------------------------------------------------------------------------");
        System.out.println("|                    Processando um nome                                             | ");
        System.out.println("-------------------------------------------------------------------------------------");

        System.out.print("Informe seu nome por completo: ");
        String nome = scanner.nextLine();

            int posicaoUltimoEspaco = nome.lastIndexOf(" ");
            if (posicaoUltimoEspaco == -1) {
        System.out.println("Nome invalido.");
        
            } else {
                
                String primeiroNome = nome.substring(0, posicaoUltimoEspaco);
                String ultimoNome = nome.substring(posicaoUltimoEspaco + 1);
                String resultado = ultimoNome + ", " + primeiroNome;

        System.out.println("O seu nome é: " + resultado);
}
//>>>>>>> 8277c46020d8928317caa3967a8790ee92fa78ef

//<<<<<<< HEAD


//=======

  }
       
    }

//>>>>>>> 8277c46020d8928317caa3967a8790ee92fa78ef
