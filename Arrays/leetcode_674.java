/*
    we have to iterate through the array and find the 
    longest array;
    if we encounter any element which is smaller than its previous element
    we will make the counter variable to 0;
 */
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int answer = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                count = 1;
            } else {
                count = count + 1;
                answer = Math.max(answer, count);
            }
        }
        return answer;
    }
}