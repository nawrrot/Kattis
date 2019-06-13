import java.util.Scanner;

public class Aaah {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        String ableToSay = scanner.nextLine();
        String wantsToSay = scanner.nextLine();
        System.out.println((ableToSay.length() >= wantsToSay.length()) ? "go" : "no");
        scanner.close();
    }
}
