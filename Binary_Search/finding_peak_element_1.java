//we are assuming only one peak to be here...
class Solution
{
    public int findPeakElement(int[] nums)
    {
        for ( int i =0;i<nums.length ; i++)
        {
            //check if current element is greater than its left (or is first element) and also greater than its right (or is last element)
            if((i==0 || nums[i]>nums[i-1])  && ( i==nums.length - 1||nums[i]>nums[i+1]))
            {
                //if both conditions hold true, current element is the peak
                return i;
            }
        }
        return - 1;
    }
}
