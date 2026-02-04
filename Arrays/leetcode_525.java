//the main idea here is the sum which we just encountered if the map contains it already than the array between those
//indeces have sum 0
//means equal 0 and equal 1;
import java.util.HashMap;

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int answer =0;
        for ( int i =0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                sum = sum -1;
            }
            else
            {
                sum = sum + 1;
            }
            if(map.containsKey(sum))
            {
                int c = map.get(sum);
                answer = Math.max(answer,i - c);
            }
            else
            {
                map.put(sum, i);
            }
        }
        return answer;
        
    }
}
