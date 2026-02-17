/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n)
    {
        int low =1;
        int high = n;
        int answer=-1;
        while(low<=high)
        {
            int mid = low  + (high- low)/2;
            int c = guess(mid);//here we will call guess function every time with argument mid;
            if(c==1)
            {
                low = mid + 1;
            }
            else if(c==-1)
            {
                high = mid -1;
            }
            else if(c==0)
            {
                answer = mid;
                break;
            }
        }
        return answer;
    }
}
