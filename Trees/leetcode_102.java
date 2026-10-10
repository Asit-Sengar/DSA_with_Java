
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;

class Solution {
    List<List<Integer>> answer = new ArrayList<>();// global variable

    public void helper(TreeNode root, int level) {
        if (root == null) {// base case;
            return;
        }
        if (level == answer.size()) {
            ArrayList<Integer> list = new ArrayList<>();// creating a new arraylis
            answer.add(list);
        }

        answer.get(level).add(root.val);

        helper(root.left, level + 1);// recursive steps
        helper(root.right, level + 1);// recursive steps
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        int level = 0;
        helper(root, level);
        return answer;
    }
}
