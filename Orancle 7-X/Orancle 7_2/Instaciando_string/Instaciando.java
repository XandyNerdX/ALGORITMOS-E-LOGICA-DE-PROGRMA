public class I {
    public static void main(String[] args) {

        /*
         * O uso da palavra-chave new cria duas referência diferentesa dois obejtos
         * diferentes
         */

        String s1 = new String("Teste");
        String s1 = new String("Teste");

        /*
         * O java reconhece automaticamente strings idênticas e economiza espaço na
         * memória classificando o objeto uma única vez
         * isso cria duas referências diferentes a um objeto
         */

        String s01 = "Teste";
        String s02 = "Teste";

        /*
         * Referências de String
         * A alteração de uma string usando uma referência não afeta outras referências
         * O java aloca nova memória de outra string
         */

        String s001 = "Teste";
        String s002 = "Teste";
        s1 = "Diferente";s

    }
}