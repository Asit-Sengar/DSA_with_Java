class Solution {
    public static int helper(int[] nums, int index, int k) {// this will calculate the max length from a index
        int i = index;// storing the index;
        int count = 0;
        while (i < nums.length && (nums[i] == 1 || k > 0)) {
            if (nums[i] == 1) {
                count++;
            } else {
                count++;
                k = k - 1;
            }
            i++;
        }
        return count;
    }

    public static int longestOnes(int[] nums, int k) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = Math.max(result, helper(nums, i, k));
        }
        return result;
    }

    // public static void main(String[] args) {
    //     int arr[] = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
    //     int a = longestOnes(arr, 2);
    //     System.out.println("the answer is: " + a);
    // }
}