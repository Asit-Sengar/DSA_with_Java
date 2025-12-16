class Solution
{
    public int maxArea(int[] height)
    {
        int max = 0;//for return answer.
        int low = 0;
        int high = height.length - 1;
        while(low<=high)
        {
            int length = Math.min(height[low],height[high]);//getting the minmum for length.
            int breadth = high - low;
            max = Math.max(max,length * breadth);
            if(height[low]<height[high])
            {//moving to the larger height to increase area
                low = low + 1;
            }
            else
            {
                high = high - 1;
            }
        }
        return max;
    }
}
