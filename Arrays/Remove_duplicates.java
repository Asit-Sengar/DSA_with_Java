import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public int removeDuplicates(int[] nums) {
        return helper(nums);
    }

    public int helper(int[] nums) {
        Set<Integer> myset = new LinkedHashSet<>();
        for (int i = 0; i < nums.length; i++) {
            myset.add(nums[i]);
        }
        int m = 0;
        for (int element : myset) {
            nums[m] = element;
            m = m + 1;
        }
        return m;
    }
}