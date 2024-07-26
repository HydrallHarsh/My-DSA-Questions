package CodeforcesEducational164;
import java.util.*;
public class _2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = 0;
        int counter = 0;
        T = scanner.nextInt();
        for (int t = T; t > 0; t--) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = scanner.nextInt();
            }
            for (int i = 2; i < a.length-1; i++) {
                int x = a[i-1];
                int y = a[i+1];
                if (x==y) {
                    a[i-1] = a[i];
                    // counter++;
                    a=Arrays.copyOfRange(a, 1, a.length-1);
                    i=2;
                }
            }
            System.out.println(counter);
        }
    }
}
