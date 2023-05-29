import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        System.out.print("Digite a idade \n");
        Scanner keyboard = new Scanner(System.in);
        int idade = keyboard.nextInt();
        int tarifa;

        System.out.println("Idade:18 " + idade + "\n"
                + (idade == 11 ? "Tarifa: U$3" : "Tarifa: U$5"));
    }
}
