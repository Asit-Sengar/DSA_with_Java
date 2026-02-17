import java.util.HashMap;

class Solution {
    private static final HashMap<Character, Integer> map = new HashMap<>();
    // this line is for creating a map and putting all values in it only once
    // so that every time the main method is called it doesnot create map every
    // time;
    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

    }

    public static int romanToInt(String s) {
        int temp = 0;
        int sum = 0;
        int i = s.length() - 1;
        while (i >= 0) {
            int c = map.get(s.charAt(i));
            if (c >= temp) {
                sum = sum + c;
                temp = c;
            } else {
                sum = sum - c;
                temp = c;
            }
            i--;
        }
        return sum;
    }
}
