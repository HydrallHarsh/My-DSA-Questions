package CODEFORCES;

import java.util.Scanner;

public class _C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int[]a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int sum = 0;
            for (int i = 1; i < a.length; i++) {
                for (int j = 0; j < i; j++) {
                    sum += a[j];
                }
                
            }
        }
    }
}
