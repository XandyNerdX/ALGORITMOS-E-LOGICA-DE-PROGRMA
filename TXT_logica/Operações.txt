
package calculadora;

public class Calculadora {     
    int operacao; 
      int numX=0;
      int numY=0;
      int resultado=0; 


          


    public Calculadora() {
        this.operacao = 0;
    }

    // Preciso de operações (Variaveis) 
    
    
    
    
    public void Soma(int a, int b) {
    //SOMA    
        this.numX=a;
        this.numY=b;
        this.resultado=this.numX+this.numY;
            System.out.println("A soma do numero:"+this.numX+"A soma do numero"+this.numY+"Resultado"+this.resultado);

    
    
        //System.out.println("Teste teste");
        
        
    }
    
        public void Subtrair(int a, int b) {
                
    //SUBTRAIR   
        
        this.numX=a;
        this.numY=b;
        this.resultado=this.numX-this.numY;
            System.out.println("A soma do numero:"+this.numX+"A soma do numero"+this.numY+"Resultado"+this.resultado);
    
    }
        
        public void Dividir(int a, int b){
            
    //Dividir
        this.numX=a;
        this.numY=b;
        this.resultado=this.numX/this.numY;
            System.out.println("A soma do numero:"+this.numX+"A soma do numero"+this.numY+"Resultado"+this.resultado);        
    
    
    }
        
        public void Multiplicar(int a, int b) {
            
    //Multiplicar      
        this.numX=a;
        this.numY=b;
        this.resultado=this.numX*this.numY;
            System.out.println("A soma do numero:"+this.numX+"A soma do numero"+this.numY+"Resultado"+this.resultado);
            
    }
    
        public static void main(String[] args) {
            System.out.println("Teste");
            
        }
        
}
