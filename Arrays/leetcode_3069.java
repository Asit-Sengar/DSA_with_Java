import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] resultArray(int[] nums) {
        int result[] = new int[nums.length];
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(nums[0]);
        list2.add(nums[1]);
        for (int i = 2; i < nums.length; i++) {
            if (list1.get(list1.size() - 1) > list2.get(list2.size() - 1)) {
                list1.add(nums[i]);
            } else {
                list2.add(nums[i]);
            }
        }
        int p = 0;
        int index = 0;
        while (index < list1.size()) {
            result[p++] = list1.get(index);
            index++;
        }
        index = 0;
        while (index < list2.size()) {
            result[p++] = list2.get(index);
            index++;
        }
        return result;
    }
}