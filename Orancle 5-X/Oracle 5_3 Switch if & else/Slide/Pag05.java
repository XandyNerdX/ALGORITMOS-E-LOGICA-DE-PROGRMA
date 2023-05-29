import java.util.Scanner;

public class Pag05 {

    public static void main(String[] args) {
        System.out.print("Digite sua nota: ");
        Scanner in = new Scanner(System.in);
        int grande = in.nextInt();
        if (grande == 9) {
            System.out.println("Você é um calouro");
        } else if (grande == 10) {
            System.out.println("Você é um estudante do segundo ano");
        } else if (grande == 11) {
            System.out.println("Você é um júnior");
        } else if (grande == 12) {
            System.out.println("Você é um sênior");
        } else {
            System.out.println("Nota inválida");
        }
    }
}
