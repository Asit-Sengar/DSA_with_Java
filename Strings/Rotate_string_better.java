class Solution
{//the main idea here is that we get a loop to the length of the string and then we append everytime a char which is at the index 0 and delete that character from index 0;
  // ex  String s = "abcde"
  //so in first loop the stringbuilder will be "bcdea" and then we will check it
  //in 2nd iteration the stringbuider will be"cdeab" and then check it again;
    public boolean rotateString(String s, String goal)
    {
        boolean isrotated = false;
        StringBuilder sb = new StringBuilder(s);
        if(s.length()!=goal.length())
        {
            return false;
        }
        for( int i =0;i<s.length();i++)
        {
            sb.append(sb.charAt(0));
            sb.deleteCharAt(0);
            String temp = sb.toString();
            if(temp.equals(goal))
            {
                isrotated = true;
            }
        }
        return isrotated;
    }
}
