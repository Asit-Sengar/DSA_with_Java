//first i have to build mask for both of them and then take bitwise and of them
//if and comes out to be 0 then they do not contain any common character;
class Solution {
    private static int buildmask(String s)
    {
        int mask=0;
        for (char c :s.toCharArray())
        {//here i am taking or of the bit of the char c;
            mask = mask | (1<<(c-'a'));
        }
        return mask;
    }
    public int maxProduct(String[] words)
    {
        int mask[] = new int[words.length];
        for ( int i=0;i<mask.length;i++)
        {
            mask[i] = buildmask(words[i]);
        }
        int answer=0;
        for ( int i=0;i<words.length;i++)
        {
            for ( int j=i+1;j<words.length;j++)
            {
                if((mask[i]&mask[j])==0)
                {
                    int length = words[i].length() * words[j].length();
                    answer  = Math.max(length,answer);
                }
            }
        }
        return answer;
    }
}
