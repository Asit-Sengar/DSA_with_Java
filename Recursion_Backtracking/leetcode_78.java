// generate all subsets of an array with recursion and backtraking;
//leetcode 78;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private static void function(int index, int[] nums, List<Integer> list, List<List<Integer>> answer) {
        if (index == nums.length) {
            return;
        }
        for (int i = index; i < nums.length; i++) {// whenever i make a choice i have to add it;
            if (!list.contains(nums[i])) {
                list.add(nums[i]);// making a choice;
                answer.add(new ArrayList<>(list));// adding a copy to answer list;
                function(i + 1, nums, list, answer);//if we are adding to the list, there is no need of index;
                list.remove(list.size() - 1);// backtracking step;
            }
        }
    }
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        answer.add(temp);
        int index = 0;
        function(index, nums, list, answer);
        return answer;
    }
}
