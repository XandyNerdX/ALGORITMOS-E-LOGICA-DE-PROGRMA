import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        System.out.print("Digite um número inteiro não negativo: ");
        Scanner console = new Scanner(System.in);

        int number = console.nextInt();

        while (number != -1) {
            // Processar o número
            System.out.println("Número informado: " + number);
            System.out.println("A raiz quadrada do numero informado: " + number * number);

            System.out.println("Para finalizar digite -1");
            System.out.println("Digite um numero inteiro não negativo: ");
            number = console.nextInt();
        }
        console.close();

    }

}
