import java.util.*;//here in recursive call we cannot do start +1 because it will produce list which contains duplicates;
//so do i+ 1 , it means start from the next iteration;

class Solution {
    private static void function(int index, int start, int sum, int numbers, int target, List<Integer> list,
            List<List<Integer>> answer) {
        if (sum == target && index == numbers) {// it means we found a list;
            answer.add(new ArrayList<>(list));
            return;
        }
        if (index > numbers - 1) {// it means we are out of the list;
            return;
        }

        for (int i = start; i <= 9; i++) {
            list.add(i);// making the choice;
            function(index + 1, i + 1, sum + i, numbers, target, list, answer);// recursive step for further
                                                                               // iterations;
            list.remove(list.size() - 1);// backtraking step;//to remove the element we just added;
        }

    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> answer = new ArrayList<>();
        int index = 0;
        int start = 1;
        int sum = 0;
        function(index, start, sum, k, n, list, answer);
        return answer;
    }
    // public static void main(String[] args) {
    // List<Integer> list = new ArrayList<>();
    // List<List<Integer>> answer = new ArrayList<>();
    // int index = 0;
    // int start = 1;
    // int sum = 0;
    // int numbers = 3;
    // int target = 9;
    // function(index, start, sum, numbers, target, list, answer);
    // System.out.println(answer);
    // }
}
