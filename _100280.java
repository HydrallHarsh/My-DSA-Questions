import java.util.Arrays;
import java.util.Comparator;

public class _100280 {
    public static int minRectanglesToCoverPoints(int[][] points, int w) {
        int ans = 0;
        Arrays.sort(points,Comparator.comparing(a -> a[0]));
        for (int[] is : points) {
            System.out.println(Arrays.toString(is));
        }
        int abc= points[0][0];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0]-abc>w) {
                ans++;
                abc = points[i][0];
            }
        }
        return ans+1;
    }
    public static void main(String[] args) {
        System.out.println(minRectanglesToCoverPoints(new int[][]{{2,1},{1,0},{1,4},{1,8},{3,5},{4,6}},1));
    }
}
//{{0,0},{1,1},{2,2},{3,3},{4,4},{5,5},{6,6},2}
//{2,1},{1,0},{1,4},{1,8},{3,5},{4,6}},1