import java.util.Arrays;
class Solution
{
    public int function(int []arr, int noofballs , int force)
    {
        int lastball = arr[0];//we are placing the first ball at the first slot that is the lowest element in the array.
        int ballsplaced = 1;
        for ( int i =1; i<arr.length ; i++)
        {//this is for calculating how many balls can we place while considering a particular force.
            if( arr[i] - lastball>=force)
            {
                ballsplaced = ballsplaced + 1;
                lastball  = arr[i];
            }
            else
            {
                continue;//ignore the value if we cannot place.
            }
        }
        return ballsplaced;
    }
    public int maxDistance(int[] position, int balls)
    {//for finding the max value;
        Arrays.sort(position);
        int min = position[0];
        int max = position[position.length - 1];
        int answer = 0;
        int low =1;
        int high = max - min;
        while( low<=high)
        {
            int mid = low + ( high - low)/2;
            if( function( position , balls , mid)<balls)
            {
                high = mid - 1;//if a value is not possible means we cannot place greator than balls there is not sense of checking value
              //ahead of it so we bring high pointer to mid - 1;
            }
            else
            {
                answer = mid;
                low  = mid + 1;
            }
        }
        return answer;
    }
}
