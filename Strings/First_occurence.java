class Solution
{
    public boolean helper(String a,String b, int p)
    {//for checking if the string is complete at i index
        int j=0;
        while(p<a.length()&&j<b.length())
        {
            if(a.charAt(p)!=b.charAt(j))
            {
                return false;
            }
            p=p+1;
            j=j+1;
        }
        return j==b.length();//if j==length of b then only return true;
    }
    public int strStr(String haystack, String needle)
    {
        int start = 0;
        int answer=-1;
        for ( int i=0;i<haystack.length();i++)
        {
            if(haystack.charAt(i)== needle.charAt(start))
            {//checking for matching of first character;
                if(helper(haystack,needle,i)==true)
                {
                    answer = i;
                    break;
                }
            }
        }
        return answer;
    }
}
