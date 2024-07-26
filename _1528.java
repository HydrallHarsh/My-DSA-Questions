//Line 7-9 and line 26 is the diffrence
//Converting char[] to String we use String.valueOf(the_char_array)
//I Should reduce the use of Additional Variables
//For first solution and understanding can use variables , but in final Solution reduce the use of New Variables

public class _1528 {
    public static String restoreString(String s, int[] indices) {
        char[] ss = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ss[indices[i]] = s.charAt(i);
        }
        s=String.valueOf(ss);

        return s;

    }
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));
    }
}
//Optimal Solution (0ms)
// class Solution {
//     public String restoreString(String s, int[] indices) {
//         int n = indices.length;
//         char[] shuffledString = new char[n];
//         for(int i = 0; i < n; ++i)
//             shuffledString[indices[i]] = s.charAt(i);

//         return String.valueOf(shuffledString);
//     }
// }
