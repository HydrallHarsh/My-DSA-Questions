import java.util.ArrayList;
import java.util.List;

public class _2824 {
    public static int countPairs(int[] nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i<j && nums[i]+nums[j]<target) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        List<Integer> numsa= new ArrayList<Integer>();
        int[] nums = {9,-5,-5,5,-5,-4,-6,6,-6};
        System.out.println(countPairs(nums, 3));
    }
}
//OPTIMAL SOLUTION (1ms)
// Converted List into int[] array and then checked for conditions
// class Solution {
//     public int countPairs(List<Integer> nums, int target) {
//         int arr[] = new int[nums.size()];
//         for(int i=0; i<nums.size();i++){
//             arr[i] = (int)nums.get(i);
//         }

//         int count = 0;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i] + arr[j] < target){
//                     count++;
//                 }
//             }
//         }

//         return count;
//     }
// }