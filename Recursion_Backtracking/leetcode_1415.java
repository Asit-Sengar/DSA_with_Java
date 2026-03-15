import java.util.*;

class Solution {
    private static void helper(int index, int length, char[] nums, StringBuilder sb, List<String> answer) {
        if (index == length) {
            answer.add(sb.toString());
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (index == 0) {//if we are filling at index == 0 then we do not need to check for last element;
                sb.append(nums[i]);//make a choice , like a , b , c 
                helper(index + 1, length, nums, sb, answer);//move for greater index  and then make again a choice;
                sb.deleteCharAt(index);//we have to backtrack as well so as to delete the character;
            } else if (index != 0 && sb.charAt(sb.length() - 1) != nums[i]) {
                sb.append(nums[i]);//now we need to check the character 
                helper(index + 1, length, nums, sb, answer);
                sb.deleteCharAt(index);
            }
        }

    }

    public String getHappyString(int n, int k) {
        List<String> answer = new ArrayList<>();
        char[] nums = { 'a', 'b', 'c' };
        StringBuilder sb = new StringBuilder();
        helper(0, n, nums, sb, answer);
        if(k>answer.size())
        {
            return "";
        }
        return answer.get(k - 1);
    }
    // public static void main(String[] args) {
    // List<String> answer = new ArrayList<>();
    // char[] nums = { 'a', 'b', 'c' };
    // StringBuilder sb = new StringBuilder();
    // int length = 3;
    // helper(0, length, nums, sb, answer);
    // System.out.println(answer.get(8));
    // }
}
