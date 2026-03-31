class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i + 1 < nums.length; i = i + 2) {
            int temp = nums[i];
            int temp1 = nums[i + 1];
            nums[i] = temp1;
            nums[i + 1] = temp;
        }
        return nums;
    }
}
