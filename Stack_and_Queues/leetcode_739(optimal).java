
/*
    i will maintain the indeces order 
    if any number is smaller than the stack.peek() remove them until the number is greater  
 */
import java.util.Stack;

class Solution {
    public static int[] dailyTemperatures(int[] temperatures) {
        int answer[] = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        // i have to maintain the monotonic stack;
        for (int i = temperatures.length - 1; i >= 0; i--) {
            // {73,74,75,71,69,72,76,73}
            while (stack.size() > 0 && temperatures[stack.peek()] <= temperatures[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                answer[i] = 0;
            } else {
                answer[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int temp[] = { 73, 74, 75, 71, 69, 72, 76, 73 };
        int arr[] = dailyTemperatures(temp);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}