import java.util.HashSet;

class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int i = 0;
        int j = 1;
        while (i < j && j < nums.length) {
            int sum = nums[i] + nums[j];
            if (set.contains(sum)) {
                return true;
            } else {
                set.add(sum);
            }
            i++;
            j++;
        }
        return false;
    }
}