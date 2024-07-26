package CodeforcesEducational164;
import java.util.*;
public class _1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = 0;
        T = scanner.nextInt();
        for (int t = T; t > 0; t--) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k= scanner.nextInt();
            if (m>k) {
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
        scanner.close();
    }
}
