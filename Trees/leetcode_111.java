class Solution {
    int answer = 100000;// global variable

    public void helper(TreeNode root, int nodes) {
        if (root == null) {// base case;
            return;
        }
        if (root.left == null && root.right == null) {// we found the lead node
            answer = Math.min(answer, nodes);
            return;
        }
        helper(root.left, nodes + 1);
        helper(root.right, nodes + 1);
    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        helper(root, 1);
        return answer;
    }
}
