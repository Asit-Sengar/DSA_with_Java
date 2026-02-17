class Solution
{
    public int function( int []nums, int divisor)
    {//to calculate the threshold of a given divisor;
        int itsthreshold = 0;
        int b =0;
        for (int i =0; i<nums.length ; i++)
        {//here i dont want to use Math.ceil() inbuilt function so...
            if( nums[i]%divisor==0 )
            {
                b = nums[i]/divisor;
            }
            else if(nums[i]%divisor !=0)
            {
                b = nums[i]/divisor + 1;
            }
            itsthreshold = itsthreshold + b;
        }
        return itsthreshold;
    }
    public int smallestDivisor(int[] nums, int threshold)
    {
        int max = Integer.MIN_VALUE;
        int answer = -1;
        for ( int i=0;i<nums.length ; i++)
        {
            if( nums[i]>max)
            {
                max = nums[i];
            }
        }
        int low = 1;
        int high = max;
        while( low<=high)
        {
            int mid = low+ ( high -low)/2;
            int a = function( nums , mid);
            if( a<=threshold)
            {
                answer = mid;
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return answer;
    }
}
