/*
    i am maintaining sum at each node
    if sum == target sum 
    return true;
 */
class Solution {
    boolean answer = false;

    public void helper(TreeNode root, int targetSum, int sum) {
        if (root == null) {
            return;
        }
        int temp = sum + root.val;
        if (temp == targetSum && root.left == null && root.right == null) {
            answer = true;
            return;
        }
        helper(root.left, targetSum, sum + root.val);
        helper(root.right, targetSum, sum + root.val);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        helper(root, targetSum, 0);
        return answer;
    }
}
