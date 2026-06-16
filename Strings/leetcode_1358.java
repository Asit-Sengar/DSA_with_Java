/* 
    String s = "aaacbabc"
    String s = "abcabc";
    when our windows becomes valid we will add the count of remaining windows
    then we will try to shrink the window to left;
*/
class Solution {
    public static int numberOfSubstrings(String s) {
        int answer = 0;
        int left = 0;
        int right = 0;
        int freq_arr[] = new int[3];
        while (right < s.length()) {
            freq_arr[s.charAt(right) - 'a']++;// updating the freq;
            if (freq_arr[0] > 0 && freq_arr[1] > 0 && freq_arr[2] > 0) {// here the window becomes valid;
                answer = answer + s.length() - right;// adding all the windows;
            }
            while (freq_arr[0] > 0 && freq_arr[1] > 0 && freq_arr[2] > 0) {
                freq_arr[s.charAt(left) - 'a']--;// shrinking the window from left;
                if (freq_arr[0] > 0 && freq_arr[1] > 0 && freq_arr[2] > 0) {
                    answer = answer + s.length() - right;
                }
                left++;
            }
            right++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int a = numberOfSubstrings("aaabc");
        System.out.println("the answer is: " + a);
    }
}