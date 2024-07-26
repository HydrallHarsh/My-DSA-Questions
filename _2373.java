import java.util.Arrays;

public class _2373 {
    public static int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] maxLocal = new int[n-2][n-2];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < maxLocal.length; i++) {
            for (int j = 0; j < maxLocal.length; j++) {
                for (int j2 = i; j2 < i+3; j2++) {
                    for (int k = j; k < j+3; k++) {
                        maxLocal[i][j] = Math.max(maxLocal[i][j], grid[j2][k]);
                    }
                }
            }
        }
        for (int[] is : maxLocal) {
            System.out.println(Arrays.toString(is));
        }
        return maxLocal;
    }
    public static void main(String[] args) {
        System.out.println(largestLocal(new int[][]{{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}}));
    }
}
