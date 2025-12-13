class Solution
{
    public boolean isPowerOfTwo(int n)
    {
        return (n>0 && (n&(n-1))==0);//this condition checks for n>0 and bit manipulation simultaneously
    }
}
