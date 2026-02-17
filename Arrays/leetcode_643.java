class Solution
{
    public double findMaxAverage(int[] nums, int k)
    {
        int left =1;
        double sum=nums[0];
        for ( int i=1;i<=k-1;i++)
        {//calculating the first avg
            sum = sum + nums[i];
        }
        double avg = sum/k;//we have to declare it double not to loose precision of digits
        double answer = avg;//same goes here
        while(left<=nums.length-k)
        {//looping through the array with window of sixe k;
            avg = avg - (double)nums[left-1]/k;//converting it to double otherwise it would be integer divison
            avg = avg + (double)nums[left + k - 1]/k;
            answer = Math.max(answer, avg);
            left++;
        }
        return answer;
    }
}
