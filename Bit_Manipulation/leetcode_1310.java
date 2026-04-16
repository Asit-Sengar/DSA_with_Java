//the main idea here is to create an prefix array
//now if have to find the xor of 2to 3 then i will do the xor of (0^1^2^3) ^ (0^1)
//this will give me the required result
class Solution {
    public static int[] xorQueries(int[] arr, int[][] queries) {
        int answer[] = new int[queries.length];
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {// for creation of prefix array
            prefix[i] = prefix[i - 1] ^ arr[i];
        }
        // now i have to iterate in queries array
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            if (left == 0) {
                answer[i] = prefix[right];
            } else {
                answer[i] = prefix[right] ^ prefix[left - 1];
            }
        }
        return answer;
    }
}
