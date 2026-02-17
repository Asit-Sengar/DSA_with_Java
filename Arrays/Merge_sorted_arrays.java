//here we will start from ending of both the arrays so that we can the element at the last and then decrement both the 
//pointers 
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;//index for filling the last elements of nums1 which contains 0.
        while( i>=0 && j>= 0)
        {
            if( nums1[i]<nums2[j])
            {
                nums1[k] = nums2[j];
                j-- ;
            }
            else
            {
                nums1[k] = nums1[i];
                i--;
                
            }
            k--;
        }  
        while( j>=0)//if nums2 has some remaining elements then , they are all in sorted order.
        {
            nums1[k] = nums2[j];
            k--;j--;
        }
    }
}
