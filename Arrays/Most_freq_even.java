import java.util.HashMap;
class Solution
{
    public int mostFrequentEven(int[] nums)
    {//hashmap for storing elements and their freq
        HashMap<Integer,Integer> map = new HashMap<>();
        for ( int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                if(map.containsKey(nums[i]))
                {
                    map.put(nums[i],map.get(nums[i])+1);
                }
                else
                {
                    map.put(nums[i],1);
                }
            }
        }
        int answer=-1;
        int freq=0;
        for ( int a :map.keySet())
        {//iterating through the hashmap for answer
            if(map.get(a)>freq)
            {
                answer = a;
                freq=map.get(a);
            }
            if(map.get(a)==freq && a<answer)
            {
                answer = a;
            }
        }
        return answer;
    }
}
