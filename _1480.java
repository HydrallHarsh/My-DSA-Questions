import java.util.Arrays;
//OPTIMAL SOLUTION (0ms)--
public class _1480 {
    public static int[] runningSum(int[] nums) {
        int[] abc = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + nums[i];
            abc[i] = count;
        }
        return abc;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
