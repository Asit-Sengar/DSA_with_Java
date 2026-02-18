class Solution {
    public int findLucky(int[] arr) {
        int temp[] = new int[501];
        for ( int i=0;i<arr.length;i++)
        {
            temp[arr[i]]++;
        }
        int answer=-1;
        for ( int i=0;i<temp.length;i++)
        {
            if(i==temp[i] && i!=0)
            {
                answer=temp[i];
            }
        }
        return answer;
    }
}
