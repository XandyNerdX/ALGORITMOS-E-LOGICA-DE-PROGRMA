import java.util.Scanner;

public class Exercico4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(javac.class.getResourceAsStream("input04text.txt"));      
        
        //Edit these lines to advance the scanner
        sc.nextLine();
        System.out.println(sc.nextLine());

        String line = sc.nextLine();
        while (!line.contains("BlueBumper")); {
            line = sc.next();
        }
            System.out.println(line);

        int xPosicao = sc.nextInt();
        int yPosicao = sc.nextInt();
        
        System.out.println("X: " + xPosicao + ", Y: " + yPosicao);
        sc.close();
    }    
}
