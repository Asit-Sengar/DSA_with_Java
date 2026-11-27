
//we could have used hashmap also
class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];

        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        int count = 0;
        boolean oddFound = false;

        for (int f : freq) {
            if (f % 2 == 0) {
                count += f;
            } else {
                count += f - 1;
                oddFound = true;
            }
        }

        if (oddFound) {
            count++;
        }

        return count;
    }
}
