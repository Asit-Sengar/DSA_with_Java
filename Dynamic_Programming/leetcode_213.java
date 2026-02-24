//here we will apply the loop from 0 to n-2 and then 1 to n-1
class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
        {
            return nums[0];
        }
        if(nums.length==2)
        {
            return Math.max(nums[0],nums[1]);
        }
        int dp[] = new int[nums.length-1];
        int dp2[] = new int[nums.length-1];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for ( int i=2;i<dp.length;i++)
        {
            dp[i] = Math.max(nums[i] + dp[i-2],dp[i-1]);
        }
        dp2[0] = nums[1];
        dp2[1] = Math.max(nums[1],nums[2]);
        for ( int i =3;i<nums.length;i++)
        {
            dp2[i-1] = Math.max(nums[i] + dp2[i-3],dp2[i-2]);
        }
        return Math.max(dp[dp.length-1],dp2[dp2.length-1]);
    }
}
