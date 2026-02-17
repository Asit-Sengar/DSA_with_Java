class Solution
{
    public int peakIndexInMountainArray(int[] arr)
    {//so we will here use binary search to make the time complexity O(log N).
        int answer =-1;//variable to store peak index.
        int low = 0;
        int high = arr.length-1;
        while(low<=high)
        {
            int mid = (low + high)/2;
            if(arr[mid]<arr[mid+1])
            {//if we found that arr[mid]<arr[mid+1] then we will store mid +1 index into answer 
            //because mid can not be our answer.
                low= mid + 1;
                answer = mid + 1;
            }
            else
            {
                high = mid-1;//moving high pointer.
            }
        }
        return answer;
    }
}
