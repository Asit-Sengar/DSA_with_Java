/*
    we have to traverse the whole tree and try to find any
    irregularity in tree with respect to unequal value or 
    null node
 */
class Solution {
    boolean answer = true;

    public void helper(TreeNode p, TreeNode q) {
        if (p == null && q == null) {// base case
            return;
        }
        if ((p != null && q == null || q != null && p == null) || p.val != q.val) {
            answer = false;
            return;
        }
        helper(p.left, q.left);// recursive steps
        helper(p.right, q.right);// recursive steps
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        helper(p, q);// this will build the answer variable
        if (answer == false) {
            return false;
        }
        return true;
    }
}
