import java.util.ArrayList;
import java.util.List;

public class _1945 {
    public static int getLucky(String s, int k) {
        String snew = "";
        int sum = 0;
        double b = 0;
        double c = 0;
        for (int i = 0; i < s.length(); i++) {
            snew = snew + (s.charAt(i) - 'a' + 1);
        }

        b = Double.parseDouble(snew);
        for (int i = 0; i < k; i++) {
            sum = 0;
            while (b > 0) {
                c = b % 10;
                sum = sum + (int) c;
                b = (int) b / 10;
            }
            b = sum;
        }

        System.out.println(c);
        return sum;
    }

    // 2nd Logic
    public static int getLucky2(String s, int k) {
        List<char> snew  = new ArrayList<>();
    }

    public static void main(String[] args) {
        System.out.println(getLucky2("dbvmfhnttvr", 5));
    }
}
