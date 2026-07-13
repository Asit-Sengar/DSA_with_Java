class Solution {
    public static int jump(int[] nums) {
        int answer = 0;
        int right = 0;//for maintaining range
        int left = 0;
        while (right < nums.length - 1) {
            int farthest = 0;//if calculates the farthest i can reach from this range
            for (int index = left; index <= right; index++) {// traversing in the range;
                farthest = Math.max(farthest, nums[index] + index);
            }
            left = right + 1;// moving the range ahead
            right = farthest;// moving the right pointer to the next farthest;
            answer = answer + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 1, 2, 3, 1, 1, 2 };
        System.out.println(jump(nums));
    }
}
