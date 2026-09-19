class Solution {
    public int helper(int[] nums, int k) {// this is for calculatin at most k odd numbers
        int odd = 0;
        int answer = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] % 2 != 0)// if it is odd
            {
                odd++;
            }
            while (odd > k) {
                if (nums[left] % 2 != 0)// if it is odd
                {
                    odd--;
                }
                left++;
            }
            answer = answer + right - left + 1;
        }
        return answer;
    }

    public int numberOfSubarrays(int[] nums, int k) {
        return helper(nums, k) - helper(nums, k - 1);
    }
}