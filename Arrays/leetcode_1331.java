import java.util.*;

//37,12,28,9,100,56,80,5,12;//original array
//5,9,12,12,28,37,56,80,100;//after sorting
class Solution {
    public static int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int temp[] = arr.clone();
        int answer[] = new int[arr.length];
        Arrays.sort(temp);
        int rank = 1;
        for (int i = 0; i < temp.length; i++) {// for storing element and its rank;
            if (!map.containsKey(temp[i])) {
                map.put(temp[i], rank++);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            answer[i] = map.get(arr[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        int arr[] = { 100, 100, 100 };
        int answer[] = arrayRankTransform(arr);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}