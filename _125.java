public class _125 {
    public static boolean isPalindrome(String s) {
        if (s == " ") {
            return true;
        }
        s = s.toLowerCase();

        String snew = "";
        String snew2 = "";
        System.out.println(s);
        for (int i = s.length() - 1, j = 0; i >= 0; i--, j++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) > '0' && s.charAt(i) <= '9')) {
                snew += s.charAt(i);
            }
            if ((s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= '0' && s.charAt(j) <= '9')) {
                snew2 += s.charAt(j);
            }
        }
        System.out.println(snew.toString());
        System.out.println(snew2.toString());
        if (snew.equals(snew2)) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("0z;z   ; 0"));
    }
}
