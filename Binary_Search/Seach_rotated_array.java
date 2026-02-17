//we will be applying binary searches after we find the index at which the array is rotated.
//instead of function you can name it as helper that is the more conventional method.
class Solution {
    public int search(int[] nums, int k)
    {
        int index = 0;
        for ( int i =0; i+1 <nums.length ; i++)
        {
            if(nums[i+ 1] < nums[i] )
            {
                index = i + 1;
                break;
            }
        }
        int a = function( nums , k, 0 , index - 1);
        int b = function( nums, k , index , nums.length - 1);
        if( a == -1 && b!= -1)
        {
            return b;
        }
        if( a!= -1)
        {
            return a;
        }
        return b;
    }
    public int function( int []nums ,int k,  int low , int high)
    {
        while( low<= high)
        {
            int mid = low + ( high - low )/2;
            if( nums[mid] == k )
            {
                return mid;
            }
            else if( nums[mid]> k)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return -1;
    }
}
