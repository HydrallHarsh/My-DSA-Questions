public class _100273 {
    public static long numberOfSubarrays(int[] nums) {
        int ans = nums.length;
        int a = 0;
        int b = 1;
        int size = nums.length;
        while (a != b) {
            if (nums[a]==nums[b]) {
                ans++;
                b = (b+1)%size;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(numberOfSubarrays(new int[] {1,4,3,3,2}));
    }
}
