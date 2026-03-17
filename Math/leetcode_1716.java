class Solution {
    public int totalMoney(int n) {
        int weeks = n / 7;
        int count = 28;
        int sum = 0;
        for (int i = 1; i <= weeks; i++) {
            count = 28 + 7 * (i - 1);
            sum = sum + count;
        }
        int remaningdays = n - weeks * 7;
        int count1 = weeks;
        for (int i = 1; i <= remaningdays; i++) {
            count1 = count1 + 1;
            sum = sum + count1;
        }
        return sum;
    }
}
