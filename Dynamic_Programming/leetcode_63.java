public class Solution {
    private static int helper(int[][] obstacleGrid, int rows, int col, int m, int n) {
        if (rows == m && col == n) {// it means we reached the destination;
            return 1;
        }
        if (rows > m || col > n) {// it means we are out of the grid;
            return 0;
        }
        if (obstacleGrid[rows][col] == -1) {// it means there is the obstacle;
            return 0;
        }
        if (obstacleGrid[rows][col] != 0 && obstacleGrid[rows][col] != -1) {// it means we have previously calculated
                                                                            // it;
            return obstacleGrid[rows][col];
        }
        int right = helper(obstacleGrid, rows, col + 1, m, n);// moving to the right of grid;
        int down = helper(obstacleGrid, rows + 1, col, m, n);// moving to the down to grid;

        obstacleGrid[rows][col] = right + down;// storing in the grid;

        return right + down;

    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]==1)
        {//it means we can never reach destination;
            return 0;
        }
        for (int i = 0; i < obstacleGrid.length; i++) {// marking every 1 to be -1;
            for (int j = 0; j < obstacleGrid[i].length; j++) {
                if (obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = -1;
                }
            }
        }
        int rows=0;
        int col=0;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int answer = helper(obstacleGrid,rows,col, m - 1, n - 1);
        return answer;
    }
}
