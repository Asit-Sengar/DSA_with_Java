class Solution
{
    public boolean areNumbersAscending(String s)
    {
        int i=0;
        int max = Integer.MIN_VALUE;
        while(i<s.length())
        {//if we found any digit;
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {//looping until we find numbers
                int temp=0;
                while(i<s.length() && (s.charAt(i)>='0' && s.charAt(i)<='9'))
                {
                    temp = temp * 10 + s.charAt(i);
                    i++;
                }
                if(temp<=max)
                {
                    return false;
                }
                else
                {
                    max = temp;
                }
            }
            i++;
        }
        return true;
    }
}
