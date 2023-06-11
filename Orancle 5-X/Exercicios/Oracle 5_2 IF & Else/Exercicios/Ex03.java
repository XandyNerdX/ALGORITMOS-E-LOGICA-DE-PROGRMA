import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        System.out.print("Digite a idade \n");
        Scanner keyboard = new Scanner(System.in);
        int idade = keyboard.nextInt();
        int tarifa;

        if (idade <= 11 || idade >= 65) {
            tarifa = 3;
            System.out.println("Idade: " + idade + "\n" + "Tarifa: " + tarifa);
        } else if (idade <= 64) {
            tarifa = 5;
            System.out.println("Idade: " + idade + "\n" + "Tarifa: " + tarifa);
        }

    }
}
