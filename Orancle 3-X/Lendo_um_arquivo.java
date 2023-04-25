public class Lendoumarquivo { 
     public static void main(String[] args) {
        Scanner sc = new Scanner(
            Input04.class.getResourceAsStream("fakeFile.txt"));
        int x = sc.nexInt();
        String entireLine = sc.nextInt();
        sc.close();

     }
}