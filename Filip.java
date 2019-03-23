import java.util.Scanner;

public class Filip {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int[]x = new int[3];

        for(int i=0; i<x.length; i++){
            x[i] = scan.nextInt();
        }
        System.out.println(x);


    }
}
