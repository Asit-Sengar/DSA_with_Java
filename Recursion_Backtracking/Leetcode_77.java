import java.util.*;

class Solution {
    private static void function(int index, int start, int n, int k, List<Integer> list, List<List<Integer>> answer) {
        if (index == k) {// it means we generated a valid combination
            answer.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i <= n; i++) {
            list.add(i);// adding a number;
            function(index + 1, i + 1, n, k, list, answer);// recursive step;
            list.remove(list.size() - 1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer>list = new ArrayList<>();
        function(0, 1, n, k, list, answer);
        return answer;
    }
    // public static void main(String[] args) {
    //     List<List<Integer>> answer = new ArrayList<>();
    //     List<Integer> list = new ArrayList<>();
    //     int n = 4;
    //     int k = 2;
    //     function(0, 1, n, k, list, answer);
    //     System.out.println(answer);
    // }
}
