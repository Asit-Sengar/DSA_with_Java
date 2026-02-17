class Solution {
    public int[] searchRange(int[] nums, int target)
    {
        int result[] = new int[2];
        int lb = lowerBound( nums, target);
        int ub = upperBound( nums, target);
        if( lb == nums.length || nums[lb]!= target)
        {
            result[0]=-1;
            result[1]=-1;
            return result;
        }
        result[0] = lb;
        result[1] = ub - 1;
        return result;
    }
    public static int lowerBound(int []nums, int target )
    {
        int low = 0;
        int high = nums.length - 1 ;
        int answer = nums.length ;
        while( low <= high)
        {
            int mid = low + ( high - low)/2;
            if( nums[mid]>=  target)
            {
                answer = mid;
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return answer;
    }
    public static int upperBound(int []nums, int target )
    {
        int low = 0;
        int high = nums.length  - 1;
        int answer = nums.length ;
        while( low <= high)
        {
            int mid = low + ( high - low)/2;
            if( nums[mid]> target)
            {
                answer = mid;
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return answer;
    }
}
