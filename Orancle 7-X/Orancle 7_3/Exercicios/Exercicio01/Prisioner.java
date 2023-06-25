/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orancle.teste;

/**
 *
 * @author Alexandre Silva
 */
public class Prisioner {
    // Fields
    public double altura;
    public String name;
    public int sentence;
    public boolean verifica;

    // Construtor

    public Prisioner(String name, double altura, int sentence) {
        this.name = name;
        this.altura = altura;
        this.sentence = sentence;
        this.verifica = false;

        System.out.println("\nEste é um construtor\n");

        PrisionTeste prisioneiro = new PrisionTeste();

        System.out.println("Variable: " + prisioneiro);
        System.out.println("Nome: " + name);
        System.out.println("Altura: " + altura);
        System.out.println("Sentence: " + sentence);

        verifica = prisioneiro instanceof PrisionTeste;
        System.out.println(verifica);

        // Construtor

    }// fim do método setFields
     // fim do construtor

    public void think() {
        System.out.println("Eu terei minha vingança.");
    }// fim do método think

}// fim da classe Prisoner
