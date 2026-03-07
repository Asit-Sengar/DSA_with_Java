public class Solution {
    public static int[] twoSum(int[] numbers, int target)
    {
        int answer[] = new int[2];
        for ( int i=0;i<numbers.length;i++)
        {
            int left=0;
            int right = numbers.length-1;
            while(left<=right)
            {//binary search loop
                int mid = left + (right - left)/2;//mid calculation
                if(numbers[i] + numbers[mid]==target && i!=mid)
                {
                    answer[0] = Math.min(i+1,mid+1);
                    answer[1] = Math.max(i+1,mid+1);
                    break;
                }
                else if(numbers[i]+numbers[mid]>target)
                {
                    right= mid -1;
                }
                else
                {
                    left = mid + 1;
                }
            }
        }
        return answer;
    }
}
