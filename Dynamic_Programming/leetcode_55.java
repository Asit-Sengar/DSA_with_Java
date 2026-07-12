class Solution {
    public static boolean helper(int[] nums, int index) {
        if (index >= nums.length) {
            return false;
        }
        if (index == nums.length - 1) {// base case for recursion
            return true;
        }
        for (int i = 1; i <= nums[index]; i++) {
            if (helper(nums, index + i)) {
                return true;
            }
        }
        return false;
    }

    public boolean canJump(int[] nums) {
        int index = 0;
        return helper(nums, index);
    }
}
