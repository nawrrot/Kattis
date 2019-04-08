import java.util.Scanner;

public class Filip {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int[]x = new int[3];
        int[]y = new int[3];
        for(int i=0; i<x.length; i++){
            x[i] = scan.nextInt();
        }
        for(int i=0; i<y.length; i++){
            y[i] = scan.nextInt();
        }
        for(int i=0; i<y.length; i++){
            if(x[i]>y[i]){
                continue;
            }
            else
                x[i]=y[i];
        }

        for(int i=0; i<x.length; i++){
            System.out.println(x[i]);
        }

    }
}
