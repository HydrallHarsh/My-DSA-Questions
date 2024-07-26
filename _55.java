public class _55 {
    public static boolean canJump(int[] nums) {
        // work backwards from lmast index, keep track of smallest index that can jump to last index
        // check whether curernt index can jump to this smallest index
        int a  = nums.length;
        int goal = a-1;
        for (int i = a-2; i >=0; i--) {
            if (i+nums[i]>=goal) {
                goal =i;
            }
        }
        return goal==0;
    }
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2,3,1,1,4}));
    }
}
