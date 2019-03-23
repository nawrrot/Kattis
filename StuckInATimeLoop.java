import java.util.Scanner;

public class StuckInATimeLoop {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        for(int i=1; i<x+1; i++){
            System.out.println(i + " Abracadabra");
        }
    }
}
