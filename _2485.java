public class _2485 {
    public static int pivotInteger(int n) {
        double x = 0;
        int x1 = 0;
        x = Math.sqrt((n*(n+1))/2);
        x1 = (int)x;
        if(x-x1>0){
            return -1;
        }
        else
            return x1;
    }
 
    
    public static void main(String[] args) {
        System.out.println(pivotInteger(8));
    }
}
