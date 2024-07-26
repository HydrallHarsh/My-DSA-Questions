import java.util.Arrays;

public class _2433 {
    public static int[] findArray(int[] pref) {
        int[] ans = new int[pref.length];
        ans[0] = pref[0];
        for (int i = 1; i < pref.length; i++) {
            ans[i] = pref[i] ^ pref[i - 1];
            // System.out.println(Arrays.toString(ans));
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findArray(new int[] { 5, 2, 0, 3, 1 })));
    }
}
