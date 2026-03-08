//generating all binary strings of length with recursion and backtraking;
import java.util.ArrayList;
import java.util.List;

class Main {
    private static List<String> helper(int index, List<String> answer, int length, StringBuilder sb) {
        if (index == length) {// it means we have generated a string now make temp stringbuilder and add it in
                              // the answer list;
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < sb.length(); i++) {
                temp.append(sb.charAt(i));// for making the temp stringbuilder;
            }
            answer.add(temp.toString());// adding the temp stringbuilder to answer list;
            return answer;
        }
        sb.append('0');
        helper(index + 1, answer, length, sb);
        sb.deleteCharAt(index);// backtracking step most important
        sb.append('1');
        helper(index + 1, answer, length, sb);
        sb.deleteCharAt(index);// backtracking step most important
        return answer;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        List<String> answer = new ArrayList<>();
        int length = 2;
        helper(0, answer, length, sb);
        System.out.println(answer);
    }
}
