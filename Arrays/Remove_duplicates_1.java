class Solution
{
    public int removeDuplicates(int[] nums)
    {
        int p =1;
        int element = nums[0];
        for ( int i =0;i<nums.length ; i++)
        {
            if( nums[i]== element)
            {
                continue;
            }
            else
            {
                nums[p] = nums[i];
                element = nums[i];
                p = p + 1;
            }
        }
        return p;
    }
}
