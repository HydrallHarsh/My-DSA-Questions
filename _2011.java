class _2011 {
    public static int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String rrr : operations) {
            if (rrr == "+" || rrr == "++X") {
                X = X + 1;
            } else if(rrr == "X--" || rrr == "--X"){
                X = X - 1;
            }
        }
        return X;
    }
    public static void main(String[] args) {
        String[] operations = {"X++","++X","--X","X--"};
        System.out.println(finalValueAfterOperations(operations));
    }
}