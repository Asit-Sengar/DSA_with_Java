class Solution {
    public int findMiddleIndex(int[] nums) {
        int leftsum=0;
        int totalsum=0;
        for ( int j=0;j<nums.length;j++)
        {//for calculation of total sum;
            totalsum = totalsum+ nums[j];
        }
        for ( int j=0;j<nums.length;j++)
        {
            int rightsum = totalsum - leftsum -nums[j];
            if(leftsum == rightsum)
            {
                return j;
            }
            leftsum = leftsum + nums[j];
        }
        return -1;
    }
}
