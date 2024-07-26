public class _2180 {
    public static int countEven(int num) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            char[] abc = (" " + i).toCharArray();
            sum = 0;
            for (int j = 0; j < abc.length; j++) {
                sum = sum + (int) abc[j];
            }
            if (sum % 2 == 0) {
                count++;
            }
            System.out.println(abc);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countEven(30));
    }
}
// Optimal Solution(1ms)
// [Instead of making a int to chararray create a Seperate function for
// calculating sum of digits,
// Call the function for each i and return the sum then check for even or not
// and update count]
// class Solution {
// public int countEven(int num) {
// int count=0;
// for(int i=1;i<=num;i++){
// if(sum(i)){
// count++;
// }
// }
// return count;
// }
// public static boolean sum(int n){
// int sum=0;
// while(n!=0){
// sum+=(n%10);
// n/=10;
// }
// return sum%2==0;
// }
// }