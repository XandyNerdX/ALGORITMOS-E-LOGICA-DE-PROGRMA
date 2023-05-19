package ex01.pkg5.pkg1;

public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

	// numeric fields
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
	double total;
	String message = custName+" quer comprar "+quantity+" "+itemDesc;

        boolean outOfStock;
	// Calculating total cost
        total = (price*quantity)*tax;

        if (total > 1){
            System.out.println(message);
        }
        
        // Declare a variável outOfStock e inicialize-a
        
        
        // Quantidade de teste e modifique a mensagem se a quantidade > 1.
         
        
        // Teste outOfStock e notifique o usuário em ambos os casos.
        
        
        
    }
    
}


