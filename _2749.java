public class _2749 {
    
    public static int makeTheIntegerZero(int num1, int num2) {
        // if (num2>num1) {
        //     return - 1;
        // }
        // int ans = 0;
        // int c=0;
        // int d = 0;
        // int newnum1 = 0;
        // while (!(num1==0)){
        //     for (int i = 1; i < 61; i++) {
        //         d = (int)Math.pow(2, i)+num2;
        //         if (d>num1) {
        //             c = i-1;
        //             break;
        //         }
        //         else if (d == num1) {
        //             ans++;
        //             return ans;
        //         }
                
        //     }
        //     num1 = (int)(num1 - (Math.pow(2, c)+num2));
        //     newnum1 = (int)(num1 - (Math.pow(2, c+1)+num2));
        //     if (Math.abs(num1) > Math.abs(newnum1)) {
        //         num1 = newnum1;
        //     }
        //     ans++;
        // }
        // System.out.println(ans);
        // return ans;

        int ans = 0;
        long newnum1 = num1;
        while (newnum1 > 0) {
            newnum1 -= num2;
            if (Long.bitCount(newnum1) <= ++ans && ans <= newnum1) {
                return ans;
            }
        }
        
        return -1;
    }
        
    //My Initial APproach is to find the nearest number that equates the value to zero max value of(2^i + num2)<=num1
    //Best approach is BitManupulation 
    //The number of one bits in num1 is the minimum number of approaches needed 
    //Add a few conditions for some test cases thats it DONE ..... ¬_¬ ¬_¬
    public static void main(String[] args) {
        makeTheIntegerZero(3, -2);
    }
}
