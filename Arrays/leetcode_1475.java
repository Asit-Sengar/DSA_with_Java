class Solution {
    public int[] finalPrices(int[] prices) {
        int answer[] = new int[prices.length];
        for ( int i =0;i<prices.length-1;i++)
        {
            int j= i+1;
            answer[i] = prices[i];
            while(j<prices.length)
            {
                if(prices[j]<=prices[i])
                {
                    answer[i] = prices[i]-prices[j];
                    break;
                }
                j++;
            }
        }
        answer[answer.length-1] = prices[prices.length-1];
        return answer;
    }
}
