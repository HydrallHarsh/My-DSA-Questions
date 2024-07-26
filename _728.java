import java.util.List;
import java.util.ArrayList;

public class _728 {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> abc = new ArrayList<>();
        int a = 0;
        int b = 0;
        for (int i = left; i <= right; i++) {
            b = i;
            while (b > 0) {
                a = b % 10;
                if (a == 0) {
                    break;
                }
                if (i % a == 0) {
                    if (String.valueOf(b).length() == 1) {
                        abc.add(i);
                    }
                } else {
                    break;
                }
                b = b / 10;
            }
        }
        System.out.println(abc);
        return abc;
    }

    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1, 22));
    }
}
// Optimal Solution (1ms)
// Instead of Checking length of int everytime,should create a seperate function
// to check for the divisiblity
// of each number between the range and if the function returns true add it to
// the List .
// class Solution {
// public List<Integer> selfDividingNumbers(int left, int right) {
// List<Integer> ans = new ArrayList<>();
// for(int i=left;i<=right;i++){
// if(isSelfDividingNumber(i)){
// ans.add(i);
// }
// }
// return ans;
// }

// private boolean isSelfDividingNumber(int num){
// int temp = num;
// while(temp>0){
// int digit = temp%10;
// if(digit==0){
// return false;
// }
// if(num%digit!=0){
// return false;
// }
// temp = temp/10;
// }
// return true;
// }
// }