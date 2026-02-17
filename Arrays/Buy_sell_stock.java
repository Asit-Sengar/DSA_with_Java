class Solution
{
    public int maxProfit(int[] prices)
    {
        int answer = 0;
        int buying = Integer.MAX_VALUE;
        int profit =0;
        if( prices.length ==1)
        {
            return 0;
        }
        for ( int i =0;i<prices.length ; i++)
        {
            if( prices[i]<buying)
            {
                buying  = prices[i];
            }
            else
            {
                if( (prices[i] - buying) > answer)
                {
                    answer = prices[i] - buying;
                }
            }
        }
        return answer;    
    }
}
