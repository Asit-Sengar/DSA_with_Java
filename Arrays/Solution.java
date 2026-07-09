class Solution {
    public static int maxScore(int[] cardPoints, int k) {
        int answer = 0;
        int total = k;
        int numbers = total;
        while (numbers >= 0) {
            int sum_left = 0;
            int sum_right = 0;
            int left = numbers;
            int right = total - numbers;
            for (int i = 0; i < left; i++) {
                sum_left = sum_left + cardPoints[i];
            }
            for (int i = 0; i < right; i++) {
                sum_right = sum_right + cardPoints[cardPoints.length - i - 1];
            }
            answer = Math.max(answer, sum_left + sum_right);
            numbers--;
        }
        return answer;

    }

    public static void main(String[] args) {
        int arr[] = { 9, 7, 7, 9, 7, 7, 9 };
        int k = 7;
        int answer = maxScore(arr, k);
        System.out.println(answer);

    }
}