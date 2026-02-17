import java.util.HashMap;
class Solution {
    public int subarraySum(int[] arr, int k)
    {
        int prefix []= new int[arr.length];
        int count =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put( 0,1);
        for ( int i =0; i<arr.length;i++)
        {
            if( i ==0)
            {
                prefix[i] = arr[i];
            }
            else
            {
                int a = prefix[i-1];
                prefix[i] = a + arr[i];
            }
        }
        for ( int i =0; i< prefix.length ; i++)
        {
            if( map.containsKey( prefix[i] - k))
            {
                count = count + map.get( prefix[i] - k);
            }
            map.put( prefix[i] , map.getOrDefault(prefix[i], 0 )+ 1 );
        }
        return count;
    }
}
