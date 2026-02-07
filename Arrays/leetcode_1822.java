class Solution
{
    public int signFunc(int x)
    {
        return x;
    }
    public int arraySign(int[] nums) {
        int a =1;
        for ( int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                a = -a;
            }
            else if(nums[i]==0)
            {
                a =0;
                break;
            }
        }
        return signFunc(a);
    }
}
