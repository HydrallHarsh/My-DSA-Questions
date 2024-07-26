public class _2114 {
    public static int mostWordsFound(String[] sentences) {
        int maxlen = 0;
        int spaces = 0;
        for (int i = 0; i < sentences.length; i++) {
            String[] a = sentences[i].split(" ");
            spaces = a.length;
            if(spaces>maxlen){
                maxlen = spaces;
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }
}
