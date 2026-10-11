class Solution {
    List<List<Integer>>answer = new ArrayList<>();//global variable
    public void helper(TreeNode root , int level)
    {
        if(root == null)
        {//base case;
            return;
        }
        if(level == answer.size())
        {
            ArrayList<Integer>list = new ArrayList<>();//creating a new arraylis
            answer.add(list);
        }

        answer.get(level).add(root.val);

        helper(root.left, level + 1);//recursive steps
        helper(root.right , level + 1);//recursive steps
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        int level = 0;
        helper(root , level);
        List<List<Integer>>temp = new ArrayList<>();
        int i = answer.size() - 1;
        while(i>=0)
        {
            temp.add(answer.get(i));
            i--;
        }
        return temp;
    }
}
