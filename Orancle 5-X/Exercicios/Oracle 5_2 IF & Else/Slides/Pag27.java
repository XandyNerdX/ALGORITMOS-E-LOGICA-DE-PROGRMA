public class Pag27 {
    // Aninhar instruções if?
    // em java, uma instrução if pode estar presente dentro do corpo de outra
    // instrução if
    boolean discPercent;
    String tvType;
    boolean size;

    public static void main(String[] args) {
        if (tvType == "em cores") {
            if (size == 14) {
                discPercent = 8;
            } else {
                discPercent = 10;
            }
        }
    }
}
