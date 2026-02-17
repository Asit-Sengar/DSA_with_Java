//i want create all possible unique permutation of the array nums[] = {1,2,1};
//first i will create all permutations of the array and then i will check if it does not exit then add it;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public void helperFunction(int index, int[] nums, List<List<Integer>> answer) {
        if (index == nums.length) {// base case of the recursion;
            List<Integer> temp = new ArrayList<>();
            for (int a : nums) {
                temp.add(a);
            }
            if (!answer.contains(temp)) {
                answer.add(temp);
            }
            return;
        }
        for (int i = index; i < nums.length; i++) {
            int p = nums[index];
            nums[index] = nums[i];// swapping the index and i variable
            nums[i] = p;
            helperFunction(index + 1, nums, answer);// recursive step;
            p = nums[index];
            nums[index] = nums[i];// backtracking
            nums[i] = p;
        }
    }

    public List<List<Integer>> permuteUnique(int []nums)
    {
        List<List<Integer>> answer = new ArrayList<>();
        helperFunction(0,nums,answer);
        return answer;
    }
}
