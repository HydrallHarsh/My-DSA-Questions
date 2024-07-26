public class temp {
    public static void main(String[] args) {
        int[] num = new int[] { 1, 0, 1, 0, 1 };
        int sum = 0, goal = 2, count = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                for (int j2 = j; j2 < num.length; j2++) {
                    sum += num[j2];
                }
                if (sum == goal) {
                    count++;
                }
                sum = 0;
            }
        }
        // return sum;
        System.out.println(count);
    }
}
