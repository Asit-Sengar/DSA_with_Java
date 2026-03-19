class Solution {
    public boolean checkIfPangram(String sentence) {
        int arr[] = new int[26];
        for(int i=0;i<sentence.length();i++)
        {
            char c = sentence.charAt(i);
            arr[c-'a'] = arr[c-'a'] + 1;
        }
        for ( int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                return false;
            }
        }
        return true;
    }
}
