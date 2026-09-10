class Solution {

    public int maxNumberOfBalloons(String text) {
        int temp[] = new int[26];
        int answer = 0;
        for (int i = 0; i < text.length(); i++) {
            temp[text.charAt(i) - 'a']++;
        }
        while (temp[0] >= 1 && temp[1] >= 1 && temp[11] >= 2 && temp[14] >= 2 && temp[13] >= 1) {
            answer = answer + 1;
            temp[0]--;
            temp[1]--;
            temp[11] = temp[11] - 2;
            temp[14] = temp[14] - 2;
            temp[13]--;
        }
        return answer;
    }
}