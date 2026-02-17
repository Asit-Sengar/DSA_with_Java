class Solution {
    public int removeElement(int[] arr, int val) {
        int n = 0;
        int m = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[n] = arr[i];
                n = n + 1;
            }
        }
        m = n;
        for (int i = m; i < arr.length; i++) {
            arr[i] = 0;
        }
        return n;
    }
}