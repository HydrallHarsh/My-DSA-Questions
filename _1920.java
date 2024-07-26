import java.util.*;
public class _1920 {
    public static int[] buildArray(int[] nums) {
        int[] ans  = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        buildArray(nums);
    }
    //My Solution 1ms
}
//Optimal Solution (0ms)
// class Solution {
//     public int[] buildArray(int[] nums) {
//         arrayFromPerm(nums,0);
//         return nums;
//     }
//     void arrayFromPerm(int[] nums,int start){
//         if(start<nums.length){
//             int res=nums[nums[start]];
//             arrayFromPerm(nums,start+1);
//             nums[start]=res;
//         }
//     }
// }