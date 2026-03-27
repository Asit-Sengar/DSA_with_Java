class Solution {
    public int numberOfSpecialChars(String word) {
        char []arrsmall = new char[26];
        char []arrbig = new char[26];
        int count=0;
        for ( int i=0;i<word.length();i++)
        {
            char c= word.charAt(i);
            if(c>=97 && c<=122)//if it is small just add it
            {
                arrsmall[c-'a']++;
            }
            else
            {
                arrbig[c-'A']++;
            }
        }
        for ( int i=0;i<=25;i++)
        {
            if(arrsmall[i]!=0 && arrbig[i]!=0)
            {
                count++;
            }
        }
        return count;
    }
}
