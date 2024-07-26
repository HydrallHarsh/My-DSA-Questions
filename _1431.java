import java.util.*;
import java.util.List;
public class _1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> abc = new ArrayList<>();
        int maxi = 0;
        for (int i = 0;i<candies.length;i++) {
            if (candies[i]>maxi) {
                maxi = candies[i];
            }

        }
        System.out.println(maxi);
        for (int i = 0;i<candies.length;i++){
            if(candies[i]+extraCandies>=maxi){
                abc.add(true);
            }
            else
                abc.add(false);
        }

        return abc;
    }
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        System.out.println(kidsWithCandies(candies, 3));
    }
}
