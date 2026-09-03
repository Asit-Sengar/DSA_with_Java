class Solution {
    // i will use recursion for this
    public static int helper(int temp[]) {
        if (temp.length == 1) {
            return temp[0];// base case;
        } else {
            int temp1[] = new int[temp.length - 1];
            for (int i = 0; i < temp.length - 1; i++) {
                temp1[i] = (temp[i] + temp[i + 1]) % 10;
            }
            return helper(temp1);
        }
    }

    public int triangularSum(int[] nums) {
        return helper(nums);

    }
    // public static void main(String[] args) {
    // int arr[] = { 1, 2, 3, 4, 5 };
    // int a = helper(arr);
    // System.out.println("the answer is : " + a);
    // }
}