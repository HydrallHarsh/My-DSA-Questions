class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> n = new ArrayList<>();
        ArrayList<Integer> n2 = new ArrayList<>();
        int size = nums.length;
        ArrayList<Integer> n3 = new ArrayList<>();
        ArrayList<Integer> fina = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (nums[i]>pivot) {
                n2.add(nums[i]);
                
            }
            else if (nums[i]<pivot) {
                n.add(nums[i]);
                
            }
            else{
                n3.add(nums[i]);
            }
        }
        for (int i = 0; i < n.size(); i++) {
            fina.add(n.get(i));
        }
        for (int i = 0; i < n3.size(); i++) {
            fina.add(n3.get(i));
        }
        for (int i = 0; i < n2.size(); i++) {
            fina.add(n2.get(i));
        }
        for (int index = 0; index < nums.length; index++) {
            nums[index] = fina.get(index);
        }
        return nums;
    }
}