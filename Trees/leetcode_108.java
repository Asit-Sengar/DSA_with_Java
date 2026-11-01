class Solution {
    public TreeNode helper_left(int[] nums, int start, int end) {
        if (start > end) {// base case
            return null;
        }
        int mid = start + (end - start) / 2;

        TreeNode root = new TreeNode(nums[mid]);// creating the root node;

        root.left = helper_left(nums, start, mid - 1);
        root.right = helper_right(nums, mid + 1, end);

        return root;
    }

    public TreeNode helper_right(int[] nums, int start, int end) {
        if (start > end) {// base case
            return null;
        }
        int mid = start + (end - start) / 2;

        TreeNode root = new TreeNode(nums[mid]);// creating the root node;

        root.left = helper_left(nums, start, mid - 1);
        root.right = helper_right(nums, mid + 1, end);

        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        int mid = nums.length / 2;
        TreeNode root = new TreeNode(nums[nums.length / 2]);
        root.left = helper_left(nums, 0, mid - 1);
        root.right = helper_right(nums, mid + 1, nums.length - 1);
        return root;
    }
}
