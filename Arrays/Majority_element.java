import java.util.HashMap;
class Solution{
    public int majorityElement(int[] arr) {
        int n = arr.length / 2;
        int a = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                map.put(arr[i], 1);
            }else {
                if (map.containsKey(arr[i])) {
                    map.put(arr[i], map.get(arr[i]) + 1);
                } else {
                    map.put(arr[i], 1);
                }
            }
        }
        for (int element : map.keySet()) {
            if (map.get(element) > n) {
                a = element;
            }
        }
        return a;
    }
}
