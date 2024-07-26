import java.util.Comparator;
import java.util.Arrays;;
public class _857 {
    public static double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        double ans = 0;
        double[][] pairs = new double[quality.length][2];
        for (int i = 0; i < quality.length; i++) {
            pairs[i][0] = (double)wage[i]/quality[i];
            pairs[i][1] = quality[i];
        }
        Arrays.sort(pairs,Comparator.comparing(a -> a[0]));
        
        
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(mincostToHireWorkers(new int[]{10,20,5}, new int[]{70,50,30}, 2));
    }
}
