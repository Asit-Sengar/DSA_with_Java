class Solution {
    TreeNode answer = null;//initialsing a global variable
    public void helper(TreeNode root , int val)
    {
        if(root == null)
        {//base case;
            return;
        }
        if(root.val == val)
        {//base case;
            answer = root;
            return;
        }
        helper(root.left , val);
        helper(root.right , val);
    }
   
    public TreeNode searchBST(TreeNode root, int val) {
        helper(root , val);
        return answer;
        // return null;
    }
}