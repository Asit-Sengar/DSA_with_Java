/*
    if i want to make a particular subarray equal i should convert length - max_freq elements
    i am updating the frequency of characters 
    and then calculating the max freq, no of operations required to flip are 
    windows length - max freq of characters
 */
class Solution {
    public static int characterReplacement(String s, int k) {
        int result = 0, left = 0, max_freq = 0;
        int arr[] = new int[26];
        for (int right = 0; right < s.length(); right++) {
            arr[s.charAt(right) - 'A']++;// updating the frequency;
            max_freq = Math.max(max_freq, arr[s.charAt(right) - 'A']);
            while ((right - left + 1) - max_freq > k) {
                arr[s.charAt(left) - 'A']--;
                left = left + 1;
            }
            result = Math.max(result, right - left + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 2;
        int a = characterReplacement(s, 1);
        System.out.println("the answer is: " + a);
    }
}