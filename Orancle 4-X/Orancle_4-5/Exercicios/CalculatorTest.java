public class CalculatorTest {
    public static void main(String args[]) {
        Calculator calc = new Calculator();

        calc.tip = 0.10;
        calc.printTip();

        calc.findTotal();

        calc.tip = 0.10;
        calc.printTip();
    }
}

class Calculator {

    public double tip = 0.15;

    public void printTip() {
        System.out.println("Gorjeta: " + tip);

    }

    public void findTotal() {
        // calcula o total depoiis da taxa e da gorjeta
        // imprime esse valor
    }

}//