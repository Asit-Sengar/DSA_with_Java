class Solution {
    public void sortColors(int[] arr) {
        int low = 0;
        int mid=0;
        int high = arr.length - 1;
        while( mid <= high)
        {
            if( arr[mid] == 0)
            {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low = low + 1;
                mid = mid + 1;
            }
            else if( arr[mid ] == 1)
            {
                mid = mid + 1;
            }
            else if( arr[mid ] == 2)
            {
                int temp = arr[mid] ;
                arr[mid ] = arr[high];
                arr[high] = temp;
                high = high - 1;
            }
        }
    }
}
