class Solution
{
    public char findTheDifference(String s, String t)
    {
        int xor =0;
        for ( int i=0;i<s.length() ;i++)
        {
            xor = xor^s.charAt(i);
            xor = xor^t.charAt(i);
        }
        xor = xor ^ t.charAt(s.length());
        return (char)xor;
    }
}
