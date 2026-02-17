//the main idea is that suppose that the today is day 12 so every flower which has to bloom till will have bloomed.
//hence we can pluck those flowers to make bouquets .
//one thing to rememeber is that we can take only adjacent flowers.
class Solution
{
    public int countBouquets(int[] bloomday, int days, int adjacent)
    {//this is to calculate how many bouqets we can make at specific day.
        int count = 0;
        int noofbouquets = 0;
        for (int i = 0; i < bloomday.length; i++)  // Fixed
        {
            if (bloomday[i] <= days)  // Fixed
            {
                count = count + 1;//by increasing the count variable we are plucking the flowers.
                if (count == adjacent)//when we have sufficient flowers to make a bouqet we will stop.
                {
                    noofbouquets = noofbouquets + 1;//increasing the no of bouquets variable.
                    count = 0;//equating the count variable to 0 so that we can start making another bouquet/
                }
            }
            else
            {
                count = 0;//if the flower has not bloomed yet , count =0;
            }
        }
        return noofbouquets;
    }
    
    public int minDays(int[] nums, int m, int k)
    {
        int maxvalue = Integer.MIN_VALUE;
        int minvalue = Integer.MAX_VALUE;
        int answer = -1;
        
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] > maxvalue)
            {
                maxvalue = nums[i];
            }
            if (nums[i] < minvalue)
            {
                minvalue = nums[i];
            }
        }
        //we could have done this by using for loop but i would only increase the time complexity;
        int low = minvalue;
        int high = maxvalue;
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            int variable = countBouquets(nums, mid, k);  // Fixed
            {
                if (variable >= m)
                {
                    high = mid - 1;
                    answer = mid;
                }
                else
                {
                    low = mid + 1;
                }
            }
        }
        return answer;
    }
}
