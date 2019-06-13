import java.util.Scanner;

public class NastyHack {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int r = scanner.nextInt();
            int e = scanner.nextInt();
            int c = scanner.nextInt();
            if (r < e - c) {
                System.out.println("advertise");
            } else if (r > e - c) {
                System.out.println("do not advertise");
            } else if (r == e - c) {
                System.out.println("does not matter");
            }
        }
        scanner.close();
    }
}
