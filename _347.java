import java.util.HashMap;

public class _347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            ans.put(nums[i], ans.getOrDefault(nums[i], 0)+1);
        }
        for (int i : ans.values()) {
            if (i) {
                
            }
        }
    }
    public void main(String[] args) {
        topKFrequent(new int[]{1,1,1,2,2,3},2);
    }
}
