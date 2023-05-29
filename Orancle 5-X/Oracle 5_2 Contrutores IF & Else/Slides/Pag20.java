public class Pag20 {
    public static void main(String[] args) {
        int numberOfGoals = 5;
        String s;
        if (numberOfGoals == 1) {
            s = "gol";
        } else {
            s = "gols";
        } // fim do if
        System.out.println("Marquei: " + numberOfGoals + " " + s);

        int numberOfGoals01 = 1;

        System.out.println("Marquei " + numberOfGoals01 + " "
                + (numberOfGoals01 == 1 ? "gol" : "gols"));

    }// fim do metodo main
}
