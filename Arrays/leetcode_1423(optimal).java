class Solution {
    public static int maxScore(int[] cardPoints, int k) {
        int left_sum = 0;
        int right_sum = 0;
        int max_sum = 0;
        int right = cardPoints.length - 1;
        for (int i = 0; i < k; i++) {
            // for calculating the left window sum;
            left_sum = left_sum + cardPoints[i];
        }
        max_sum = left_sum;
        for (int i = k - 1; i >= 0; i--) {
            left_sum = left_sum - cardPoints[i];
            right_sum = right_sum + cardPoints[right];
            right--;
            max_sum = Math.max(max_sum, left_sum + right_sum);
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 1 };
        int k = 3;
        int answer = maxScore(arr, k);
        System.out.println(answer);
    }
}