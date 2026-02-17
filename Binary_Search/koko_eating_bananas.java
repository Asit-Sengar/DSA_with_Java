//
class Solution
{
    //for calculating total time of selected speed;
    public long function( int []arr, int speed)
    {//this is to calculate the totaltime taken by koko for specific speed.
        long totaltime =0;
        for ( int i =0;i<arr.length ; i++)
        {
            int variable = arr[i];
          //instead of this if else statement we can also use Math.ceil inbuilt function.
          //but this is pure logical.
          if( variable%speed == 0)
            {
                variable = variable /speed;
            }
            else
            {
                variable = (variable/speed) + 1;
            }
            totaltime = totaltime + variable;//we can add variable to totaltime because totaltime is long and variable is int.
        }
        return totaltime;
    }
    public int minEatingSpeed(int[] nums, int h)
    {
        //for calculating max of array.
        //i have calculated max value , it can also be calculated by declaring the function.
        int max = Integer.MIN_VALUE;
        for ( int i =0;i<nums.length ; i++)
        {
            if( nums[i]>max)
            {
            max = nums[i];
            }
        }
        int answer= max;
        int low = 1;
        int high = max;
        while( low<=high)
        {
            int mid  = low + ( high - low)/2;
            long reqtime = function( nums, mid);
            if( reqtime <=h)//we have to calculate the minimum possible value.
            {
                answer = mid;
                high = mid - 1;
            }
            else 
            {
                low  = mid + 1;
            }
        }
        return answer;
    }
}
