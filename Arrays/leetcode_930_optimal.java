/*
first we will try to get number of subarray whose sum is lesser than or e
equals to goal;
 */
class Solution {
    public static int helper(int nums[], int goal) {
        if (goal < 0) {
            return 0;
        }
        int i = 0, j = 0, count = 0, sum = 0;
        while (j < nums.length && i <= j) {
            sum = sum + nums[j];
            while (sum > goal && i < nums.length) {
                sum = sum - nums[i];
                i++;
            }
            count = count + (j - i + 1);
            j++;
        }
        return count;
    }

    public static int numSubarraysWithSum(int[] nums, int goal) {
        int result = helper(nums, goal) - helper(nums, goal - 1);
        return result;
    }

    // public static void main(String[] args) {
    // int arr[] = { 0, 0, 0, 0, 0 };

    // int a = numSubarraysWithSum(arr, 0);
    // System.out.println("the answer is: " + a);

    // }
}