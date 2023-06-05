import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("1 --> Vermelho \n2 --> Verde \n3 --> Amarelo");
        Scanner color = new Scanner(System.in);
        System.out.println("Qual e a cor do sinal?");
        int corsinal = color.nextInt();

        if (corsinal == 1) {
            System.out.println("Vermelho, pare!");
        } else if (corsinal == 2) {
            System.out.println("Verde, prossiga!");
        } else if (corsinal == 3) {
            System.out.println("Amarelo, reduza a velocidade e pare!");
        } else {
            System.out.println("Numero não encotrado!");
        }

    }

}
