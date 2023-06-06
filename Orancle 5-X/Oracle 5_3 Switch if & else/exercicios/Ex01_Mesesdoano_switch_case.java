import java.security.Principal;
import java.util.Scanner;

public class Ex01_Mesesdoano_switch_case {

    public static void main(String args[]) {
        System.out.println("Insira um numero do mês!");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        try {
            int data = Integer.parseInt(input);

            switch (data) {
                case 1:
                    System.out.println("Janeiro" + "Numero do mes: " + data);
                    break;
                case 2:
                    System.out.println("Fevereiro");
                    break;
                case 3:
                    System.out.println("Março");
                    break;
                case 4:
                    System.out.println("Abril");
                    break;
                case 5:
                    System.out.println("Maio");
                    break;
                case 6:
                    System.out.println("Junho");
                    break;
                case 7:
                    System.out.println("Julho");
                    break;
                case 8:
                    System.out.println("Agosto");
                    break;
                case 9:
                    System.out.println("Setembro");
                    break;
                case 10:
                    System.out.println("Outubro");
                    break;
                case 11:
                    System.out.println("Novembro");
                    break;
                case 12:
                    System.out.println("Dezembro");
                    break;

                default:
                    System.out.println("Mês invalido!");

            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Digite um número inteiro.");
        }
    }
}
