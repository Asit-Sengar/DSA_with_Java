class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0; // for keeping track of positions of temp array to be filled
        int m = nums1.length;
        int n = nums2.length;
        int temp[] = new int[m + n];
        double median = 0; // we have to declare median as double because median can be in decimals too

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                temp[k] = nums1[i];
                i = i + 1;
                k = k + 1;
            } else {
                temp[k] = nums2[j];
                j = j + 1;
                k = k + 1;
            }
        }

        // this loop will be applicable when j pointer is completely exhausted and i is still left
        while (i < m) {
            temp[k] = nums1[i];
            i = i + 1;
            k = k + 1;
        }

        // same goes for j
        while (j < n) {
            temp[k] = nums2[j];
            j = j + 1;
            k = k + 1;
        }

        if (temp.length % 2 == 0) {
            median = (temp[temp.length / 2 - 1] + temp[temp.length / 2]) / 2.0;
        } else {
            median = temp[temp.length / 2];
        }

        return median;
    }
}
