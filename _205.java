import java.util.ArrayList;
import java.util.HashMap;

public class _205 {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> count = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            System.out.println(count);
            if (count.containsKey(a)) {
                System.out.println(count);
                if (count.get(a) != b) {
                    return false;
                }
            } else {
                if (count.containsValue(b)) {
                    return false;
                }
                count.put(a, b);
                System.out.println(count);
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("paper", "title"));
    }
}
