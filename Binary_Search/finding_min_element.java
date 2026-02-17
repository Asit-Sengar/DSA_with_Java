class Solution {
    public int findMin(int[] nums)
    {
        int low = 0;
        int high = nums.length - 1;
        int answer = Integer.MAX_VALUE;//to store the answer;
        while(low <=high)
        {//the main idea is that if the we are on the sorted half then first element will be the min and then check in the non sorted half.
            int mid = low + (high - low)/2;
            if(nums[low]<= nums[mid])
            {
                answer = Math.min(answer, nums[low]);//here we are on the sorted half so low or the previous min will be the min.
                low = mid + 1;
            }
            else
            {
                answer = Math.min( answer , nums[mid]);
                high = mid - 1;
            }
        }
        return answer;
    }
}
