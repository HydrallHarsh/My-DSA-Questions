import java.util.Arrays;

public class _1662 {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for (String string : word1) {
            a.append(string);
        }
        for (String string : word2) {
            b.append(string);
        }
        System.out.println(a.toString());
        System.out.println(b.toString());
        if (a.toString().equals(b.toString())) {
            return true;
        }
        else{
            return false;}
    }
    public static void main(String[] args) {
        System.out.println(arrayStringsAreEqual(new String[]{"ab", "c"} ,new String[]{"a", "bc"}));
    }
}
