import java.time.Period;
import java.util.Scanner;

public class Ex01 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o preço do ingresso de cinema \n");
        double valoringresso = scanner.nextDouble();
        // Solicita ao usuario que insira o valor do ingresso

        boolean preco = 12 >= valoringresso;
        // Porque usar boolean e não int ou double?
        /*
         * No contexto do código fornecido, a utilização do tipo de dado boolean é
         * apropriada, pois o objetivo é verificar se o valor do ingresso é menor ou
         * igual a 12, resultando em uma resposta verdadeira (true) ou falsa (false).
         */

        if (preco) {
            System.out.println("Estou interresado em assistir o filme.");
        } else {
            System.out.println("Não estou interessado em assistir o filme.");
        }

    }
}
