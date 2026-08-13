class Solution {
    public int maxPower(String s) {
        int answer = 0;
        int left = 0;
        int right = 0;
        while (right < s.length() && left <= right) {
            int length = 0;
            char c = s.charAt(left);
            while (right < s.length() && s.charAt(right) == c) {
                length = length + 1;
                right++;
            }
            answer = Math.max(answer, length);
            left = right;
        }
        return answer;
    }

    // public static void main(String[] args) {
    // String s = "abbcccddddeeeeedcba";
    // int answer = maxPower(s);
    // System.out.println(answer);
    // }
}