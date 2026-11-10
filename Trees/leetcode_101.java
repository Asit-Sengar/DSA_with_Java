class Solution {

    public boolean helper(TreeNode left, TreeNode right) {
        if (left == null && right == null) {// base case
            return true;
        } else if (left == null || right == null) {// if anyone of them is null
            return false;
        } else if (left.val != right.val) {// if value doesnt match
            return false;
        }
        return helper(left.left, right.right) && helper(left.right, right.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return helper(root.left, root.right);
    }
}
