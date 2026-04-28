class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2)
        {
            return 0;
        }
        Arrays.sort(nums);
        int answer = Integer.MIN_VALUE;
        for ( int i=1;i<nums.length;i++)
        {
            answer = Math.max(answer,nums[i]-nums[i-1]);
        }
        return answer;
    }
}
