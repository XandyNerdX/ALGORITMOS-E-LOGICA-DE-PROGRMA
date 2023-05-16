
package ex01.pkg5.pkg1;

import java.util.Scanner;

public class Mes {
    public static void main(String[] args) {
        
      Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o numero de um mês: ");
        int mes = scanner.nextInt();
    
      
        
        switch (mes) { 
            case 1:
                System.out.println("Mes informado: " + mes + " (Janeiro)");
                break;
            case 2:
                System.out.println("Mês informado: " + mes + " (Fevereiro)");
                break;
            case 3:
                System.out.println("Mês informado: " + mes + " (Março)");
                break;
            case 4:
                System.out.println("Mês informado: " + mes + " (Abril)");
                break;
            case 5:
                System.out.println("Mês informado: " + mes + " (Maio)");
                break;
            case 6:
                System.out.println("Mês informado: " + mes + " (Junho)");
                break;
            case 7: 
                System.out.println("Mês informado: " + mes + " (Julho)");
                break;
            case 8:
                System.out.println("Mês informado: " + mes + " (Agosto)");
                break;
            case 9:
                System.out.println("Mês informado: " + mes + " (Setembro)");
                break;
            case 10:
                System.out.println("Mês informado" + mes + " (Outubro)");
                break;
            case 11:
                System.out.println("Mês informado: " + mes + " (Novembro)");
                break;
            case 12: 
                System.out.println("Mês informado: " + mes + " (Dezembro)");
                break;
                
                default: 
                    System.out.println("Mês invalido!");
        }
    }

}
                



