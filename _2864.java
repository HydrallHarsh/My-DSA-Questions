public class _2864 {
    public static String maximumOddBinaryNumber(String s) {
        double i = 0;
        int countone = 0;
        // int k=0;
        for (int j = s.length()-1,k=0; j >= 0; j--,k++) {
            if(s.charAt(0)==0){
                continue;
            }
            
            int a = Character.getNumericValue(s.charAt(j));
            if(a==1){
                countone++;
            }
            double b =  Math.pow(2,k) ;
            i = a * b + i;
        }
        System.out.println(countone);
        StringBuilder snew = new StringBuilder();
        if(countone>=1){
            countone--;
            for (int l = 0; l < s.length()-1; l++) {
                if(l<countone){
                    snew.append('1');
                }
                else{
                    snew.append('0');
                }
            }
            snew.append('1');
        }
        return snew.toString();
    }
    public static void main(String[] args) {
        String s = "0101";
        System.out.println(maximumOddBinaryNumber(s));
    }
}
