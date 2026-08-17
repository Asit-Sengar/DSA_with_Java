/*
    in this method we are analysing the slope of array
    if the slope just add the sum increased by 1 to the original sum
    if the slope is decreasing then keep the down pointer and add to the sum increasing it by 1 
    every time
 */
class Solution {
    public static int helper(int[] ratings) {
        int answer = 1;
        int i = 1;
        while (i < ratings.length) {
            while (ratings[i] == ratings[i - 1]) {
                answer = answer + 1;
                i++;
            }
            int peak = 1;
            while (i < ratings.length && ratings[i] > ratings[i - 1]) {
                peak += 1;
                answer += peak;
                i++;
            }
            int down = 1;
            while (i < ratings.length && ratings[i] < ratings[i - 1]) {
                answer = answer + down;
                down++;
                i++;
            }
            if (down > peak) {
                answer = answer + (down - peak);
            }
        }
        return answer;
    }

    public int candy(int[] ratings) {
        return helper(ratings);
    }
}