public class _28 {
    public static int abcde(String haystack, String needle) {
        int windowsize = needle.length();
        int a = 0;
        int b = 0;

        // int count = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.length() < needle.length()) {
                return -1;
            }
            if (haystack.charAt(i) == needle.charAt(0) && needle.length() == 1) {
                return i;
            }
            if (haystack == needle) {
                return 0;
            }
            if (b == windowsize) {
                return a - b;
            }
            if (haystack.charAt(a) == needle.charAt(b) && b < needle.length()) {
                a++;
                b++;
            } else {
                a++;
                b = 0;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(abcde("leetcode", "leeto"));
    }
}
