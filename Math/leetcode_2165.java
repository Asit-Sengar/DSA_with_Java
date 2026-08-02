// int num = 310;
import java.util.Arrays;

class Solution {
    public long smallestNumber(long num) {
        if(num==0)
        {
            return num;
        }
        long temp = Math.abs(num);
        long answer= 0;
        int length = 0;
        while(temp>0)
        {
            length = length + 1;
            temp = temp/10;
        }
        long arr[] = new long[length];
        temp = Math.abs(num);
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = temp%10;
            temp = temp/10;
        }
        Arrays.sort(arr);
        if(num<0)
        {
            for(int i= arr.length - 1;i>=0;i--)
            {
                answer = answer + arr[i];
                answer  = answer *10;
            }
            return (answer*-1)/10;
        }
        if( arr[0] ==0)
        {
            for(int i=1;i<arr.length ; i++)
            {
                if(arr[i]!=0)
                {
                    arr[0] = arr[i];
                    arr[i] = 0;
                    break;
                }
            }
        }
        for(int i = 0;i<arr.length ; i++)
        {
            answer = answer + arr[i];
            answer = answer * 10;
        }
        return (answer/10);
    }
}