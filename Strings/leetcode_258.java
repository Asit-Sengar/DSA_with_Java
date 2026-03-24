class Solution {
    private static int helper(StringBuilder s) {
        if (s.length() == 1) {
            return s.charAt(0) - '0';
        }
        StringBuilder temp = new StringBuilder();
        int num = 0;
        for (int i = 0; i < s.length(); i++) {// this loop is for making that temp string
            num = num + s.charAt(i) - '0';
        }
        temp.append(num);
        return helper(temp);

    }

    public int addDigits(int num) {
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        int a = helper(sb);
        return a;

    }
    // public static void main(String[] args) {
    // String s = "38";
    // StringBuilder sb = new StringBuilder(s);
    // int a = helper(sb);
    // System.out.println(a);
    // }
}
