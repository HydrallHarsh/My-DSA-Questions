public class _1544 {
    public static String makeGood(String s) {
        for (int i = 0; i < s.length()-1; i++) {
            char b = s.charAt(i);
            char c = s.charAt(i+1);
            int d = Math.abs(b-c);
            if (Character.isUpperCase(c) && d == 32) {
                s = s.substring(0, i) + s.substring(i+2, s.length());
                i = -1;
                continue;
            }
            if (Character.isUpperCase(b)&& d == 32) {
                s = s.substring(0, i) + s.substring(i+2, s.length());
                i = -1;
                continue;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(makeGood("kkdsFuqUfSDKK"));
    }
}
