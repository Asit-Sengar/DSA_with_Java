import java.util.ArrayList;

class Solution {
    ArrayList<Integer> list = new ArrayList<>();// global variable

    public void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        helper(root.left);// recursive call for left node
        list.add(root.val);
        helper(root.right);// recursive call for right node
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        helper(root);
        return list;
    }
}
