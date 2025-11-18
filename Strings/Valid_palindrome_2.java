class Solution
{
    public boolean helper(String p , int low,int high)
    {//just a helper function to check for palindrome
        boolean temp3 = true;
        while(low<=high)
        {
            if(p.charAt(low)!=p.charAt(high))
            {
                temp3 = false;
                break;
            }
            low = low+1;
            high = high -1;
        }
        return temp3;
    }
    public boolean validPalindrome(String s)
    {
        int low = 0;
        int high = s.length()-1;
        boolean ispalindrome = false;
        if(s.length()==1)
        {
            return true;
        }
        while(low<=high)
        {//if we encounter the first mismatch then we will break the loop and use helper function..
            if(s.charAt(low)!=s.charAt(high))
            {
                break;
            }
            else
            {
                low=low+1;
                high = high-1;
            }
        }
        if(low>high)
        {//this condition will be applicable when we do not encounter any mismatch.
            return true;
        }
        boolean temp1= helper(s,low+1,high);//calling helper function and storing its value;
        boolean temp2 = helper(s,low,high-1);//calling helper function and storing its value;
        if(temp1==true || temp2==true)
        {
            ispalindrome = true;//if any of the condition is true then return true;
        }
        return ispalindrome;
    }
}
