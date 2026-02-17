class Solution
{
    public void rotate(int[][] matrix)
    {
        //for transposing
        int n = matrix.length;
        for (int i =0; i<matrix.length;i++)
        {
            for ( int j =0; j<matrix[i].length;j++)
            {
                if( i<j)
                {
                    int temp = matrix[j][i];
                    matrix[j][i] = matrix[i][j];
                    matrix[i][j] = temp;
                }
            }
        }  
        //for reversing the coloumns
        for ( int j = 0;j<matrix[0].length/2; j++)
        {
            for ( int i=0; i<matrix.length;i++)
            {
                int temp = matrix[i][j] ;
                matrix[i][j]= matrix[i][(n - 1) - j];
                matrix[i][(n - 1) - j]= temp;                
            }
        }     
    }
}
