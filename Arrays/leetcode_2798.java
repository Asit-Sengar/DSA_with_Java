class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int answer=0;
        for(int i=0;i<hours.length;i++)
        {
            if(hours[i]>=target)
            {
                answer++;
            }
        }
        return answer;
    }
}
