public class _1614 {
    public static int maxDepth(String s) {
        int num = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                num++;
                if (num > max) {
                    max = num;
                }
            } else if (s.charAt(i) == ')') {
                num--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
    }
}
