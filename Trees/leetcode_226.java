/*
    we are trying to invert the left and right subtree
    and then recursively invert smaller and smaller trees
*/
class Solution {
    public void helper(TreeNode root) {
        if (root == null) {// base case;
            return;
        }

        // swap left and right childs
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        helper(root.left);// recursive calls
        helper(root.right);// recursive calls
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        helper(root);// making the root
        return root;
    }
}
