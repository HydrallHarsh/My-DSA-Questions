import java.util.HashMap;

public class _217 {
    public static boolean containsDuplicate(int[] nums) {
        /*Arrays.sort(nums);
        int a = nums.length;
        for (int i = 0; i < a-1; i++) {
            if (nums[i]==nums[i+1]) {
                return true;
            }
        }
        return false;*/
        HashMap<Integer,Integer> ans  = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (ans.containsKey(nums[i])) {
                return true;
            }
            else
                ans.put(nums[i], 1);
        }
        return false;
            
    }
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
    }
}
