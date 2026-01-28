import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> temp= new HashSet<>();
        for ( int i =0;i<nums1.length;i++)
        {
            set.add(nums1[i]);
        }
        for ( int j=0;j<nums2.length;j++)
        {
            if(set.contains(nums2[j]))
            {
                temp.add(nums2[j]);
            }
        }
        int answer[] = new int[temp.size()];
        int p=0;
        for ( int a:temp)
        {
            answer[p++] = a;
        }
        return answer;
    }
}
