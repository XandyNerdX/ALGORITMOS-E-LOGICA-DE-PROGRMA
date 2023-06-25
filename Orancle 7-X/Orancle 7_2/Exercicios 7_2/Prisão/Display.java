public class Display {
    public static void main(String[] args) {

        int x = 1; // Memoria Stack
        int y = 2; // Memoria Stack

        Prisoneiros bubba = new Prisoneiros();
        Prisoneiros twitch = new Prisoneiros();

        bubba = twitch; // Memoria stack

        bubba.nome = "bubba";
        twitch.nome = "twitch";

        bubba.apelido = "bubba";
        twitch.apelido = "Bubba";

        bubba.altura = 2.08;
        twitch.altura = 2.08;

        bubba.anoscondecao = 4;
        twitch.anoscondecao = 4;

        bubba.display();

        System.out.println("" + "Endereço da memoria: " + bubba); // endereço de memoria

        System.out.println(bubba == twitch); // Verdade!

        twitch.display();

        System.out.println("" + "Endereço da memoria: " + twitch); // endereço de memoria

    }
}