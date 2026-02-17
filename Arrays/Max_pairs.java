import java.util.HashMap;
class Solution
{
    public int[] numberOfPairs(int[] nums)
    {
        HashMap<Integer,Integer> map = new HashMap<>();//declaring hashmap for fast lookups;
        int arr[] = new int[2];
        for ( int i=0;i<nums.length;i++)
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
        int temp1 =0;//for how many pairs we encountered.
        int temp2 =0;//for how many single numbers we encountered.
        for ( int a : map.keySet())
        {//iterating through the map
            int b = map.get(a);
            if(b%2==0)
            {//if the element is divisible then it means it consists of pairs only 
                temp1 = temp1 + b/2;
            }
            else
            {
                temp1 = temp1 + b/2;//extracting number of pairs from the element
                temp2 = temp2 +  1;//only 1 will be left
            }
        }
        arr[0] = temp1;
        arr[1] = temp2;
        return arr;
    }
}
