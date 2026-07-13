class Solution {
    static int answer = Integer.MAX_VALUE;// declaring global varaible

    public static void helper(int[] nums, int index, int count) {
        if (index >= nums.length) {// if i am ahead of the last index
            return;
        }
        if (index == nums.length - 1) {
            answer = Math.min(answer, count);
            return;// got the answer, return it
        }
        for (int i = 1; i <= nums[index]; i++) {
            helper(nums, index + i, count + 1);// making choices by updating it
        }
    }

    public static int jump(int[] nums) {
        answer = Integer.MAX_VALUE;
        helper(nums, 0, 0);
        return answer;
    }

    // public static void main(String[] args) {
    // int nums[] = { 2, 3, 0, 1, 4 };
    // System.out.println(jump(nums));
    // }
}