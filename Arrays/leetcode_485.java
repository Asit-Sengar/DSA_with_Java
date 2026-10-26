/*
    initialising a counter varaible to 0
    initialising a answer varaible to 0
    traverse in the array and increment the counter varaible only when 
    encountering a 1 
    else make the counter to 0
    return the answer variable
 */
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count = count + 1;
                answer = Math.max(answer, count);
            } else {
                count = 0;
            }
        }
        return answer;
    }
}