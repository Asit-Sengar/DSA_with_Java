class Solution {
    public static int[] countBits(int n) {
        int arr[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {// now i have to calculate number of 1 bits every time;
            int count = 0;
            int temp = i;
            while (temp > 0) {
                if ((temp & 1) == 1) {
                    count++;
                }
                    temp = temp >> 1;
                arr[i] = count;
            }
        }
        return arr;
    }
    // public static void main(String[] args) {
    //     int arr[] = countBits(5);
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.println(arr[i]);
    //     }
    // }
}
