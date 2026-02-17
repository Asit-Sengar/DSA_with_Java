// Use Binary Search with Pair Pattern Observation
// Every element appears exactly twice except one element which appears only once.
class Solution
{
    public int singleNonDuplicate(int[] nums)
    {
        // If there is only one element
        if (nums.length == 1)
        {
            return nums[0];
        }
        if (nums[0] != nums[1])
        {
            return nums[0];
        }
        if (nums[nums.length - 1] != nums[nums.length - 2])
        {
            return nums[nums.length - 1];
        }
        //we are modifying the low and high pointers because we excluded the first and last element in special cases.
        // because we already checked boundary elements
        int low = 1;
        int high = nums.length - 2;

        while (low <= high)
        {
            int mid = low + (high - low) / 2;

            // mid element will be the answer if it will be different from both its neighbors
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1])
            {
                return nums[mid];
            }
            /* 
               Before the single element:
                   pairs look like (0,1), (2,3), (4,5) → even index first
               After the single element:
                   pairs look like (1,2), (3,4), (5,6) → odd index first
               
               So:
               → if mid is even and nums[mid] == nums[mid+1], OR
                 mid is odd and nums[mid] == nums[mid-1],
                 then we are still in the LEFT half where pattern is correct.
                 (So move to the right half)
            */
            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) ||
                (mid % 2 == 1 && nums[mid] == nums[mid - 1]))
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return -1;
    }
}
