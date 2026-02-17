class Solution
{//so the main idea here is that we shall traverse the string from end and check for the first odd num. 
  //if we encounter 0 or any even num , just skip it...
    public String largestOddNumber(String num)
    {
        boolean isodd=false;
        StringBuilder answer = new StringBuilder();
        for( int i=num.length()-1;i>=0;i--)
        {
            char c = num.charAt(i);
            if(i==num.length()-1 && c%2!=0)
            {//checking for if whole the string is odd or not.if the first num in traversal is odd then whole string is odd.
              //return it...
                return num;
            }
            else if(c%2!=0)
            {//trying to find odd number from end...
                isodd = true;
                for(int j=0;j<=i;j++)
                {//now we will append string to the odd number we  just encountered from start...
                    answer.append(num.charAt(j));
                }
                break;
            }
            else
            {//this case is for 0 and even numbers.
                continue;
            }
        }
        if(isodd = false)
        {//this is for if we couldnt find any odd number , it means whole string is even hence return empty string ("")...
            return "";
        }
        String a = answer.toString();
        return a;
    }
}
