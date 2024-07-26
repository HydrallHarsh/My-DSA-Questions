import java.util.List;
import java.util.ArrayList;

public class _57 {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> abcd = new ArrayList<>();
        int[][] hello = new int[abcd.size()][];
        int intsize = intervals.length;
        int a = 0;
        while (a < intsize) {
            if (intervals[a][1] < newInterval[0]) {
                abcd.add(intervals[a]);
            } else if (intervals[a][0] > newInterval[1]) {
                abcd.add(newInterval);
                newInterval = intervals[a];
            } else {
                newInterval[0] = Math.min(newInterval[0], intervals[a][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[a][1]);
            }
            a++;
        }
        abcd.add(newInterval);
        hello = abcd.toArray(hello);
        return hello;
    }

    public static void main(String[] args) {
        insert(new int[][] { { 1, 2 }, { 3, 5 }, { 6, 7 }, { 8, 10 }, { 12, 16 } }, new int[] { 4, 8 });
    }
}
