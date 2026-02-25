class Solution {
    private static int helper(int [][]dp,int [][]grid,int rows , int col)
    {
        if(rows==grid.length-1 && col==grid[0].length-1)
        {//it means we reached the end;
            return grid[rows][col];
        }
        else if(rows==grid.length || col==grid[0].length)
        {//it means we are out of the grid;
            return Integer.MAX_VALUE; 
        }
        else if(dp[rows][col]!=-1)
        {
            return dp[rows][col];
        }
        else
        {
            int right = helper(dp,grid,rows,col+1);//moving right;
            int down =  helper(dp,grid,rows+1,col);//moving down;
            dp[rows][col] =  grid[rows][col]  + Math.min(right,down);
            return dp[rows][col];   
        }

    }
    public int minPathSum(int[][] grid) {
        int dp[][] = new int[grid.length][grid[0].length];
        for ( int i =0;i<dp.length;i++)
        {
            for( int j=0;j<dp[0].length;j++)
            {
                dp[i][j] = -1;
            }
        }
        int a = helper(dp,grid, 0, 0);
        return a;
    }
}
