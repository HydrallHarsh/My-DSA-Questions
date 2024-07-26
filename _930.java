public class _930 {
    public static int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == goal) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        numSubarraysWithSum(new int[] { 0, 0, 0, 0, 0 }, 0);
    }
}
