import java.util.HashSet;
class Solution {
    public int sumCounts(List<Integer> nums) {
        int answer = 0;
        for(int i = 0;i<nums.size() ; i++)
        {
            HashSet<Integer>set = new HashSet<>();
            for(int j = i;j<nums.size();j++)
            {
                set.add(nums.get(j));
                int unique_values = set.size() * set.size();
                answer = answer + unique_values;
            }
        }
        return answer;
    }
}
