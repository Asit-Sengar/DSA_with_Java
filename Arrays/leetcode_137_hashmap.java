import java.util.HashMap;

class Solution {
    public static int singleNumber(int[] nums) {
        int answer = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : nums) {
            if (map.containsKey(a)) {// if it contains;
                map.put(a, map.get(a) + 1);
            } else {// if it doesnt contain
                map.put(a, 1);
            }
        }
        for (int number : map.keySet()) {
            if (map.get(number) == 1) {
                answer = number;
            }
        }
        return answer;
    }

    // public static void main(String[] args) {
    //     int arr[] = { 0, 1, 0, 1, 0, 1, 99 };
    //     int a = singleNumber(arr);
    //     System.out.println(a);
    // }
}
