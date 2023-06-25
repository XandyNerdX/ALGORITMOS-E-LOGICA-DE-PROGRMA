/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orancle.pkg7_1;

/**
 *
 * @author Alexandre Silva
 */
public class AccountTest {
        public static void main(String[] args) {
        SavingsAccount sa0001 = new SavingsAccount();
        sa0001.balance = 1000;
        sa0001.name = "Damien";
        sa0001.deposit(1000 + 100);
        sa0001.interestRate = 0.02;
        sa0001.balance = 1000;
        sa0001.balance += sa0001.calcInterest();
        
        sa0001.displayCustomer();

        SavingsAccount sa0002 = new SavingsAccount();
        sa0002.balance = 2000;
        sa0002.name = "Bill";
        sa0001.deposit(2000 + 200);
        
        sa0002.displayCustomer();

    }// fim do método main
    
}
