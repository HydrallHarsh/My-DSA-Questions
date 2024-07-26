import java.util.Arrays;;
public class _3075 {
    public static long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long sumhappy = 0;
        int n = happiness.length;
        for(int i = n-1 ;i>=0 && k>0;i--){
            if (happiness[i] - (n-1-i) <= 0) {
                sumhappy += 0;
                break;
            }
            else{
                sumhappy += happiness[i] - (n-1-i);
            }

            //DONT USE DOUBLE FOR LOOP
            // sumhappy += happiness[i];
            // happiness = Arrays.copyOfRange(happiness, 0, i);
            // for(int j = i-1 ; j>=0;j--){
            //     if(happiness[j] == 0){
            //         continue;
            //     }
            //     happiness[j]--;
            // }
            k--;
        }
        return sumhappy;
    }
    //TLE on double for loop 
    // --> Dont need to reduce value of each and run another for loop the value of the current happiness[i] can be found 
    // by n-1-i(if we iterate it from 0 to n-1) or in my case happiness[i] - (n-1-i) (for n-1 to 0 traversal)
    //but the best case traversal is 0 to k 
    // --> break on line 10 is also big as it reduces further time if a value becomes 0 then furthur values 
    // will also be negative so no need to calculate for that 
    public static void main(String[] args) {
        System.out.println(maximumHappinessSum(new int[]{2,3,4,5}, 1));
    }
}
