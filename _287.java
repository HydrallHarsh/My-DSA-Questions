import java.util.HashMap;

public class _287 {
    public static int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }
        System.out.println(count);
        for (int i : count.keySet()) {
            System.out.println(i);
            if (count.get(i) >= 2) {
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[] { 3, 3, 3, 3, 3 }));
    }
}
// int a = 0;
// int b = 0;
// int temp = 0;
// for (int i = 0; i < nums.length; i++) {
// b = nums[i];
// for (int j = i + 1; j < nums.length; j++) {
// temp = nums[j];
// a = nums[i] ^ nums[j];
// if (a == 0) {
// return nums[i];
// }
// }
// }
// return a;
