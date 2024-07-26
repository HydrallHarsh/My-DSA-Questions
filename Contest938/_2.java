package Contest938;
import java.util.*;
public class _2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = 0;
        T = scanner.nextInt();
        for (int t = T; t > 0; t--) {
            int n = scanner.nextInt();
            long k = scanner.nextLong();
            long[] a = new long[n];
            int counter = 0;
            int ans = 0;
            long sum = 0;
            for (int i = 0; i < a.length; i++) {
                a[i] = scanner.nextLong();
            }
            for (int i = 0; i < a.length; i++) {
                sum += a[i];
            }
            
            for (int i = 1; i <= k && a.length != 0; i++) {
                if (sum<=k) {
                    ans = a.length;
                    break;
                }
                n = a.length;
                System.out.println("\n"+n);
                System.out.println(Arrays.toString(a));
                if (counter == 0) {
                    a[0]--;
                    if (a[0] == 0) {
                        ans++;
                        a = Arrays.copyOfRange(a, 1, n);
                        System.out.println(Arrays.toString(a));
                    }
                    counter = 1;
                }
                else if (counter == 1) {
                    a[n-1]--;
                    if (a[n-1] == 0) {
                        ans++;
                        a= Arrays.copyOfRange(a, 0, n-1);
                        System.out.println(Arrays.toString(a));
                    }
                    counter = 0;
                }
                
            }
            System.out.println(ans);
        }
        scanner.close();
    }
}
