import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        System.out.println("Esse programa soma 10 numeros!");

        Scanner console = new Scanner(System.in);
        int sum = 0;

        while (number != 1) {
            System.out.println("Digite 1 para iniciar");
            int number = console.nextInt();
            number = console.nextInt();
            sum += number;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int value = console.nextInt();
            sum += number;
        }

        System.out.println("A soma dos 10 números é " + sum);

        while (number != -1) {
            System.out.print("Digite outro número (-1 para sair): ");
            number = console.nextInt();
            sum += number;
        }

        console.close();
    }
}
