class Solution {

    public static int longestOnes(int[] nums, int k) {
        int left = 0, result = 0, count_zero = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                count_zero++;
            }
            while (count_zero > k) {
                if (nums[left] == 0) {
                    count_zero--;
                }
                left++;
            }
            result = Math.max(result, right - left + 1);
        }

        return result;
    }

    // public static void main(String[] args) {
    // int arr[] = { 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 };
    // int a = longestOnes(arr, 3);
    // System.out.println("the answer is: " + a);
    // }
}