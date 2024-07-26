public class _1550

{
    public static boolean threeConsecutiveOdds(int[] arr) {
        for(int i = 2;i<arr.length;i++){
            if(arr[i-2]%2 !=0 && arr[i-1]%2 !=0 && arr[i]%2 != 0){
                return true;
            }
            else{
                continue;
            }
        }
        return false;
    }
	public static void main(String[] args) {
		System.out.println(threeConsecutiveOdds(new int[]{1,1,1}));
	}
}