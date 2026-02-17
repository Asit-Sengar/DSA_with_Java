import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
class Solution
{
    public List<Integer> majorityElement( int arr[])
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for ( int i =0; i< arr.length ; i++)
        {
            if( map.containsKey( arr[i]))
            {
                map.put( arr[i], map.get( arr[i]) + 1);
            }
            else
            {
                map.put( arr[i], 1);
            }
        }
        for ( int element : map.keySet())
        {
            if( map.get( element)> arr.length / 3)
            {
                list.add( element);
            }
        }
        return list;
    }
}
