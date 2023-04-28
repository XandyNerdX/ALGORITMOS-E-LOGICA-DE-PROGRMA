/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculatorteste;


public class calculatorteste {
    public static void main(String[] args) {
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
    
    public void printTip(){
        System.out.println("Goeta: "+ tip);
        
    }
    
    public void findTotal(){
        
    }
    
}