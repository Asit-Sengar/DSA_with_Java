import java.util.ArrayList;
import java.util.List;

class Solution {
    private static boolean isValid(StringBuilder sb)
    {
        int balance=0;
        for ( int i=0;i<sb.length();i++)
        {
            char c = sb.charAt(i);
            if(c=='(')
            {
                balance++;
            }
            else if(balance==0 && c==')')
            {//a string can not start from a closing bracket;
                return false;
            }
            else
            {
                balance--;
            }
        }
        if(balance==0)
        {
            return true;
        }
        return false;
        
    }
    private static List<String> helper(int index, int length, List<String> answer, StringBuilder s) {// private method
        if (index == length * 2) {// it means we built a string not knowing whether it is valid or not;
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                temp.append(s.charAt(i));
            }
            //now i should check whether it is valid or not;
            if(isValid(temp))
            {
                answer.add(temp.toString());
            }
            return answer;
        }
        s.append('(');// making a choice
        helper(index + 1, length, answer, s);// recursive step;
        s.deleteCharAt(index);// most important step ie backtraking step;
        s.append(')');
        helper(index + 1, length, answer, s);
        s.deleteCharAt(index);

        return answer;// final return step for particular function;
    }
    public List<String> generateParenthesis(int n)
    {
        StringBuilder s = new StringBuilder();
        List<String>answer = new ArrayList<>();
        helper(0,n,answer,s);
        return answer;
        }
}
