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
        } catch (Exception e) {
            System.out.println("Ocorreu um erro na entrada. Verifique os valores inseridos.");
            // catch O bloco catch é usado em conjunto com o bloco try para capturar
            // exceções (erros)
        }
    }
}