import java.util.Arrays;
public class _1470 {
    public static int[] shuffle(int[] nums, int n) {
        int[] newarray = new int[2*n];
        int a = 0;
        int b = n;
        System.out.println(Arrays.toString(nums));
        for (int i = 0,k=0; i < nums.length-1; i=i+2,k++) {
            newarray[i] = nums[a];
            newarray[i+1] = nums[b];
            a++;
            b++;
        }
        return newarray;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,4,3,2,1};
        System.out.println(Arrays.toString(shuffle(nums, 4)));
    }
}
