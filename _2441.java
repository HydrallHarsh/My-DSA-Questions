import java.util.Arrays;
public class _2441 {
    public int findMaxK(int[] nums) {
        //Creating HashMap with its Frequencies
        //2nd Approach is to Sort and COmpare 

        // HashMap<Integer, Integer> freq = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        //     freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
        // }
        // for (int i : freq.keySet()) {
            
        // }
        // System.out.println(freq);
        // return nums[0];

        int p1 = 0;
        int p2 = nums.length-1;
        Arrays.sort(nums);
        while (p1 != p2) {
            if (-nums[p1] == nums[p2]) {
                return nums[p2];
            }
            else if (-nums[p1]<nums[p2]) {
                p2--;
            }
            else
                p1++;
        }
        return -1;
    }
    public static void main(String[] args) {
        _2441 test = new _2441();
        System.out.println(test.findMaxK(new int[]{-1,2,-3,3}));
    }
}
