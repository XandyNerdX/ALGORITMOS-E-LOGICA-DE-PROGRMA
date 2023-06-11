import java.net.SocketTimeoutException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe seu peso: ");
            double peso = scanner.nextDouble();
            // Solicita ao usuario que insira sua altura

            System.out.println("Informe sua altura: ");
            double altura = scanner.nextDouble();
            // Solicita ao usuario que insira sua altura

            double imc = peso / (altura * altura);
            // calcula o imc

            DecimalFormat formato = new DecimalFormat("#.##");
            String imcFormatado = formato.format(imc);
            // limitei o número de casas decimais para duas!

            System.out.println("Seu IMC: " + imcFormatado);

            // infoma como esta seu peso de acordo com IMC100

            if (imc < 18.5) {
                System.out.println("Abaixo do peso normal");
            } else if (imc >= 18.5 && imc <= 24.9) {
                System.out.println("Peso normal");
            } else if (imc >= 25.0 && imc <= 29.9) {
                System.out.println("Excesso de peso");
            } else if (imc >= 30.0 && imc <= 34.9) {
                System.out.println("Obesidade classe I");
            } else if (imc >= 35.0 && imc <= 39.9) {
                System.out.println("Obesidade classe II");
            } else {
                System.out.println("Obesidade classe III");
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro na entrada. Verifique os valores inseridos.");
            // catch O bloco catch é usado em conjunto com o bloco try para capturar
            // exceções (erros)
        }

    }
}