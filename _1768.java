public class _1768 {
    public static String mergeAlternately(String word1, String word2) {
        int n = Math.min(word1.length() , word2.length());
        int i;
        String ans = "";
        for(i = 0;i<n;i++){
            ans += word1.charAt(i);
            ans+=word2.charAt(i);

        }
        
        for(int j = i;j<word1.length();j++){
            ans += word1.charAt(j);

        }
        for(int j = i;j<word2.length();j++){
            ans += word2.charAt(j);
            
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(mergeAlternately("ab", "pqrs"));
    }
}
