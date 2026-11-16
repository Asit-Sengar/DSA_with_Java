class Solution {
    public void helper(int level, TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return;
        }
        if (level % 2 == 0)// if the level is odd
        {// now i have to swap the left and right values;
            int temp = left.val;
            left.val = right.val;
            right.val = temp;
        }
        helper(level + 1, left.left, right.right);
        helper(level + 1, left.right, right.left);
    }

    public TreeNode reverseOddLevels(TreeNode root) {
        int level = 0;
        helper(level, root.left, root.right);
        return root;
    }
}
