class Solution
{
    int temp[] = new int[4];
    public int[] helper(int digit, int a)
    {
        if(digit<10)
        {//base case for recursion.
            temp[a] = digit;
            return temp;
        }
        temp[a] = digit%10;
        return helper(digit/10,a-1);
    }
    public int maximum69Number (int num)
    {
        helper(num,3);
        int sum=0;
        for ( int i=0;i<temp.length;i++)
        {
            if(temp[i]==6)
            {
                temp[i]=9;
                break;//break the loop if we found the number;
            }
        }
        int p =1;
        for ( int i=0;i<temp.length;i++)
        {
            sum   = sum*10 + temp[i];
        }
        return sum;
    }
}
