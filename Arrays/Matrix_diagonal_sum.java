class Solution
{
    public int diagonalSum(int[][] mat)
    {
        int i =0;
        int j=0;
        int sum =0;
        int q=0;
        int p=mat.length-1;
        while(i<mat.length && j<mat.length && q<mat.length)
        {//we are obtaining the sum in single loop only
            sum = sum + mat[i++][j++];
            sum = sum + mat[q++][p--];
        }
        if(mat.length%2==0)
        {
          return sum;
        }
        else
        {
            return sum-mat[mat.length/2][mat.length/2];
        }
    }
}
