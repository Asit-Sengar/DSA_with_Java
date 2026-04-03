class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isMonotoneIncreasing = true;
        boolean isMonotoneDecreasing = true;
        for ( int i=0;i+1<nums.length;i++)
        {//here i am checking for monotonic increasing;
            if(nums[i+1]<nums[i])
            {
                isMonotoneIncreasing = false;
                break;
            }
        }
        for ( int i=0;i+1<nums.length;i++)
        {//here i am checking for monotonic decreasing;
            if(nums[i+1]>nums[i])
            {
                isMonotoneDecreasing = false;
                break;
            }
        }
        if(isMonotoneIncreasing || isMonotoneDecreasing)
        {//if either one of them is correct then return true , false otherwise;
            return true;
        }
        return false;
    }
}
