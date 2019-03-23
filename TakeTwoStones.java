import java.util.Scanner;

public class TakeTwoStones {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x%2==0){
            System.out.println("Bob");
        }
        else{
            System.out.println("Alice");
        }
    }
}
