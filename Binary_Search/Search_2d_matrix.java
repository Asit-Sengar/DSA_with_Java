class Solution
{
    public boolean isfound(int[]arr, int a)
    {//this function is to find whether the element is present or not.
        int low =0;
        int high = arr.length - 1;
        boolean isfound= false;//setting the boolean variable to false;
        while( low<=high)
        {
            int mid = low + (high-low)/2;
            if(arr[mid]==a)
            {
                isfound = true;
                break;
            }
            else if( arr[mid]<a)
            {
                low= mid +1;
            }
            else
            {
                high = mid-1;
            }
        }
        return isfound;
    }
    public boolean searchMatrix(int[][] matrix, int target)
    {
        boolean answer = false;//if element is not present in the matrix;
        for( int row=0;row<matrix.length;row++)
        {
            if((isfound(matrix[row],target)==true))
            {
                answer = true;
                break;//break the loop if we found that element.
            }
        }
        return answer;
    }
}
