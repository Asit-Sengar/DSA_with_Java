class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp[] = new int[cost.length];
        dp[0] = cost[0];
        if(dp.length==2)
        {//if length ==2
            return Math.min(cost[0],cost[1]);
        }
        if(dp.length==3)
        {
            return Math.min(cost[0]+cost[2],cost[1]);
        }
        dp[1] = Math.min(cost[1]+dp[0],cost[1]);
        for(int i=2;i<dp.length;i++)
        {
            dp[i] = Math.min(cost[i]+dp[i-1],cost[i]+dp[i-2]);
        }
        return Math.min(dp[dp.length-1],dp[dp.length-2]);//returning the min of last two indeces because if am at the last second index and want to  2 steps i can...
    }
}
