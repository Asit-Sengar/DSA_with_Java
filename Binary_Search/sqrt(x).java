class Solution
{
    public int mySqrt(int x)
    {
        long low =0;
        long high = x/2;
        long answer = -1;
        if(x==1)
        {
            return 1;
        }
        while(low<=high)
        {
            long mid = low + (high - low)/2;
            if(mid * mid == x)
            {
                answer = mid;
                break;
            }
            else if((mid * mid) > x)
            {
                high = mid - 1;
            }
            else
            {
                answer = mid;
                low = mid + 1;
            }
        }    
        int temp = (int)answer;
        return temp;
    }
}
