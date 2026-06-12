import java.util.HashMap;//importing the concrete class;
import java.util.Map;//importing the interface;
import java.util.Arrays;

class Solution {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int i = 0; i < nums2.length; i++) {// it will make a hashmap which will have the indices of all the
                                                // elements;
            map.put(nums2[i], index++);
        }
        int result[] = new int[nums1.length];
        Arrays.fill(result, -1);
        for (int i = 0; i < nums1.length; i++) {
            for (int j = map.get(nums1[i]); j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    result[i] = nums2[j];
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int nums1[] = { 2, 4 };
        int nums2[] = { 1, 2, 3, 4 };
        int result[] = nextGreaterElement(nums1, nums2);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}