import java.util.Stack;

public class Solution{
    public static boolean isValid(String s) {
        if (s.length() <= 1) {
            return false;
        }
        if (s.charAt(s.length() - 1) == '(' || s.charAt(s.length() - 1) == '{' || s.charAt(s.length() - 1) == '[')
        {//it means that the string can not start from these;
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '(' || c == '[') {// opening of the bracket
                stack.push(c);
            }
            if ((c == '}' || c == ')' || c == ']')) {
                if(stack.isEmpty())
                {//always check before poping out;
                    return false;
                }
                char d = stack.pop();
                if (c == '}' && d != '{') {
                    return false;
                } else if (c == ')' && d != '(') {
                    return false;
                } else if (c == ']' && d != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();//if stack is empty then return true;
    }

    // public static void main(String[] args) {
    //     String s = "{({";
    //     System.out.println(isValid(s));
    // }
}
