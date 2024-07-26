class experiment {
    public static boolean isMonotonic(int[] nums) {
        if(nums.length==1){
            return false;
        }
        for (int i = 0; i < nums.length-1; i++) {
            
            if (nums[i] <= nums[i + 1]) {
                int a=i+1;
                int b = nums.length-1;
                if (a== b ) {
                    return true;}
                else
                    continue;
            } 
            else {
                break;
            }

        }
        for (int i = 0; i < nums.length-1 ; i++) {
            
            if (nums[i] >= nums[i + 1]) {
                if (i+1 == nums.length ) {
                    return true;}
                else 
                    continue;
            }  
            else
                break;

        }
        return false;
    
    }
    public static void main(String[] args) {
        int[] nums = {9};
        System.out.println(isMonotonic(nums));
        System.out.println(nums.length);
    }
}