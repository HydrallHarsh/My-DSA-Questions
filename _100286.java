public class _100286 {
    public boolean canMakeSquare(char[][] grid) {
        int n = grid.length;    
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if ((grid[i][j] == 'B'&& grid[i][j + 1] == 'B') ||( grid[i][j] == 'B'&& grid[i + 1][j + 1] == 'B')){
                    return true;
                    
                }
                else if (grid[i][j] == 'W'&& grid[i][j + 1] == 'W' && grid[i + 1][j] == 'W'&& grid[i + 1][j + 1] == 'W') {
                    return true;
                }
           }
           return false;
        }
        return false;
    }
    public static void main(String[] args) {
        _100286 test = new _100286();
        System.out.println(test.canMakeSquare(new char[][]{{'B','W','B'},{'B','W','W'},{'B','W','B'}}));
    }
}
