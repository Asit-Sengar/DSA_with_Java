import java.util.ArrayList;
import java.util.List;
class Solution
{
    public List<Integer> findDuplicates(int[] nums)
    {
        List<Integer> list = new ArrayList<>();
        for ( int i=0;i<nums.length;i++)
        {//this loop is for marking the elements negative
            int p=Math.abs(nums[i]);
            if(nums[p-1]<0)
            {//if the element is already negataive it means we have vistied that element before
                list.add(p);
            }
            else
            {//otherwise make it negative
                nums[p-1]= nums[p-1]*-1;
            }
        }
        return list;
    }
}
