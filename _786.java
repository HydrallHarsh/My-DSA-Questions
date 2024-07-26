import java.util.Arrays;

public class _786 {
    public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length-1;
        int[] ans = new int[2];
        if (arr.length==2 && k==1) {
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            int calc = n-i;
            if (calc>=k && k>0) {
                k = k-calc;
                continue;
            }
            else{
                while (k>=0) {
                    ans[0] = arr[i];
                    ans[1] = arr[n--];
                    k--;
                }
            }
        }
        return ans;

        
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(kthSmallestPrimeFraction(new int[]{1,7}, 1)));
    }
}
