import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int answer = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int index1 = g.length - 1;
        int index2 = s.length - 1;
        while (index1 >= 0 && index2 >= 0) {
            if (s[index2] >= g[index1]) {
                answer = answer + 1;
                index1--;
                index2--;
            } else {
                index1--;
            }
        }
        return answer;
    }
}