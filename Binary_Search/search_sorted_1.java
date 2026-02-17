//the main essence of binary search lies in eliminating the left or right half according to requirement , so in this we would check if left 
//half is sorted or the right half. only one half will be sorted thats for sure.
//if left half is sorted , we will check if element lies in it or not and if does lies in it then we will do high = mid - 1 otherwise 
//low = mid + 1;
//same for right half , hence it will be solved in O(n).
class Solution {
    public int search(int[] nums, int target)
    {
        int low = 0;
        int high = nums.length - 1;
        while( low<= high)
        {
            int mid = low + ( high - low)/2;
            if( nums[mid] == target)
            {
                return mid;
            }
            if( nums[low]<= nums[mid])
            {
                if( nums[low]<= target && target <= nums[mid])
                {
                    high = mid - 1;
                }
                else
                {
                    low = mid + 1;
                }
            }
            else
            {
                if( nums[mid]<= target && target<= nums[high])
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
