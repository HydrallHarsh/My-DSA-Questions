import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class _452 {
    public static int findMinArrowShots(int[][] points) {
        List<int[]> abcd = new ArrayList<>();
        int[][] hello = new int[abcd.size()][];
        int intsize = points.length - 1;
        int a = 0;
        while (a < intsize) {
            if (points[a][1] < points[a + 1][0]) {
                abcd.add(points[a]);
            } else if (points[a][0] > points[a + 1][1]) {
                abcd.add(points[a + 1]);
            }
            if (a == intsize - 1) {
                abcd.add(points[a + 1]);
            }
            a++;
        }
        for (int[] is : abcd) {
            System.out.println(Arrays.toString(is));
        }
        hello = abcd.toArray(hello);
        // System.out.println(Arrays.toString(Arrays.toString(hello)));

        return 0;
    }

    public static void main(String[] args) {
        findMinArrowShots(new int[][] { { 10, 16 }, { 2, 8 }, { 1, 6 }, { 7, 12 } });
    }
}
