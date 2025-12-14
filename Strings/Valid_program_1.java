class Solution
{
    public boolean isPalindrome(String s)
    {
        int low =0;
        int high = s.length()-1;
        while(low<=high)
        {
            if(!Character.isLetterOrDigit(s.charAt(low)))
            {//this condition checks for the character to be a letter or digit
                low = low + 1;
            }
            else if(!Character.isLetterOrDigit(s.charAt(high)))
            {//this condition checks for the character to be a letter or digit
                high = high - 1;
            }
            else if(Character.toLowerCase(s.charAt(low))!= Character.toLowerCase(s.charAt(high)))
            {//after converting it to lower case we will check for their equaltiy
                return false;
            }
            else
            {//increasing low pointer and decreasing high pointer.
                low = low + 1;
                high = high -1;
            }
        }
        return true;
    }
}
