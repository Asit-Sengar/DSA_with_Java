import java.util.*;

class Solution {
    private static void helper(int[] candidates, int sum, int index, int target, List<Integer> list,
            List<List<Integer>> answer) {
        if (sum == target) {// base case for recursion;
            {
                answer.add(new ArrayList<>(list));
            }
            return;
        }
        if (sum > target) {
            return;// just return that particular function call;
        }
        for (int i = index; i < candidates.length; i++) {
            list.add(candidates[i]);// making a choice;
            helper(candidates, sum + candidates[i], i, target, list, answer);
            list.remove(list.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> answer = new ArrayList<>();
        int sum = 0;
        helper(candidates, sum, 0, target, list, answer);
        return answer;
    }
    // public static void main(String[] args) {
    //     List<Integer> list = new ArrayList<>();
    //     List<List<Integer>> answer = new ArrayList<>();
    //     int target = 8;
    //     int sum = 0;
    //     int candidates[] = { 2, 3, 5 };
    //     Arrays.sort(candidates);
    //     helper(candidates, sum, 0, target, list, answer);
    //     System.out.println(answer);
    // }
}
