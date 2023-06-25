/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orancle.pkg7_1;

/**
 *
 * @author Alexandre Silva
 */
public class SavingsAccount {
    public double balance;
    public double interestRate;
    public String name;
   
    
   public void deposit(int x) {
        balance += x;
    }// fim do método deposit
   
    public double calcInterest(){
        double interest = balance * interestRate / 12;
        return interest;
}//fim do método calcInterest
    
    public double calculate(int x, double y){
double quotient = x/y;
return quotient;
}//fim do método calculate

    public void displayCustomer() {
        System.out.println("Cliente: " + name);
        System.out.println("Saldo: " + balance);
        System.out.println("Taxa: " + interestRate);
    }// fim do método displayCustomer
    
    
}// fim da classe SavingsAccount
    

