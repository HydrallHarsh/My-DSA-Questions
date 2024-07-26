import java.util.ArrayList;
import java.util.List;

public class _2942 {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> abc = new ArrayList<Integer>();
        int index = -1;
        for (String rrr : words) {
            index++;
            for (int i = 0; i < rrr.length(); i++) {
                if(rrr.charAt(i) == x){
                    abc.add(index);
                    break;
                }
            }
        }
        return abc;
    }
    public static void main(String[] args) {
        String[] words = {"leet","code"};
        System.out.println(findWordsContaining(words, 'e'));
    }
}
//Optimal Solution (0ms)
// class Solution {
//     public List<Integer> findWordsContaining(String[] words, char x) {
//         List<Integer> result = new ArrayList<>();
//         int i=0;
//         for(String w : words) {
//             if(w.indexOf(x) >= 0) {
//                 result.add(i);
//             }
//             i++;
//         }
//         return result;
//     }
// }