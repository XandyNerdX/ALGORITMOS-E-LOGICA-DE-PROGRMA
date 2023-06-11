/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora02numeros;

import java.util.Scanner;

/**
 *
 * @author netbeans
 */
public class Calculadora02numeros {

    

            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o numero: ");
        double x = scanner.nextInt();
        System.out.println("Informe o segundo numero: ");
        double y = scanner.nextInt();
        
        double rSoma = x + y;
        double rSub = x - y;
        double rDiv = x / y;
        double rMult = x * y;
        
        
        System.out.println("\n Soma: " + rSoma + "\n Subtração: " + rSub + "\n Divisão: " + rDiv + "\n Mutiplicação: " + rMult);
      
        
        
        
    }
    
}
