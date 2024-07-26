public class _50 {
    public static double myPow(double x, int n) {
        // return tp(x, Long.valueOf(n));
        double num = x;
        long pow = Long.valueOf(n);
        if (num < -10000 || num > 10000) {
            return 0;
        }
        if (pow == 0)
            return 1;
        if (pow < 0) {
            pow *= -1;
            num = 1 / num;
        }
        if (pow % 2 == 0) {
            return myPow(num * num, (int) (pow / 2));
        } else
            return num * myPow(num, (int) (pow - 1));
    }

    // public static double tp(double num, long pow) {

    // }

    public static void main(String[] args) {
        System.out.println(myPow(2, 10));
    }
}
