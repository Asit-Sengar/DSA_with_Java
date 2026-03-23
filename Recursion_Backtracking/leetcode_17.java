//in this we are using hashmap for getting the string which should be currently used
//we have an integer index which tell us which place are we filling and which string are we using

import java.util.*;

class Solution {

    private static void helper(int index, String digits, HashMap<Integer, String> map, StringBuilder sb,
            List<String> answer) {
        if (index == digits.length()) {// it means we found a combination
            answer.add(sb.toString());
            return;
        }
        String temp = map.get(digits.charAt(index) - '0');
        for (int i = 0; i < temp.length(); i++) {
            sb.append(temp.charAt(i));// making a choice;
            helper(index + 1, digits, map, sb, answer);// recursive step for further cases;
            sb.deleteCharAt(sb.length() - 1);// most important backtracking step;
        }
    }
    public List<String> letterCombinations(String digits) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        StringBuilder sb = new StringBuilder();
        List<String> answer = new ArrayList<>();
        int index = 0;
        helper(0, digits, map, sb, answer);
        return answer;
    }
    // public static void main(String[] args) {
    //     HashMap<Integer, String> map = new HashMap<>();
    //     map.put(2, "abc");
    //     map.put(3, "def");
    //     map.put(4, "ghi");
    //     map.put(5, "jkl");
    //     map.put(6, "mno");
    //     map.put(7, "pqrs");
    //     map.put(8, "tuv");
    //     map.put(9, "wxyz");
    //     StringBuilder sb = new StringBuilder();
    //     List<String> answer = new ArrayList<>();
    //     int index = 0;
    //     String digits = "23";
    //     helper(0, digits, map, sb, answer);
    //     System.out.println(answer);
    // }
}
