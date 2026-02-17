import java.util.HashSet;
import java.util.Set;
class Solution
{
    public boolean containsDuplicate(int[] nums)
    {//simple program to check whether it contains duplicates or not
        HashSet<Integer> set = new HashSet<>();
        boolean ispresent = false;
        for( int a :nums)
        {
            if(!set.add(a))
            {//it checks if we can add the element or not, if we cannot it means it is already
            //present then make the flag true and break other wise add the element.
                ispresent = true;
                break;
            }
        }
        return ispresent;
    }
}
