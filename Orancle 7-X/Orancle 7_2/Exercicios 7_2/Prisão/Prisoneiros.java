
public class Prisoneiros {
    public String nome;
    public String apelido;
    public boolean verifica;
    public double altura;
    public double anoscondecao;
    public int x = 1, y = 2;

    public void display() {

        System.out.println("\n =-=-=-=-=-= Prisoneiro =-=-=-=-=-= \n");

        System.out.println("Nome: " + nome);
        System.out.println("Apelido: " + apelido);
        System.out.println("Altura: " + altura);
        System.out.println("Sentença: " + anoscondecao + " Anos!");

        // comparando nomes, usando boolean
        verifica = nome == apelido;

        System.out.println("Nome e apelido e o mesmo? " + verifica);

        // usando memoria stack para verificar

        verifica = x == y;
        System.out.println(verifica);

        // comparando objetos

    }
}
