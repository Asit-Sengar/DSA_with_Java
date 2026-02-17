import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

class Solution {
    public static String frequencySort(String s)
    {//creating a hashmap
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<Character>[] bucket = new ArrayList[s.length() + 1];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for (char c : map.keySet()) {
            int freq = map.get(c);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(c);//adding characters to bucket list according to their freq
        }
        // now we are extracting each element from the bucket.
        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {//extracting characters to answer array
                for (char c : bucket[i]) {
                    for (int j = 0; j < i; j++) {
                        sb.append(c);
                    }
                }
            }
        }
        String answer = sb.toString();
        return answer;
    }
}
