//lower bound is arr[mid] >= target;
class Main
{
    public static int lowerBound( int []arr, int target)
    {
        int low =0;
        int high = arr.length - 1; 
        int answer = arr.length;
        while( low <=high)
        {
            int mid = low + ( high - low )/2;//to avoid overflow in integer data type.
            if( arr[mid]>= target)
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
