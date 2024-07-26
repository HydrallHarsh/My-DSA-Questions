package CODEFORCES;

import java.util.Scanner;

public class _B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        t = sc.nextInt();
        int sum = Integer.MIN_VALUE;
        int ansSum = 0;
        while (t-->0){
            int n = sc.nextInt();
            for (int i = 2; i < n+1; i++) {
                sum = 0;
                for (int j = 1; j*i < n+1; j++) {
                    sum += j * i;
                }
                ansSum = Math.max(sum, ansSum);
            }
            System.out.println(ansSum);
        }
    }
}
