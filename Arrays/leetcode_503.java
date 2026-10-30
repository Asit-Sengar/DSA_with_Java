
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int temp[] = new int[nums.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = -1;// initialising the array with -1;
        }
        for (int i = 0; i < temp.length; i++) {// outer loop
            for (int j = 0; j < temp.length; j++) {// finding greater element
                int circular_index = (i + j) % temp.length;
                if (nums[circular_index] > nums[i]) {
                    temp[i] = nums[circular_index];
                    break;
                }
            }
        }
        return temp;
    }
}