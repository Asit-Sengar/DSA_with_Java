class Solution
{
    public double myPow(double x, int n)
    {
        if(n==0)
        {//base case of recursion
            return 1;
        }
        if(n<0)
        {
            x=1/x;//flipping the integer if power is negative
            if(n==Integer.MIN_VALUE)
            {//this case is mandatory so that value does not overflow from the integer range
                return x*myPow(x,Integer.MAX_VALUE);
            }
            n=-n;
        }
        if(n%2==0)
        {//optimising it to reduce recursive calls
            double temp = myPow(x,n/2);
            return temp*temp;
        }
        else
        {
            return x* myPow(x,n-1);
        }
    }
}
