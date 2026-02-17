import java.util.*;

class Solution {
    public void function(int index, int []nums,List<List<Integer>> answer)
    {
        if(index==nums.length)
        {//this is the base case for recursion;
            List<Integer> temp = new ArrayList<>();//if the pointer is out of the range it means we got a combination;
            for ( int a : nums)
            {//adding the combination to answer list by declaring a new temp list;
                temp.add(a);
            }
            answer.add(temp);
            return;
        }

        for ( int i=index;i<nums.length;i++)
        {//loop to swap every element from it including the current index also;
            int p = nums[index];
            nums[index] = nums[i];
            nums[i] = p;
            function(index+1,nums,answer);//recursive step to increase the pointer
            p= nums[index];//backtracking so that we can pass the original array to the function;
            nums[index] = nums[i];
            nums[i] = p;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        function(0,nums,answer);
        return answer;
    }
}
