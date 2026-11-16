//Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public void helper(TreeNode root, int level) {
        if (root == null) {
            return;
        }

    }

    public TreeNode reverseOddLevels(TreeNode root) {
        int level = 0;
        helper(root, level);
        return root;
    }
}