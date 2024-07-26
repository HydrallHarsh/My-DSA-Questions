import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class _506 {
    public static String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] answer = new String[n];
        Integer[] copy = new Integer[n];
        for (int i = 0; i < n; i++) {
            copy[i] = score[i];
        }
        Arrays.sort(copy,Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (score[i] == copy[j]) {
                    if (j==0) {
                        answer[i] = "Gold Medal";
                        break;
                    }
                    else if (j==1) {
                        answer[i] = "Silver Medal";
                        break;
                    }
                    else if (j==2) {
                        answer[i] = "Bronze Medal";
                        break;
                    }
                    else{
                        answer[i] = Integer.toString(j+1);
                        break;
                    }
                }
                else{
                    continue;
                }
            }
        }
        return answer;
        
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRelativeRanks(new int[]{5,4,3,2,1})));
    }
}
