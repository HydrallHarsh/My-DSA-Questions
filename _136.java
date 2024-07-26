public class _136 {
    public static int singleNumber(int[] nums) {
        int[] abc = new int[nums.length];
        int abcd = 0;
        for (int i = 0; i < nums.length; i++) {
            abcd = abcd ^ nums[i];
            System.out.println(abcd);
        }
        return abcd;
    }

    public static void main(String[] args) {
        singleNumber(new int[] { 4, 1, 2, 1, 2 });
    }
}
