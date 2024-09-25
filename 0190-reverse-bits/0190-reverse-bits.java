public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        long bit;
        for(int i= 0;i<32;i++){
            result <<= 1;
            
            // Add the rightmost bit of n to result
            result |= (n & 1);
            
            // Shift n to the right to process the next bit
            n >>= 1;
        }
        return result;
    }
}