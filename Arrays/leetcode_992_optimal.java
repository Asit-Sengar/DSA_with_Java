import java.util.HashMap;

class Solution {
    public static int helper(int[] nums, int k) {
        int count = 0;
        int left = 0, right = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (right < nums.length) {
            if (map.containsKey((nums[right]))) {
                map.put(nums[right], map.get(nums[right]) + 1);
            } else {
                map.put(nums[right], 1);
            }
            while (map.size() > k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left = left + 1;
            }
            count = count + (right - left + 1);
            right = right + 1;
        }
        return count;
    }

    public static int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums, k) - helper(nums, k - 1);
    }

    // public static void main(String[] args) {
    // int arr[] = { 1, 2, 1, 3, 4 };
    // int a = subarraysWithKDistinct(arr, 3);
    // System.out.println("the answer is: " + a);

    // }
}