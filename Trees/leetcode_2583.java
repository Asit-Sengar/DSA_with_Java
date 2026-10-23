
//first we will prepare the list according to level sum
//make an array from the list elements
//sort the array
//return the arr[arr.length - k] element
import java.util.ArrayList;

class Solution {
    ArrayList<Long> list = new ArrayList<>();

    public void helper(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level == list.size()) {// it means the level does not exist in the list
            list.add((long) root.val);
        } else {
            list.set(level, list.get(level) + root.val);
        }
        helper(root.left, level + 1);
        helper(root.right, level + 1);
    }

    public long kthLargestLevelSum(TreeNode root, int k) {
        int level = 0;
        helper(root, level);// this shall modify the list
        if (list.size() < k) {
            return -1;
        }
        long temp[] = new long[list.size()];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = list.get(i);
        }
        Arrays.sort(temp);
        return temp[temp.length - k];
    }
}