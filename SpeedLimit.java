import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpeedLimit {
    static public void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        List<Integer> result = new ArrayList<Integer>();

        List<Integer> t = new ArrayList<>();
        t.add(0, 0);
        while (!(n == -1)) {
            int temp=0;
            n = scanner.nextInt();

            for (int i = 1; i <= n; i++) {
                int s = scanner.nextInt();
                t.add(i, scanner.nextInt());
                temp += (s * (t.get(i) - t.get(i - 1)));
            }
            result.add(0, temp);
        }
        for (int j = result.size()-1; j >= 1; j--) {
            System.out.println(result.get(j) + " miles");
        }
    }
}


