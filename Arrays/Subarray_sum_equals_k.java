class Solution {
    public int subarraySum(int[] arr, int k)
    {
        int i=0;
        int count =0;
        while( i<arr.length)
        {
            int sum =0;
            int j =i;
            while( j< arr.length)
            {
                sum = sum + arr[j];
                if( sum == k)
                {
                    count = count + 1;
                    j = j + 1;
                }
                else
                {
                    j = j + 1;
                }
            }
            i= i + 1;
        }
        return count ;
    }
}
