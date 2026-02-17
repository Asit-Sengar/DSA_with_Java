//the main idea here is we will declare a set and iterate through the array 
//if the element is already there then return true;
//if it is not there then add it immediately
//and we must also keep the constant track of the length of the set
//if the length is incresing the k then remove the elemen which was first added
//set.remove(nums[i-k]);//should be the exact line for this
import java.util.HashSet;
import java.util.Set;

class Solution {
    public  boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
