/*
    i will iterate throught the array once and keep the record
    of longest string increasing subarray and longest decreasing subarray
    both and return the maximum value of both
 */
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int answer = 1;
        int length_increasing = 1;
        int length_decreasing = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                length_increasing = length_increasing + 1;
                length_decreasing = 1;
            } else if (nums[i] < nums[i - 1]) {
                length_decreasing = length_decreasing + 1;
                length_increasing = 1;
            } else {
                length_increasing = 1;
                length_decreasing = 1;
            }
            answer = Math.max(answer, Math.max(length_increasing, length_decreasing));
        }
        return answer;
    }
}