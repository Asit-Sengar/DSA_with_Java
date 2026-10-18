
/*
    this is just the preorder traversal
 */
import java.util.ArrayList;

class Solution {
    public void helper(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {// base case
            return;
        }
        list.add(root.val);
        helper(root.left, list);
        helper(root.right, list);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }
}
