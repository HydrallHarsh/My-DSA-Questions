import java.util.List;
import java.util.Arrays;
import java.util.*;

public class _1389 {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        ArrayList<Integer> abc  = new ArrayList<Integer>();
        for (int i = 0,k=0; i < nums.length; i++,k++) {
            abc.add(index[k],nums[i]);
        }
        System.out.println(abc);
        for (int i = 0; i < abc.size(); i++) {
            target[i] = abc.get(i);
        }
        return target;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
}
