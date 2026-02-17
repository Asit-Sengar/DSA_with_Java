class Solution
{
    public int[] sortArrayByParity(int[] nums)
    {
        int left = 0;
        int right =0;
        while(left<=right && right<nums.length)
        {
            if(nums[right]%2==0)//if it is even
            {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left ] = temp;
                right++;
                left++;
            }
            else
            {
                right++;
            }
        }
        return nums;
    }
}
