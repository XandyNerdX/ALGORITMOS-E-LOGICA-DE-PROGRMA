package Paginas;

public class Pag28_Escopodavariavel {
    public static void main(String[] args) {
        System.out.println();

        for (int i = 0; i <= 5; i++) {
            System.out.println("i: " + i);
        } // fim for
        System.out.println("i: " + i);
    }// fim do metodo main

    /*
     * O erro do compilador é gerado na linha 10
     * 
     * A variavel i declarada no loop for é uma variável local e não pode ser
     * acessada fora do loop
     */

}
