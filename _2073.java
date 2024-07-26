import java.util.Arrays;

public class _2073 {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        int i = 0;
        int abc =0;
        while (!(tickets[k] == 0)) {
            if (i==tickets.length) {
                i=0;
                continue;
            }
            if (tickets[i] == 0) {
                i++;
                continue;
            }
            time++;
            tickets[i]--;
            abc = tickets[i];
            
            i++;
            System.out.println(Arrays.toString(tickets));
        }
        
        return time;
    }
    public static void main(String[] args) {
        System.out.println(timeRequiredToBuy(new int[] {2,3,2}, 2));
    }
}
