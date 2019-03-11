import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % x == 0 && i % y == 0 && i >= x && i >= y) {
                System.out.println("FizzBuzz");
            } else if (i % y == 0 && i >= y) {
                System.out.println("Buzz");
            } else if (i % x == 0 && i >= x) {
                System.out.println("Frzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
