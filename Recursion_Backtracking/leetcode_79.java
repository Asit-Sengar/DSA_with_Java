//we have to explore all four directions 
//if we dont get the desired character then we will do backtrack;
class Solution {
    private static boolean helper(char[][] grid,boolean [][] visited, int index, int row, int col,String word) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) {
            return false;//it shows we are out of the grid;
        }
        if (index == word.length()) {//base case;
            return true;
        }
        if(visited[row][col])
        {//this is important as it shows whether we visited current cell or not;
            return false;
        }
        if (grid[row][col] != word.charAt(index)) {
            return false;//if character is not matching then no need to go ahead;
        }

        visited[row][col] = true;//marking the current cell true so that we will not take it again
        
        boolean found = (helper(grid,visited, index + 1, row, col + 1,word)// going right
        ||helper(grid,visited,index + 1, row + 1, col, word)// going down
        ||helper(grid,visited,index + 1, row, col - 1, word)// going left
        ||helper(grid,visited,index + 1, row - 1, col, word));// going up

        visited[row][col] = false;//this is the backtracking step , we marking it unvisited here
        return found;
    }

    public boolean exist(char[][] board, String word) {
        if(word.length()==1 && word.charAt(0)==board[0][0])
        {
            return true;
        }
        boolean [][] visited = new boolean[board.length][board[0].length];
        for ( int i=0;i<board.length;i++)
        {
            for (int j=0;j<board[i].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {//implementing the helper helper
                    if(helper(board,visited,0,i,j,word))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
