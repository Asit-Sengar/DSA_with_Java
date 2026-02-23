class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        if(dp.length>1)
        {
            dp[1] = Math.max(nums[0],nums[1]);
        }
        for(int i=2;i<nums.length;i++)
        {//this is the most optimised approach i have seen
            dp[i] = Math.max(dp[i-2]+nums[i], dp[i-1]);
        }
        return dp[dp.length-1];
    }
}
