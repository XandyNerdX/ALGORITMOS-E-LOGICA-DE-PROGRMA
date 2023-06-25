public class Display {
    public static void main(String[] args) {

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
        twitch.display();

        System.out.println(bubba.nome); // Twitch
        System.out.println(bubba == twitch); // Verdade!
    }
}