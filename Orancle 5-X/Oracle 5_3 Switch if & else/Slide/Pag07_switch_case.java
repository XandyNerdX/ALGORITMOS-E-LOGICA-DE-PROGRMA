import java.util.Scanner;

public class Pag07_switch_case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Em que grande você está?");
        String input = in.nextLine();

        try {
            int grade = Integer.parseInt(input);

            switch (grade) {
                case 9:
                    System.out.println("Você é um calouro");
                    break;
                case 10:
                    System.out.println("Você é um estudante do segundo ano");
                    break;
                case 11:
                    System.out.println("Você é um júnior");
                    break;
                case 12:
                    System.out.println("Você é um sênior");
                    break;
                default:
                    System.out.println("Grau inválido");
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Digite um número inteiro.");
        }
    }
}
