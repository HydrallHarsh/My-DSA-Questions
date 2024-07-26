public class _7 {
    public static int reverse(int x) {
        if (x < Math.pow(-2, 31) && x > Math.pow(2, 31)) {
            return 0;
        }
        long newwx = 0;
        newwx = Math.abs(x);
        int temp = 0;
        long newx = 0;
        while (newwx > 0) {
            temp = (int) newwx % 10;
            newx = newx * 10 + temp;
            newwx = newwx / 10;
        }
        if (x < 0 && -newx > Math.pow(-2, 31)) {
            return (-(int) newx);
        } else if (newx < Math.pow(2, 31) && x > 0) {
            return (int) newx;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse(-1563847412));
    }
}
// Optimal Solution (0ms) Comparing with Integer.max and .min Values and not
// using temp vatiable
// class Solution {
// public int reverse(int x) {
// long reverse = 0;
// while(x != 0) {
// reverse = reverse * 10 + (x % 10);
// x = x / 10;
// }
// if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
// return 0;
// }
// else {
// return (int) reverse;
// }
// }
// }