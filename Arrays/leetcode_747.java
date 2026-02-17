class Solution
{
    public int pivotIndex(int[] nums)
    {
        int leftsum=0;
        int totalsum =0;
        for ( int j=0;j<nums.length;j++)
        {//for calculation of totalsum;
            totalsum = totalsum + nums[j];
        }
        for( int i=0;i<nums.length;i++)
        {//dont declare prefix and suffix arrays , insted this approach
            int rightsum= totalsum  - leftsum - nums[i];
            if(leftsum==rightsum)
            {
                return i;
            }
            leftsum=leftsum + nums[i];
        }
        return -1;
    }
}
