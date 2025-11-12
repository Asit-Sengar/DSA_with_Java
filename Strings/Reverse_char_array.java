class Solution {//this question is very simple , need no explanation.
    public void reverseString(char[] s) {
        int low = 0;
        int high = s.length-1;
        while( low<=high)
        {
            char a = s[low];
            s[low] = s[high];
            s[high] =  a;
            low = low+1;
            high = high -1;
        }
    }
}
