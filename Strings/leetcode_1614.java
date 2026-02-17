class Solution
{
    public int maxDepth(String s)
    {
        int temp=0;
        int max=0;
        for ( int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='(')
            {
                temp = temp+1;
                if(temp>max)
                {
                    max=temp;
                }
            }
            else if(c==')')
            {
                temp = temp-1;
            }
        }
        return max;
    }
}
