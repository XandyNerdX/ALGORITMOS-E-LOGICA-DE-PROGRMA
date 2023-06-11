package carrinhodecompras;

public class CarrinhoDeCompras {
    
    double precoDaCamisa = 15; 
    double precoDaCalca = 20;
    double imposto = 0.1;
    int quantidadecamisa = 0;
    int quantidadecalca = 0;
    double precoTotal = 0;
    double totalcalca;

    String mensagemCamisa = "Quantidade de camisa: "; 
    String mensagemCalca =  "Quantidade de calca: ";
    String Mvalorcalca01 = "Valor total calças: R$";
    String Mvalorcamisa01 = "Valor total Camisas: R$";
    
    public static void main(String[] args) {
        CarrinhoDeCompras c = new CarrinhoDeCompras();
        c.quantidadecamisa = 3;
        System.out.println(c.mensagemCamisa + ": " + c.quantidadecamisa);
        c.precoTotal = c.quantidadecamisa*c.precoDaCamisa;
        System.out.println(c.Mvalorcamisa01+": "+c.precoTotal);
        
        c.quantidadecalca = 10;
        System.out.println(c.mensagemCalca + ": " + c.quantidadecalca);
        c.precoTotal = c.quantidadecalca*c.precoDaCalca;
        System.out.println(c.Mvalorcalca01+": "+c.precoTotal);
        
        c.precoTotal = c.quantidadecamisa * c.precoDaCamisa + c.quantidadecalca*c.precoDaCalca;
        System.out.println("Valor total R$: "+ c.precoTotal);

    }
}