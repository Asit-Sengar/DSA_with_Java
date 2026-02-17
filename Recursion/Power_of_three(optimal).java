class Solution
{
    public boolean isPowerOfThree(int n)
    {//this condition becomes true only if n>0 and 1162261467 is 3^19 .it is highest power which fits inside int data type , if n % divides
      //completely it means it is a power of 3.
        return (n>0 && (1162261467 % n == 0));
    }
}
