class Solution {
    public int helper(int number)
    {
        int sum = 0;
        int temp = number;
        while(temp>0)
        {
            sum = sum + temp%10;
            temp = temp/10;
        }
        return sum;
    }
    public int differenceOfSum(int[] nums) {
        int answer = 0;
        int total_sum = 0;
        for(int i = 0;i<nums.length ; i++)
        {
            total_sum = total_sum +  nums[i];
            answer = answer + helper(nums[i]);
        }
        return Math.abs(answer - total_sum);
    }
}