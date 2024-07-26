package CODEFORCES;
import java.util.Scanner;;
public class _1107B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        t = sc.nextInt();
        while (t-->0) {
            long  k = sc.nextLong();
            long x = sc.nextLong();
            System.out.println((9*(k-1)+x));
        }
        sc.close();
    }
}
