import java.util.Arrays;

class Solution
{
    public int threeSumClosest(int[] arr, int target)
    {
        Arrays.sort( arr);
        int answer = 0;
        int closest = Integer.MAX_VALUE;
        for ( int i =0; i<arr.length - 2; i++)
        {
            int j = i + 1;
            int k = arr.length - 1;
            while( j<k)
            {
                int sum = arr[i] + arr[j] + arr[k];
                if( sum < target)
                {
                    int count = target - sum;
                    {
                        if( count < closest)
                        {
                            closest = count;
                           answer = sum;
                        }
                    }
                    j = j + 1;
                }
                else if( sum > target)
                {
                    int count = sum - target;
                    if( count < closest)
                    {
                        closest = count;
                        answer = sum;
                    }
                    k = k - 1;
                }
                else
                {
                    return sum ;
                }
            }
        }
        return answer;
    }
}
