public class Ex02 {

    public static void main(String[] args) {

        int x = 4, y = 9;
        if (y / x < 3) {
            x += y;
        } else {
            x *= y;
        }
        System.out.println("After if stmt, x = " + x);

        // Use a ternary operator to perform the same logic as above.
    }
}
