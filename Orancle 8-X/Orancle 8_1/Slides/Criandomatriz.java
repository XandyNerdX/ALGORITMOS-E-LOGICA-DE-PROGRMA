import javax.sound.sampled.SourceDataLine;

public class Criandomatriz {
    int[] myIntArray; // Uma matriz que vai conter 100 numeros inteiros
    myIntArray=new int[100];
}

class matriz2 {
    int[] myIntArray = new int[100]; // Posso execultar as mesma duas linhas em apenas única etapa!
}

class ex {
    int[] ages = new int[3]; //
    ages[0] = 19;
    ages[1] = 42;
    ages[2] = 92;
    }
class ex2 {
    String[] names = new String[3]; //
    names[0] = "Mary";
    names[1] = "Bob";
    names[2] = "Carlos";
/*
 * names -> Nome da Variável
 * [2] -> índice
 * "Carlos" -> Valor
 */
    
}

class ex3 { //Pode declarar e inicializar a matriz em uma única etapa com valores conhecidos
    String[] names = {"Mary", "Bob", "Carlos"}; //Declaração e inicialização em uma etapa
    int[] ages = {25, 27, 48};
}

class ex4 { //Acessando elementos da Matriz
    int[] ages = {25, 27, 48};
    int myAge = ages[0];
    int yourAge = ages[1];
        System.out.println("Minha idade é " + ages[0]);


}
