package ex01.pkg5.pkg1;

import java.util.Scanner;

public class AgeCheck {
   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        int myAge = scanner.nextInt();
          // Eu tenho 19; deixe-me ver se eu posso dirigir ainda
        
        if (myAge >= 16) {
            System.out.println("Tenho idade para ter carteira de motorista!");
        }
        else {
            System.out.println("Ainda não tenho idade suficiente... :*(");
        }
    }
}
    

