import java.util.Scanner;
public class Planina {
public static void main(String[] arg){
   Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    System.out.println((int)Math.pow((Math.pow(2,n) + 1), 2));
}
}
