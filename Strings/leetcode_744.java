class Solution {
    public  char nextGreatestLetter(char[] letters, char target) {
        char answer = letters[0];
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) {
                answer = letters[i];
                break;
            }
        }
        return answer;
    }
}
