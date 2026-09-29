
/*
    the main idea here is that we will make a hashmap for string t
    now i shall try to maintain a window and expand it untill it includes all the 
    characters.
    now i will try to shrink the window untill it contains all the characters
    update the start index
    make a string from start to start +  length and return it. 
*/
import java.util.HashMap;

class Solution {
    public static boolean contains(HashMap<Character, Integer> maps, HashMap<Character, Integer> mapt) {
        // this functin is for comparing two hashmaps
        for (Character c : mapt.keySet()) {
            if (!maps.containsKey(c) || maps.get(c) < mapt.get(c)) {
                return false;
            }
        }
        return true;
    }

    public static String helper(String s, String t) {
        HashMap<Character, Integer> maps = new HashMap<>();
        HashMap<Character, Integer> mapt = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {// this is for making the map for t;
            if (mapt.containsKey(t.charAt(i))) {
                mapt.put(t.charAt(i), mapt.get(t.charAt(i)) + 1);
            } else {
                mapt.put(t.charAt(i), 1);
            }
        }
        int left = 0;
        int answer = Integer.MAX_VALUE;
        int start = -1;
        for (int right = 0; right < s.length(); right++) {
            if (maps.containsKey(s.charAt(right))) {
                maps.put(s.charAt(right), maps.get(s.charAt(right)) + 1);
            } else {
                maps.put(s.charAt(right), 1);
            }
            while (contains(maps, mapt)) {// now we will try to shrink the window
                if (right - left + 1 < answer) {
                    answer = right - left + 1;
                    start = left;
                }
                maps.put(s.charAt(left), maps.get(s.charAt(left)) - 1);
                left++;
            }
        }
        if (start == -1)// it means we havent started
        {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < start + answer; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public String minWindow(String s, String t) {
        return helper(s, t);
    }
}