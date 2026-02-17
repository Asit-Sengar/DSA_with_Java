class Solution {
    public int helper( int []nums , int maxlimit)
    {
        int currentsum =0;
        int count =1;
        for ( int i =0;i<nums.length ; i++)
        {
            if( currentsum +nums[i]>maxlimit)
            {
                count = count + 1;
                currentsum = nums[i];
            }
            else
            {
                currentsum = currentsum + nums[i];
            }
        }
        return count;
    }
    public int splitArray(int[] nums, int k) {//calculating max and total.
        int max = Integer.MIN_VALUE;
        int total = 0;
        int answer =0;
        if( nums.length <k)
        {
            return -1;//it means it is not possible.
        }
        for ( int i =0;i<nums.length ; i++)
        {
            if( nums[i]>max)
            {
                max = nums[i];
            }
            total  = total + nums[i];
        }
        int low = max;
        int high = total;
        while( low<=high )
        {
            int mid = low+ (high - low)/2;
            if( helper( nums , mid)>k)
            {
                low = mid + 1;
            }
            else
            {
                answer = mid;
                high  = mid -1;
            }
        }
        return answer;
    }
}
