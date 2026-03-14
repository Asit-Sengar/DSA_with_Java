import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
    private static void function(int index, int[] nums, List<Integer> list, List<List<Integer>> answer) {
        if (index == nums.length) {
            return;// we reached the end of the list;
        }
        for (int i = index; i < nums.length; i++) {
            if (i == index) {
                list.add(nums[i]);// for making a choice;
                answer.add(new ArrayList<>(list));// adding a copy of the list;
                function(i + 1, nums, list, answer);// recursive call;
                list.remove(list.size() - 1);// most important backtraking step;
            } else if (i > index && nums[i - 1] != nums[i]) {// this is for skipping the duplicates;
                list.add(nums[i]);// for making a choice;
                answer.add(new ArrayList<>(list));// adding a copy of the list;
                function(i + 1, nums, list, answer);// recursive call;
                list.remove(list.size() - 1);// most important backtraking step;
            }
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        answer.add(temp);
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        function(0, nums, list, answer);
        return answer;
    }
    // public static void main(String[] args) {
    //     List<List<Integer>> answer = new ArrayList<>();
    //     List<Integer> temp = new ArrayList<>();
    //     answer.add(temp);
    //     List<Integer> list = new ArrayList<>();
    //     int nums[] = { 1 };
    //     function(0, nums, list, answer);
    //     System.out.println(answer);
    // }
}
