//we are assuming only one peak to be here...
class Solution
{
    public int findPeakElement(int[] nums)
    {
        if( nums.length == 1)
        {
            return 0;
        }
        if( nums[0]>nums[1])//condition for first element.
        {
            return 0;
        }
        else if( nums[nums.length - 1]>nums[nums.length - 2])//condition for last element.
        {
            return nums.length -1 ;
        }
        else
        {//making binary search only in the elements expect first and last because we wrote code for them separately.
            int low = 1;
            int high = nums.length -2;
            while( low<=high)
            {//so the main idea is if we are on the increasing curve then peak element must be in right direction and vice versa.
                int mid = low + ( high - low )/2;
                if( nums[mid]>nums[mid - 1]&& nums[mid]>nums[mid + 1])
                {
                    return mid;
                }
                else if( nums[mid]>nums[mid- 1])
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid - 1;
                }
            }
        }
        return - 1;//just for returning the integer data type answer.
      
    }
}
