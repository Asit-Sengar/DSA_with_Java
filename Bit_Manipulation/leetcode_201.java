class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int low = left ;
        int high = right;
        int shift = 0;
        while(low<high)
        {
            low = low>>1;
            high = high>>1;
            shift++;
        }
        return low<<shift;
    }
}
