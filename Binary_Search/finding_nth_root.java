//dont forget to take all data types as long not int.
class Solution
{
  //here I declared a function just to compute the multipliction process.
  //it is using recursion , you can do this for or while loop also.
  public long function( long number , int times)
  {
    if( times == 1)
    {
      return number;
    }
    long answer = number * function( number , times - 1);
    return answer;
  }
    public int NthRoot(int n, int m)
    {
        long low = 1;
        long high = m;
        while( low<=high)
        {
          long mid = low + (high - low)/2;
          if( function(mid,n)== m)
          {
            return (int)mid;
          }
          else if( function(mid,n)<m)
          {
            low = mid + 1;
          }
          else
          {
            high = mid - 1;
          }
        }
        return -1;
    }
}
