public class Ex02 {

    public static void main(String[] args) {

        int x = 4, y = 9;
        if (y / x < 3) {
            x += y;
        } else {
            x *= y;
        }
        System.out.println("Após if stmt, x =" + x);

        // Use um operador ternário para executar a mesma lógica acima.
    }
}
