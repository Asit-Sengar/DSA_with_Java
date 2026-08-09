class Solution {
    public int product(int num) {
        int answer = 1;
        int temp = num;
        while (temp > 0) {
            answer = answer * (temp % 10);
            temp = temp / 10;
        }
        return answer;
    }

    public int smallestNumber(int n, int t) {
        int answer = 0;
        for (int i = n; i <= 100; i++) {
            if (product(i) % t == 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}