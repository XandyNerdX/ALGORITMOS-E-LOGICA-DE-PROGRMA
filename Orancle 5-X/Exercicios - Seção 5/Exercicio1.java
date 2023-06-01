import java.util.Scanner;
import java.util.concurrent.locks.Condition;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o comprimento da onda: ");
        double comprimentoOnda = sc.nextDouble();

        if (comprimentoOnda >= 380 && comprimentoOnda < 450) {
            System.out.println("A cor correspondente é Violeta.");

        } else if (comprimentoOnda >= 450 && comprimentoOnda < 495) {
            System.out.println("A cor correspondente é Azul.");

        } else if (comprimentoOnda >= 495 && comprimentoOnda < 570) {
            System.out.println("A cor correspondente é Verde.");

        } else if (comprimentoOnda >= 570 && comprimentoOnda < 590) {
            System.out.println("A cor correspondente é Amarelo");

        } else if (comprimentoOnda >= 590 && comprimentoOnda < 620) {
            System.out.println("A cor correspondente é Laranja");

        } else if (comprimentoOnda >= 620 && comprimentoOnda < 750) {
            System.out.println("A cor correspondente é Vermelho");

        } else {
            System.out.println("O comprimento de onda fornecido está fora do espectro visível.");
        }

    }
}