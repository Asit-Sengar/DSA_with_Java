class Solution {
    public static char repeatedCharacter(String s) {
        char arr[] = new char[26];
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (arr[c - 'a'] == 0) {
                arr[c - 'a']++;
            } else {
                index = i;
                break;
            }
        }
        return s.charAt(index);
    }

    // public static void main(String[] args) {
    //     String s = "abcdd";
    //     char a = repeatedCharacter(s);
    //     System.out.println(a);
    // }
}
