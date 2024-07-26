public class _402 {
    public static String removeKdigits(String num, int k) {
        if (k>=num.length()) {
            return "0";
        }
        int K = 0;
        for (int i = 0; !(K==k) && i<num.length()-1; i++) {
            if (i+1==num.length()-1) {
                num = num.substring(0, i+1-k+1);
                return num;
            }
            int s = num.charAt(i) - '0';
            int r = num.charAt(i+1) - '0';
            if (s>r) {
                num = num.substring(0, i) + num.substring(i+1, num.length());
                i--;
                K++;
            }

        }
        int abc = Integer.parseInt(num);
        num = String.valueOf(abc);
        return num;
    }
    public static void main(String[] args) {
        System.out.println(removeKdigits("10",1));
    }
}
