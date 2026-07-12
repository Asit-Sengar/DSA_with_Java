class Solution {
    public static boolean canJump(int[] nums) {
        int max_index = 0;
        for (int i = 0; i < nums.length; i++) {
            max_index = Math.max(max_index, nums[i] + i);
            if (max_index == nums.length - 1) {
                return true;
            }
            if (i >= max_index) {
                return false;
            }
        }
        if (max_index >= nums.length - 1) {
            return true;
        }
        return false;
    }

    // public static void main(String[] args) {
    // int nums[] = { 3, 2, 1, 0, 4 };
    // System.out.println(canJump(nums));
    // }
}
