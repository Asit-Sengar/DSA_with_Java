class Solution {
    public int commonFactors(int a, int b) {
        int answer =0;
        int x = a;
        int y = b;
        int i=1;
        while(i<=Math.min(x/2,y/2))
        {
            if(x%i==0 && y%i==0)
            {
                answer = answer+1;
            }
            i++;
        }
        if(Math.max(x,y)%Math.min(x,y)==0)
        {
            answer = answer + 1;
        }
        return answer;
    }
}
