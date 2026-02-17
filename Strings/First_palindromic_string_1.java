class Solution
{
    public boolean isString(String a)
    {//a simple function just to chech whether given string is palindrome or not;
        int low =0;
        int high = a.length()-1;
        while(low<=high)
        {
            if(a.charAt(low)!=a.charAt(high))
            {
                return false;//if the characters are not equal just return false;
            }
            low = low+1;
            high=high - 1;
        }
        return true;
    }
    public String firstPalindrome(String[] words)
    {
        String answer = "";//to return if we cant find palndromic string.
        for( int i=0;i<words.length;i++)
        {
            if(isString(words[i])==true)
            {
                return words[i];//returning the string.
            }
        }    
        return answer;   
    }
}
