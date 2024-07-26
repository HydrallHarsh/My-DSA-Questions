import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class _442 {
    public static List<Integer> findDuplicate(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }
        System.out.println(count);
        for (int i : count.keySet()) {
            System.out.println(i);
            if (count.get(i) >= 2) {
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 }));
    }
}
// Better solution (3ms)
// Without Hashmap we create a new int[] array and add the frequency counts of
// each element of nums aaray on the index of the new int[] array and then we
// check if the count is >2 we add that element to the List..

// List<Integer> res = new ArrayList<Integer>();
// int[]count = new int[nums.length+1];
// for(int i = 0;i<nums.length;i++){
// count[nums[i]]++;
// }

// for( int i =1 ; i <= nums.length ; i++)
// {
// if(count[i] == 2){
// res.add(i);
// }
// }
// return res;