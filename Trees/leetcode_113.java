import java.util.*;

class Solution {
    List<List<Integer>> answer = new ArrayList<>();// global varaible

    public void helper(TreeNode root, int targetSum, ArrayList<Integer> list, int sum) {
        if (root == null) {// base case
            return;
        }
        list.add(root.val);
        if ((sum + root.val == targetSum && root.left == null && root.right == null)) {// we found the list, add it to
                                                                                       // the answer
            answer.add(new ArrayList<>(list));
            list.remove(list.size() - 1);
            return;
        }
        helper(root.left, targetSum, list, sum + root.val);// recursive steps
        helper(root.right, targetSum, list, sum + root.val);// recursive steps
        list.remove(list.size() - 1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        helper(root, targetSum, list, sum);
        return answer;
    }
}
