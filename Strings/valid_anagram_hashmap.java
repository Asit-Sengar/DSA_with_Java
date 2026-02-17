import java.util.HashMap;
class Solution
{//so the main idea here is that i will traverse in first string  and then create a hashmap with 
//chararcters along with their frequency in it.
//now i will traverse in second string and if the  element of second string is present in the //hashmap i will decrease its value otherwise return false 
//and at last i will traverse in hashmap and if there is any value which is not 0 , if there is
//not equal to 0 then it is not anagram otherwise it is anagram.
    public boolean isAnagram(String s, String t)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        boolean answer = true;
        if(s.length()!=t.length())
        {
            return false;
        }
        for(int i =0;i<s.length();i++)
        {
            if(!map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),1);
            }
            else
            {
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            }
        }
        for( int j =0;j<t.length();j++)
        {
            if(!map.containsKey(t.charAt(j)))
            {
                answer = false;
                return answer;
            }
            else
            {
                map.put(t.charAt(j),map.getOrDefault(t.charAt(j),0)-1);
            }
        }
        for( int a : map.values())
        {
            if(a!=0)
            {
                answer = false;
            }
        }
        return answer;
    }
}
