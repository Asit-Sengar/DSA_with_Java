class Solution {
    // We will use the inword logic to reverse each word at its place 
    public void helper(String sb1, StringBuilder sb2, int a, int b) {
        // This is a helper function which appends the reversed word in the stringbuilder.
        for (int j = a; j >= b; j--) {
            sb2.append(sb1.charAt(j));
        }
        return;
    }
    
    public String reverseWords(String s) {
        boolean inword = false;
        int start = 0;
        int end = 0;
        StringBuilder temp = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c != ' ' && !inword) {
                // This shows that the word has started.
                end = i;
                inword = true;
            } else if (c != ' ' && inword) {
                // This shows that the word is going on.
                continue;
            } else if (c == ' ' && inword) {
                // This shows that the word has ended so we should apply helper function.
                start = i - 1;
                helper(s, temp, start, end);
                temp.append(' ');
                inword = false; // Most importantly we should make inword false.
            }
        }
        
        if (inword) {
            // This is for the last word, if string ends with space then there is no problem
            // (we will apply the helper function) but if it doesn't end at space then we will 
            // check if after the loop inword is true. If inword is true then we will apply 
            // helper function here too
            helper(s, temp, s.length() - 1, end);
        }
        
        return temp.toString();
    }
} // This is the code I want to upload to my github repo, tell me is there any amendments to make.
