import java.util.HashMap;
public class _1512 {
    public static int numIdenticalPairs(int[] nums) {
        int goodpair = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i]==nums[j] && i<j) {
                    goodpair++;
                }
                
            }
        }
        System.out.println(goodpair);
        return goodpair;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        // numIdenticalPairs(nums);
        Solution.numIdenticalPairs(nums);
    }
    // My Soultion 1ms
}
//Optimal Solution (0ms)
//USING HASHMAP -> KEY VALUE PAIRS and FOREACH LOOP
class Solution {
    public static int numIdenticalPairs(int[] guestList) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int ans = 0;
        
        for(int friend:guestList)
        {
            int friendCount = hm.getOrDefault(friend,0);
            ans+=friendCount;
            hm.put(friend,friendCount+1);
        }
        System.out.println(hm);
        
        return ans;
    }
}
