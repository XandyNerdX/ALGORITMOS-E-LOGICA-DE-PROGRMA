package orancle7.pkg4;

public class PrisonTest {
    public static void main(String[] args) {
        Prisioner p01 = new Prisioner();
        Prisioner p02 = new Prisioner();

        Cell c01 = new Cell();
        Guard g01 = new Guard();

        p01.prisonerCount(); // Quantidade de Prisoneiros (Usei o prisoneiro 01 ele fica em cima!)

        p01.setName("Bubba", 1.75, 4); // acessado campo nome
        p01.displayPrisoneiro(); // Chamando um método

        p02.setName("twitch", 1.70, 3);
        p02.displayPrisoneiro();

        c01.setName("A1"); // acessado campo nome
        c01.displayCell(); // Chamando um método

        g01.name = "Boss Man";

    }

}

// class cell
