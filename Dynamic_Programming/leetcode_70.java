// trying to optimise it with dp;
import java.util.Arrays;
class Solution {
    private static int helper(int n,int index,int []dp) {
        if(index==n)
        {//it means we have reached
            return 1;
        }
        if(index>n)
        {//it means we are out of the array;
            return 0;
        }
        if(dp[index]!=-1)
        {//that means we have already calculated it;
            return dp[index];
        }
        int a = helper(n,index+1,dp);
        int b = helper(n,index+2,dp);
        dp[index]= a+b;
        return dp[index];

    }
    public int climbStairs(int n) {
        int index=0;//from where i am starting;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        int answer = helper(n,index,dp);
        return answer;
    }
}
