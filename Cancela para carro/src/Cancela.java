public class Cancela {

    String situacao = "fechada";

    public void abrir() {
        situacao = "aberta";
    }

    public void fechar() {
        situacao = "fechada";
    }

    public void verificarSituacao() {
        if (situacao.equals("aberta")) {
            System.out.println("A cancela está aberta");
        } else {
            System.out.println("A cancela está fechada");
        }
    }

    public static void main(String[] args) {
        Cancela minhaCancela = new Cancela();

        minhaCancela.abrir();
        minhaCancela.verificarSituacao();

        minhaCancela.fechar();
        minhaCancela.verificarSituacao();
    }
}
