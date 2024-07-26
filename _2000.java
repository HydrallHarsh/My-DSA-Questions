public class _2000 {
    public String reversePrefix(String word, char ch) {
        String newword = "";
        int idx = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                idx = i;
                break;
            }
        }
        if (idx == 0) {
            return word;
        }
        for (int i = idx; i >= 0; i--) {
            newword += word.charAt(i);
        }
        for (int i = idx+1; i < word.length(); i++) {
            newword+=word.charAt(i);
        }
        // word = word.substring(idx, 0) + word.substring(idx+1, word.length()-1);
        return newword;
    }
    public static void main(String[] args) {
        _2000 test = new _2000();
        System.out.println(test.reversePrefix("abcdefd", 'd'));
    }
}
