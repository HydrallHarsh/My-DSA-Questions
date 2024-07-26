import java.util.Arrays;

public class _238 {
    public static int[] productExceptSelf(int[] nums) {
        int[] abc = new int[nums.length];
        int product = 1;
        int product2 = 1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            product = product * nums[i];
        }
        for (int i = 0; i < abc.length; i++) {
            if (nums[i] == 0) {
                count++;
                continue;
            } else
                product2 = product2 * nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (count > 1) {
                abc[i] = 0;
            } else if (nums[i] == 0) {
                abc[i] = product2;
                continue;
            } else
                abc[i] = product / nums[i];
        }
        System.out.println(Arrays.toString(abc));
        return abc;
    }

    public static void main(String[] args) {
        productExceptSelf(new int[] { 0, 0 });
    }
}