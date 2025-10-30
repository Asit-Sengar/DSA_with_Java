class Solution
{
    public int function(int []arr, int pages)
    {//this is for calculating no of students.
        int student = 1;
        int currentpages = 0;
        for( int i=0;i<arr.length ; i++)
        {
            if( currentpages + arr[i]<=pages)
            {
                currentpages = currentpages + arr[i];
            }
            else
            {
                student = student + 1;
                currentpages= arr[i];
            }
        }
        return student;
    }
    public int findPages(int[] nums, int students)
    {
        if( students>nums.length)
        {
            return -1;
        }
        int answer = -1;//if the allocation of books is not possible then return -1;
        int max = Integer.MIN_VALUE;
        int total = 0;//total of whole array.
        for ( int i=0;i<nums.length ; i++)
        {//finding max and total value of the array.
            if( nums[i]>max)
            {
                max = nums[i];
            }
            total = total + nums[i];
        }
        int low = max;
        int high = total;
        while( low<=high)//applying binary search instead of a for loop becuse it would increae the time complexity.
        {
            int mid = low + (high - low)/2;
            if( function( nums, mid)<=students)//if no of students are less than the students given it means it can be my answer
              //but we have to find the minimum value.
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
