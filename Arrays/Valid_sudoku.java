class Solution
{
    public boolean isValid(char[][]board,int row,int col,char a )
    {//this function checks for validity.
        for ( int i=0;i<9;i++)
        {
            if(board[row][i]==a && i!=col)
            {//here we are checking for row
                return false;
            }
            if(board[i][col]==a && i!=row)
            {//here we are checking for col
                return false;
            }
        }
        int startrow = row - row%3;
        int startcol  = col - col%3;
        for ( int i=0;i<3;i++)
        {//here we are checking for grid.
            for ( int j =0;j<3;j++)
            {
                if(board[startrow + i][startcol + j]==a && (startrow + i!=row && startcol + j!=col))
                {//here we are checking for grid
                    return false;
                }
            }
        }
        return true;//if any return false is not executed it means everything is fine.
    }
    public boolean isValidSudoku(char[][] board)
    {
        for ( int row=0;row<9;row++)
        {
            for(int col=0;col<9;col++)
            {//we are iterating in every cell and checking using our isValid methods
                if(board[row][col]!='.')
                {
                    if(isValid(board,row,col,board[row][col])==false)//if it is not valid return false;
                    {//if an char is not valid return false;
                        return false;
                    }
                }
            }
        }
    return true;
    }
}
