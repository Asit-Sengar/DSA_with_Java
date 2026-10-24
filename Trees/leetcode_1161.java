import java.util.ArrayList;

class Solution {
    List<Integer> list = new ArrayList<>();

    public void helper(TreeNode root, int level) {
        if (root == null) {// base case
            return;
        }
        if (level == list.size()) {
            list.add(root.val);
        } else {
            list.set(level, list.get(level) + root.val);
        }
        helper(root.left, level + 1);// recursive step
        helper(root.right, level + 1);// recursive step
    }

    public int maxLevelSum(TreeNode root) {
        helper(root, 0);// this will modify the array
        int max = Integer.MIN_VALUE;
        int answer = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                answer = i;
                max = list.get(i);
            }
        }
        return answer + 1;
    }
}
