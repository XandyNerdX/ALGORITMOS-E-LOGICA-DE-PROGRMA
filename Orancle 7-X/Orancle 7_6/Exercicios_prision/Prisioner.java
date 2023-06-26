package orancle7.pkg4;

import java.util.Scanner;

public class Prisioner {
    // Fields
    private double altura;
    private Prisioner prisoneiro;
    private String name;
    private int sentence;
    private boolean verifica;

    private String cell;
    private boolean cellporta;

    private static int prisonerCount = 000; // Variavel estática
    private int bookingNumber; // Variável de instância

    // Construtor existente
    public Prisioner(Prisioner p, String n, double a, int s, boolean v) {
        prisoneiro = p;
        name = n;
        altura = a;
        sentence = s;
        verifica = v;

    }

    // Construtor com argumento zero
    public Prisioner() {
        this(null, "", 0.0, 0, false); // Construtores Podem Chamar Outros Construtores
        // this.PrisonerCount(sentence); //se caso alterar o valor do prisoneiro na
        // class PrisionerCount, ele chama ele de volta e altera aqui tmb!
        prisonerCount++; // Incrementa o valor de prisonerCount
        bookingNumber = prisonerCount;

        if (this.verifica) {
            this.think();

        } // fim do if

    }// fim do Prisioner

    private static void prisonerCount() { // Informação da Cadeia (Quantidade de Prisoneiros atualmente!)
        System.out.println("=-=- Sistema Carcerário PROMOVE =-=-=");
        System.out.println("Quantidade de Prisoneiros: " + prisonerCount);
    }

    public static void setprisonerCount() {
        Prisioner.prisonerCount();
    }

    public void think() {
        System.out.println("Eu terei minha vingança.");
    }// fim do think

    public void setName(String name, double altura, int sentence) { // Método Setter
        this.name = name;
        this.altura = altura;
        this.sentence = sentence;
    } // fim do método Setname

    private void displayPrisoneiro() {
        System.out.println("=-=-=-=-=-= Prisoneiro " + bookingNumber + " =-=-=-=-=-="); // Mostra o número do
                                                                                        // prisioneiro
        System.out.println("Name: " + name); // Exibe o nome do prisioneiro
        System.out.println("Altura: " + altura); // Exibe a altura do prisioneiro
        System.out.println("Sentence: " + sentence); // Exibe a sentença do prisioneiro

        verifica = prisoneiro == this.prisoneiro; // Realiza uma verificação

        System.out.println("Verificação: " + verifica); // Exibe o resultado da verificação
    }

    public static void getDisplayPrisoneiro(Prisioner prisioner) {
        prisioner.displayPrisoneiro(); // Chama o método displayPrisoneiro() para exibir os detalhes do prisioneiro
    }

    // classe cell:

}

class Cell { // campos
    private String name;
    private boolean isOpen; // responsavel por abrir a porta, e fechar, por isso privado!
    private int codigoseguranca;
    private boolean verifica;

    public Cell(String name, boolean isOpen, int codigoseguranca) { // construtor
        this.name = name;
        this.isOpen = isOpen;
        this.codigoseguranca = codigoseguranca;

    }// fim construtor

    public void setName(String name) { // Método Setter
        this.name = name;

    } // fim do método Setter

    public boolean getIsOpen() { // Método Getter
        return isOpen;
    }// fim do método getIsOpen

    public Cell() {
        this("", false, 1234); // controla se a porta esta aberta ou fechada!
        // false --> Porta esta fecha!
        // true --> Porta esta aberta!
    }

    public void displayCell() {
        System.out.println("Cela: " + name);

        System.out.println("Digite o codigo de segurança da cela: ");

        Scanner console = new Scanner(System.in);
        int code = console.nextInt();
        System.out.println("=-=-=-=-=-= VERIFICANDO =-=-=-=-=-=");

        System.out.println("Estado da cela: " + (isOpen ? "Aberta" : "Fechada"));

        if (code != codigoseguranca) { // Informa se a senha digitada esta correta ou errada!
            // fim do if

            if (isOpen) {
                isOpen = false; // senha incorreta
                System.out.println("Codigo incorreto, fechando cela");
                System.out.println("Estado da cela: " + (isOpen ? "Aberta" : "Fechada"));
                if (isOpen) {
                    isOpen = false; // cela estiver aberta permance

                    System.out.println("Estado da cela: " + (isOpen ? "Aberta" : "Fechada"));

                } // fim do if (isOpen)
            } // fim do if (code != codigoseguranca) {
            else {
                System.out.println("Codigo incorreto. A cela permanece no estado atual");
            }
        } // fim do code != codigoseguranca

        if (code == codigoseguranca) {
            if (isOpen) {
                isOpen = false; // cela estiver aberta permance
                System.out.println("Código correto. A cela permanece no estado atual.");

            } else {
                isOpen = true; // cela estiver fechada ela abre
                System.out.println("abrindo cela.");

                System.out.println("Estado da cela: " + (isOpen ? "Aberta" : "Fechada"));
            }

        } // fim do if

    } // fim do cell

} // fim do cell

// classe guarda:

class Guard {
    public String name;
    private int codigoseguranca;

}