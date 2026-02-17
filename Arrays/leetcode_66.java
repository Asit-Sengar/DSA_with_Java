class Solution
{
    public int[] plusOne(int[] digits)
    {
        int count=0;
        for ( int i=0;i<digits.length;i++)
        {
            if(digits[i]==9)
            {
                count++;
            }
        }
        if(count==digits.length)
        {//in this case we declare a new array and start filling it;
            int temp[] = new int[digits.length+1];
            int j=digits.length;
            temp[0]=1;
            return temp;
        }
        else
        {
            int i=digits.length-1;
            while(i>=0)
            {
                if(digits[i]==9)
                {
                    digits[i]=0;
                }
                else
                {
                    digits[i] = digits[i]+1;
                    return digits;
                }
                i--;
            }
        }
        return digits;
    }
}
