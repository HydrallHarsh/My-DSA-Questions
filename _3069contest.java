import java.util.ArrayList;
import java.util.Arrays;

public class _3069contest {
    public static int[] resultArray(int[] nums) {
        int[] result  = new int[nums.length];
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        int lastelement1 = 0;
        int lastelement2 = 0;
        for (int i = 1; i < nums.length; i++) {
            if(i==1){
                arr1.add(nums[i-1]);
                arr2.add(nums[i]);
                lastelement1 = arr1.get(i-1);
                lastelement2 = arr2.get(i-1);
            }
            else if(lastelement1>lastelement2){
                arr1.add(nums[i]);
                lastelement1 = arr1.get(i-1);
            }
            else{
                arr2.add(nums[i]);
                lastelement2 = arr2.get(i-1);
            }
            
            
        }
        System.out.println(lastelement1);
        System.out.println(lastelement2);
        System.out.println((arr1));
        System.out.println((arr2));
        return result;
    }
    public static void main(String[] args) {
        resultArray(new int[]{5,4,3,8});
    }
}
