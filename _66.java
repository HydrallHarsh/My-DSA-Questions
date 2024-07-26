import java.util.Arrays;
class _66 {
    public int[] plusOne(int[] digits) {
        int a = digits.length-1;
        if(digits[a]<9){
            digits[a] = digits[a] + 1;
            return digits;
        }
        else if(digits[a]==9){
            int [] arr = Arrays.copyOf(digits, digits.length + 1);
            arr[arr.length-2] = 1;
            arr[arr.length-1] = 0;
            digits = arr;
            return digits;
        }
        return digits;
    }
}