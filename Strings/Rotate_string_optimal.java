class Solution
{//the main idea here is that firstly we will concatenate the given string and then check if the goal string is a substring of this string or not 
    public boolean rotateString(String s, String goal)
    {
        boolean isrotated = false;
        String temp = s + s;
        if(s.length()!=goal.length())//if there length is not equal then they can never be equal.
        {
            return false;
        }
        if(temp.contains(goal))//using contains method to check if it is a part of concatenatd string or not.
        {
            isrotated = true;
        }
        return isrotated;
    }
}
