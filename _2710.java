public class _2710 {
    public String removeTrailingZeros(String num) {
        int i;
        if (num.length()==2 && num.charAt(1)=='0') {
            return num.substring(0, 1);
        }
        for(i = num.length()-1;i>=0;i--){
            if (num.charAt(i) == '0') {
                continue;
            }
            else{
                return num.substring(0, i+1);
            }
        }
        
        return num;
    }
    public static void main(String[] args) {
        _2710 a = new _2710();
        System.out.println(a.removeTrailingZeros("40000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"));
    }
}
