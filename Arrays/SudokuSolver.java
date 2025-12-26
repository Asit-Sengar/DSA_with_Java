//sudoku solver
class Solution {
    public boolean isValid(char[][] board, int row, int col, char a) {// this function checks for validity.
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == a && i != col) {// here we are checking for row
                return false;
            }
            if (board[i][col] == a && i != row) {// here we are checking for col
                return false;
            }
        }
        int startrow = row - row % 3;
        int startcol = col - col % 3;
        for (int i = 0; i < 3; i++) {// here we are checking for grid.
            for (int j = 0; j < 3; j++) {
                if (board[startrow + i][startcol + j] == a && (startrow + i != row && startcol + j != col))
                {//checking for grid.
                    return false;
                }
            }
        }
        return true;// if any loop return false is not executed it means everything is fine.
    }

    public boolean helper(char[][] mat, int row, int col)
    {// writing core helper logic
        if (row == 9) {//it means whole sudoku is solved
            return true;
        }
        if (col == 9) {//if col==9 change the row
            return helper(mat, row + 1, 0);
        }
        if (mat[row][col] != '.') {//move on to the next
            return helper(mat, row, col + 1);
        }
        for (char a = '1'; a <= '9'; a++) {
            if (isValid(mat, row, col, a) == true)
            {
                mat[row][col] = a;
                if (helper(mat, row, col + 1) == true)
                {
                    return true;
                }
                mat[row][col] = '.';
            }
        }
        return false;
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
}
