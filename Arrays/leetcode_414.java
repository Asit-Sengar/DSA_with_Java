public class Solution {
    public static int thirdMax(int[] nums) {
        Long first = null;
        Long second = null;
        Long third = null;
        for (int num : nums) {
            if(first!=null && num==first
                ||second!=null && num == second//these conditions are for duplicated handiling
                ||third!=null && num==third)
            {
                continue;
            }
            if (first == null || num > first) {//these are the conditions for updatinh values
                third = second;
                second = first;
                first = (long) num;
            } else if (second == null || (num > second)) {
                third = second;
                second = (long) num;
            } else if (third == null || (num > third)) {
                third = (long) num;
            }
        }
        if(third == null)
        {//if we couldnot find the third then return first 
            return first.intValue();
        }
        return third.intValue();
    }
}
