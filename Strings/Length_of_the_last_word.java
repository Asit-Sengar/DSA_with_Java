class Solution
{//the main idea here is that we will check for the first character that is not equals to space
//that will be the ending of the word
//then we will search for starting of the word.
//String s is constrained to have at least one word.
    public int lengthOfLastWord(String s)
    {
        boolean inword = false;
        int end=-1;
        int start =-1;
        for( int i=s.length()-1;i>=0;i--)
        {
            char c = s.charAt(i);
            if( c!= ' ' && inword == false)
            {//this is for keeping track of the ending of the word.
                end = i;
                inword = true;
            }
            else if( c== ' ' && inword == true)
            {//this is for starting of the word
                start = i;
                inword = false;
                break;
            }
        }
        if(inword == true && end!=0)
        {//this case shall be applicable when ther is only word in the string like S = "Asit";
            return (end+1);
        }
        else if(end==0 && inword == true)
        {//this case shall be applicable when we have only one letter in the string like s = "a";
            return 1;
        }
        return (end-start);//representing the length of the word...
    }
}
