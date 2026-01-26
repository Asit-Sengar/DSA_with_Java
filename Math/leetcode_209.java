//we are using the sliding window approach here 
//the first loop is for adding the right to the sum;
//now that we have added to the sum we have to decrement the sum to find the least length
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int left = 0;
        int answer = 0;
        int min = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum = sum + nums[right];
            while (sum >= target) {
                answer = Math.min(min, right - left +1);
                min = answer;
                sum = sum - nums[left];
                left = left + 1;
            }
        }
        return answer;
    }
}
