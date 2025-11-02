class Solution
{
  public int lowerbound( int []arr, int a)
  {//for finding the first occurence of the number;
    int low =0;
    int high = arr.length - 1;
    int index=-1;
    while( low<=high)//using binary search instead of linear search.
    {
      int mid= low + ( high-low)/2;
      if( arr[mid]<=a)
      {
        index = mid;
        low = mid +1;
      }
      else
      {
        high = mid - 1;
      }
    }
    return index;
  }
    public int rowWithMax1s(int[][] matrix)
    {
      int answer=-1;
      int max = Integer.MIN_VALUE;
      for ( int row=0;row<matrix.length;row++)
      {
        int count = lowerbound(matrix[row],1);
        if( count>max)
        {
          max = count;
          answer = row;
        }
      }
      return answer;
    }
}
