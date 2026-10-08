/*
    the treenode class in already created
 */
class Solution {
    int answer = 0;// initialising a global variable;

    public void helper(TreeNode root, int level) {// recursive function
        if (root == null) {// base case for recursion;
            return;// return if root is null
        }
        answer = Math.max(level, answer);
        helper(root.left, level + 1);
        helper(root.right, level + 1);
    }

    public int maxDepth(TreeNode root) {
        helper(root, 1);
        return answer;
    }
}