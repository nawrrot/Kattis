import java.util.Scanner;

public class HissingMicrophone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.contains("ss") ? "hiss" : "no hiss");
        scanner.close();
    }
}
