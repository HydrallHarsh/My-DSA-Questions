import java.util.ArrayList;
import java.util.List; 
public class _1282 {
    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> abc = new ArrayList<>();
        List<Integer> abc1 = new ArrayList<>();
        List<Integer> abc2 = new ArrayList<>();
        for (int i = 0; i < groupSizes.length; i++){
            for (int j = 0; j < groupSizes.length; j++) {
                
                if (abc2.contains(groupSizes[i])) {
                    break;
                }
                abc2.add(groupSizes[i]);
                if(groupSizes[i] == groupSizes[j]){
                    abc1.add(j);
                }
                else{
                    continue;
                }
            }
            
        }
        System.out.println(abc1);
        return abc;
    }
    public static void main(String[] args) {
        groupThePeople(new int[]{2,1,3,3,3,2});   
    }
}