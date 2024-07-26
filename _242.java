import java.util.HashMap;

public class _242 {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mapabc = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char a : s.toCharArray()) {
            mapabc.put(a, mapabc.getOrDefault(a, 0) + 1);
        }
        for (char a : t.toCharArray()) {
            map2.put(a, map2.getOrDefault(a, 0) + 1);
        }
        if (mapabc.equals(map2)) {
            return true;
        }
        System.out.println(mapabc);
        System.out.println(map2);
        // if (map.equals(map2)) {
        // return true;
        // }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
