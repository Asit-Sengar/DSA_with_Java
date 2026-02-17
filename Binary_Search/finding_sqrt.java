class Solution
{
    public int floorSqrt(int n)
    {
        if( n==0 || n==1)
        {
            return n;
        }//considering the constrainst , we will take data types as long not int. 
        long low =1;
        long high = n/2;
        long answer = 1;
        while( low<=high)
        {
            long mid = low + (high - low)/2;
            if( mid*mid<=n)
            {
                low = mid + 1;
                answer = mid;
            }
            else
            {
                high = mid - 1;
            }
        }
      return (int)answer;//type casting (changing the data type of answer to int just for returning it).
    }
}
