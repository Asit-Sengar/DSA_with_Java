class Solution {
    public boolean canAliceWin(int[] nums) {
        int single = 0;
        int double_sum = 0;
        for(int i = 0;i<nums.length ; i++)
        {
            if(nums[i]<10)
            {
                single = single + nums[i];
            }
            else
            {
                double_sum = double_sum + nums[i];
            }
        }
        if(single != double_sum)
        {
            return true;
        }
        return false;
    }
}