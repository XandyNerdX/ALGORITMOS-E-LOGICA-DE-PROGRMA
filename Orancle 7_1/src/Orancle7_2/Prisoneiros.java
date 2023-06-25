package Orancle7_2;

public class Prisoneiros {
    public String nome;
    public String apelido;
    public boolean verifica;
    public double altura;
    public double anoscondecao;
    
    

    public void display() {
        
        System.out.println("\n =-=-=-=-=-= Prisoneiro =-=-=-=-=-= \n");
        
        System.out.println("Nome: " + nome);
        System.out.println("Apelido: " + apelido);
        System.out.println("Altura: " + altura);
        System.out.println("Sentença: " + anoscondecao + " Anos!");
        
        //comparando nomes, usando boolean
        verifica = nome == apelido;
        
        System.out.println("Mesmo nome e apelido? " + verifica);
        
        //System.out.println(nome == apelido);
        

        
    }
}

