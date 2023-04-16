
Braço 
Localização
Status sensor
Energia
situação leitor

funções:

abaixarbraço (situação do braço)
	if Situação = "abaixarbraço";
		"Esta abaixando"
else 
	situação = "abaixar"


====================================================

public class Cancela{
    
//Declaração dos atributos para acessar a variavel, basta colocar nome cancela
    
    int situacao_braco = 0; //Braço abaixado ou levantando 
    
    public void abre_cancela(){ //Inicio da funcao cancela
        
            this.situacao_braco=1;
            
    }//Final da funcao abre cancela
        
            
        public void fecha_cancela(){ //Fecha cancela
        
        this.situacao_braco=0;
            
    }



    
    public static void main(String args[]) { //Inicio programa principal
        
        System.out.println("Meu programa ainda não faz nada");
        
                Cancela Primeira_cancela = new Cancela();
        
        System.out.println("criei minha primeira cancela");
         
        System.out.println("Recuperei o valor da primeira cancela que e: "+ Primeira_cancela.situacao_braco);
         
               Primeira_cancela.abre_cancela();
        
         System.out.println("Abrir primeira cancela");
         
         
         System.out.println("O valor da situacao_braco é:"+ Primeira_cancela.situacao_braco);
         
             Primeira_cancela.fecha_cancela();
        
         System.out.println("agora Fechei cancela");
         
        System.out.println("o valor da situacao_braco é: "+ Primeira_cancela.situacao_braco);

        
        if (Primeira_cancela.situacao_braco == 0) {
            System.out.println("A cancela está fechada");
            
    }else{ 
    
            System.out.println("A cancela está Aberta");
        
    }
        }//Final da função principal 
    }//Final da class cancela