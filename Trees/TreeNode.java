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
        if (level % 2 == 0 && root.left != null && root.right != null)// if the level is odd
        {// now i have to swap the left and right values;
            int temp = root.left.val;
            root.left.val = root.right.val;
            root.right.val = temp;
        }
        helper(root.left, level + 1);
        helper(root.right, level + 1);
    }

    public TreeNode reverseOddLevels(TreeNode root) {
        int level = 0;
        helper(root, level);
        return root;
    }
}
