public class Display {
    public static void main(String[] args) {
        Prisoneiros pri0001 = new Prisoneiros();
        pri0001.nome = "bubba";
        pri0001.apelido = "bubba";
        pri0001.altura = 2.08;
        pri0001.anoscondecao = 4;
        pri0001.display();

        // comparando objetos

        System.out.println("" + "Endereço da memoria: " + pri0001); // endereço de memoria

        pri0001.verifica = pri0001 == pri0001; // compara os prisoneiros

        System.out.println("E o mesmo endereço da memoria? " + pri0001.verifica); // TRUE

        Prisoneiros pri0002 = new Prisoneiros();
        pri0002.nome = "twitch";
        pri0002.apelido = "Bubba";
        pri0002.altura = 2.08;
        pri0002.anoscondecao = 4;
        pri0002.display();

        // comparando objetos

        System.out.println("Endereço da memoria: " + pri0002); // endereço de memoria

        pri0002.verifica = pri0002 == pri0001;

        System.out.println("E o mesmo endereço da memoria? " + pri0002.verifica); // False

    }
}