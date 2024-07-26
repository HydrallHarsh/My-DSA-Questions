import java.util.ArrayList;
import java.util.List;

public class _2859 {
    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sumre = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (Integer.bitCount(i) == k) {
                // System.out.println(integer);
                sumre = sumre + nums.get(i);
            }
        }
        return sumre;
    }
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        // 5,10,1,5,2
        nums.add(10);
        nums.add(1);
        nums.add(5);
        nums.add(2);
        System.out.println(sumIndicesWithKSetBits(nums, 1));
    }
}
