
package ex01.pkg5.pkg1;

import java.util.Scanner;

public class Impar_ou_par {
    
            
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
            System.out.println("Informe o numero: ");
            int x = scanner.nextInt();
   
            
        if (x%2 == 0){
            System.out.println("O numero: " + x + "\nE um numero par!");
        }
        else {
            System.out.println("O numero: " + x + "\nE um numero impar!");
        }
                    
    }
    
}
