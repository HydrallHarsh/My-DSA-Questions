import java.util.*;
public class _1365 {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] abc = new int[nums.length];
        int abcd = 0;
        int count= 0;
        for (int i = 0; i < nums.length; i++) {
            abcd = nums[i];
            if (nums[i]>abcd) {
                count++;
            }
            
        }



        return abc;
    }
    public static void main(String[] args) {
        int [] nums = {8,1,2,2,3};
        Arrays.toString(smallerNumbersThanCurrent(nums));
    }
}
