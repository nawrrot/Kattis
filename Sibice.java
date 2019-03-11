import java.util.Scanner;
import static java.lang.Math.*;
public class Sibice {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int W = scan.nextInt();
        int H = scan.nextInt();
        int diagonal=W*W+H*H;
        double buf=sqrt(diagonal);
        for (int i=0; i<n; i++){
          int L = scan.nextInt();
            if(buf>=L){
                System.out.println("DA");
            }
            else{
                System.out.println("NE");
            }
        }

    }
}
