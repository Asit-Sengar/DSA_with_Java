class Solution
{
    public String longestCommonPrefix(String[] strs)
    {
        int p=0;
        StringBuilder sb = new StringBuilder();
        boolean ispresent = true;
        int q=0;
        //this loop is for iterating in first string
        if(strs.length==0)
        {
            return "";
        }
        for ( int i=0;i<strs[0].length();i++)
        {//here we are iterating in the first string
            char c = strs[0].charAt(p++);
            {
                for ( int j=0;j<strs.length;j++)
                {//now we are checking in every string at index i;
                    if(strs[j].length()<=i || strs[j].charAt(i)!=c)
                    {//now if we found a case when string length is more than i then it is a return case;
                        return sb.toString();
                    }
                }
                sb.append(c);
            }
        }
        return sb.toString();   
    }
}
