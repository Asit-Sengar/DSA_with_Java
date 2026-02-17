//first i will calculate the freq array
//then i will take a window of length of  s1 and iterate in s2 with sliding window 
//if the freq array and temp is equal it means it contains the permutation
//lets make it again
public class Solution {
    public static boolean helper(int[] arr, int[] temp) {
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkInclusion(String s1, String s2) {
        int arr[] = new int[26];
        if (s1.length() > s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {// for creating the freq array;
            char c = s1.charAt(i);
            arr[c - 'a'] = arr[c - 'a'] + 1;
        }
        // now i will get a window of length of s1 and iterate over the s2;
        // each time after moivng and calculating i will loop in the array and temp
        // array looking for unequal element
        int i = 0;
        int temp[] = new int[26];
        while (i <= s2.length() - s1.length()) {
            int j = i + s1.length() - 1;
            char d = s2.charAt(j);
            if (i == 0) {
                for (int p = 0; p <= j; p++)
                {// creating the first window
                    char a = s2.charAt(p);
                    temp[a - 'a'] = temp[a - 'a'] + 1;
                    
                }
                if(helper(arr,temp))
                {
                    return true;
                }
            } else {// adding the j element and removing the i element;
                char c = s2.charAt(i-1);
                temp[c - 'a'] = temp[c - 'a'] - 1;
                temp[d - 'a'] = temp[d - 'a'] + 1;
                if (helper(temp, arr)) {
                    return true;
                }
            }
            i++;
        }
        return false;
    }
}
