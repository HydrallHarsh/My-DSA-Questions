import java.util.Arrays;
import java.util.HashMap;

public class _1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int b = target - nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if (b == nums[j]) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{3,2,4}, 6));
    }
    
}