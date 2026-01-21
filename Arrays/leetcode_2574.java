class Solution
{
    public int[] leftRightDifference(int[] nums)
    {
        int answer[] = new int[nums.length];
        int totalsum =0;
        for ( int i=0;i<nums.length;i++)
        {//for calculation of total sum;
            totalsum = totalsum + nums[i];
        }
        int leftsum = 0;
        for ( int j=0;j<answer.length;j++)
        {//we will store only the rightsum and calculate everything according to it;
            int rightsum = totalsum -leftsum -nums[j];
            answer[j]  = Math.abs(leftsum-rightsum);
            leftsum = leftsum + nums[j];
        }
        return answer;
    }
}
