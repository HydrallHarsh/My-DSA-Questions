public class _1672 {
    public static int maximumWealth(int[][] accounts) {
        int weathiest = 0;
        int balance = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                balance = balance + accounts[i][j];
            }
            if(balance>weathiest){
                weathiest = balance;
            }
            balance = 0;
        }
        return weathiest;
    }
    public static void main(String[] args) {
        int[][] abc = {{1,2,4},{2,3,4}};
        System.out.println(maximumWealth(abc));
    }
}
//OPTIMAL LETS GOOO