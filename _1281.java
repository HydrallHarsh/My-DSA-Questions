public class _1281 {
    public static int subtractProductAndSum(int n) {
        int multi = 1;
        int sum = 0;
        int temp = 0;
        while(n>0){
            temp = n%10;
            sum = sum + temp;
            multi = multi * temp;
            n = n/10;
        }
        return multi-sum;
    }
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }
}
