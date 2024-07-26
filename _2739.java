public class _2739 {
    public static int distanceTraveled(int mainTank, int additionalTank) {
        int distance = 0;
        for (int i = mainTank, count = 1; i >= 1; i--, count++) {
            distance += 10;
            if (count == 5) {
                count = 0;
                if (additionalTank == 0) {
                    // i = i;
                    continue;
                }
                i++;
                additionalTank--;
            }
        }
        System.out.println(distance);
        return distance;
    }

    public static void main(String[] args) {
        System.out.println(distanceTraveled(10, 1));
    }

}