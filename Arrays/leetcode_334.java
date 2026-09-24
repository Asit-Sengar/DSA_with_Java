/*
    so the main idea here is we will find a number which is lowest and then try to find
    the second largest number and if any number is greater than second largest then we can 
    return true otherwise false
 */
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int lowest = Integer.MAX_VALUE;
        int second_lowest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= lowest) {
                lowest = nums[i];
            } else if (nums[i] > lowest && nums[i] < second_lowest) {
                second_lowest = nums[i];
            } else if (nums[i] > second_lowest) {
                return true;// we found a valid subsequence
            }
        }
        return false;
    }
}