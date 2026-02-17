class Solution {
    public int myAtoi(String s)
    {
        int i=0;
        boolean isnegative = false;
        long answer = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        while(i<s.length() && s.charAt(i)==' ')
        {//this is for leading whitespaces.
            i++;
        }
        if(i<s.length() && (s.charAt(i)=='-' || s.charAt(i)=='+'))
        {//for identifying signs
            if(s.charAt(i)=='-')
            {
                isnegative = true;
            }
            i++;
        }
        while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9')
        {//if the character is between 0 and 9;
            answer = answer * 10 + (s.charAt(i)-'0');
            if(answer > max && isnegative == false)
            {//if the answer exceeds max then return max;
                return max;
            }
            if((-1* answer<min) && isnegative)
            {//if the answer is less than min then return min;
                return min;
            }
            i++;
        }
        if(isnegative)
        {
            return (int)answer*-1;
        }
        return (int)answer;
    }
}
