//i have to pick p and q and m  as pivots
class Solution {
    public boolean isTrionic(int[] nums) {
        int i=0;
        int p=-1;
        int q=-1;
        int m=-1;
        int last = -2000;
        while(i<nums.length && nums[i]>last)
        {
            last = nums[i];
            p=i;
            i++;
        }
        while(i<nums.length && nums[i]<last)
        {
            last = nums[i];
            q = i;
            i++;
        }
        while(i<nums.length && nums[i]>last)
        {
            last = nums[i];
            m=i;
            i++;
        }
        if(p==-1 || q==-1 || p==0 || q==nums.length-1 || m!=nums.length-1)
        {
            return false;
        }
        return true;
    }
}
