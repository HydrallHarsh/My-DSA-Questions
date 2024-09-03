import java.util.ArrayList;
import java.util.List;

public class _1945 {
    public static int getLucky(String s, int k) {
        String snew = "";
        int sum = 0;
        double b = 0;
        for (int i = 0; i < s.length(); i++) {
            snew = snew + (s.charAt(i) - 'a' + 1);
        }
        System.out.println(snew);
        b = Double.parseDouble(snew);
        System.out.println(b);
        int i = 0;
        String temp = "";
        while(k-->0){
            sum = 0;
            for (int j = 0; j < snew.length(); j++) {
                temp += snew.charAt(j);
                sum = sum + Integer.parseInt(temp);
                temp = "";
            }
            snew = Integer.toString(sum); 
        }

        // System.out.println(c);
        return sum;
    }

    // 2nd Logic
    // public static int getLucky2(String s, int k) {
    //     List<char> snew  = new ArrayList<>();
    // }

    public static void main(String[] args) {
        System.out.println(getLucky("iiii", 1));
    }
}
