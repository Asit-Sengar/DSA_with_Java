class Solution
{
    public boolean searchMatrix(int[][] matrix, int target)
    {
        boolean answer = false;
        int row =0;
        int col= matrix[row].length-1;
        while(row<matrix.length && col>=0)
        {
            if( matrix[row][col]==target)
            {
                answer = true;
                break;
            }
            else if( matrix[row][col]>target)
            {//if the element is greater than target then we will eliminate entire coloumn and move to the previous coloumn.
                col = col -1;
            }
            else
            {//if the element is smaller than target then we will eliminate the entire row and move to the next row.
                row = row +1;
            }
        }
        return answer;
    }
}
