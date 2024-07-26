public class _2748 {
    public static int countBeautifulPairs(int[] nums) {
        int count = 0;
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length; j++) {
                String abc = Integer.toString(nums[i]);
                String cde = Integer.toString(nums[j]);
                abc = String.valueOf(abc.charAt(0));
                cde = String.valueOf(cde.charAt(cde.length()-1));
                int f = Integer.parseInt(abc);
                int g = Integer.parseInt(cde);
                c = gcd(f,g);
                if(c==1){
                    System.out.println(i +","+(j));
                    count++;
                }
            }
            
        }
        return count;
    }
    public static int gcd(int i , int j) {
        if(j==0){
            return i;
        }
        else{
            return(gcd(j, i%j));
        }
    }
    public static void main(String[] args) {                
        System.out.println(countBeautifulPairs(new int[]{2,5,1,4}));
    }
}
