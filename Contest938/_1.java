package Contest938;
import java.util.*;
public class _1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = T; t >0; t--) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int costa = 0;
            int costb = 0;
            int nclone = n;
            for (int i = n; n > 0; i--) {
                costa = costa + a;
                n--;
            }
            for (int i = nclone; nclone > 0; i--) {
                if (nclone == 1) {
                    costb = costb + a;
                    break;
                }
                costb = costb + b;
                nclone = nclone-2;
            }
            System.out.println(Math.min(costa, costb));
        }
        scanner.close();
    }
}