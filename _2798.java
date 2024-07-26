public class _2798 {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int a : hours){
            if(a>=target){
                count++;
            }
        }
        return count;
    }
}
//Optimal Solution used fori but less Time Complexity
