import java.util.HashSet;

class Solution {
    public static int subarraysWithKDistinct(int[] nums, int k) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i; j < nums.length; j++) {
                set.add(nums[j]);
                if (set.size() == k) {
                    answer++;
                }
            }
        }
        return answer;
    }

    // public static void main(String[] args) {
    // int arr[] = { 1, 2, 1, 3, 4 };
    // int a = subarraysWithKDistinct(arr, 3);
    // System.out.println("the answer is: " + a);

    // }
}