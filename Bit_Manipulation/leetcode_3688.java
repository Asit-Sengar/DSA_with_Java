class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int answer = 0;
        for ( int i=0;i<nums.length;i++)
        {
            if((nums[i]&1)==0)//condition for checing if it is even or not;
            {
                answer = answer| nums[i];
            }
        }
        return answer;
    }
}
