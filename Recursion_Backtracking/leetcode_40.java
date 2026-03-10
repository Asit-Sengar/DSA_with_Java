//so the main goal here is that we will sort the array first and then if(candidates[i-1]!=candidates[i]);;this is to avoid the duplicates;
//then do all the steps;
//find all unique combinations whose sum == target; 
import java.util.*;

class Solution {
    private static void helper(int index, int sum, int target, List<Integer> list, int[] candidates,
            List<List<Integer>> answer) {
        if (sum == target) {// found a combination;
            answer.add(new ArrayList<>(list));
            return;
        }
        if (sum > target) {// no need to move ahead if sum>target;
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i > index && (candidates[i - 1] == candidates[i])) {
                continue;
            }
            list.add(candidates[i]);// making a choice;
            helper(i + 1, sum + candidates[i], target, list, candidates, answer);// recursive step;
            list.remove(list.size() - 1);// backtraking step;
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        helper(0, 0, target, list, candidates, answer);
        return answer;
    }
}
