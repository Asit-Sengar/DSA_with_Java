/*
    in this method we will try to calculate the range of count
    it shows all the possibilites of count
    if the min is equal to 0 then the string can be valid
 */
class Solution {
    public boolean checkValidString(String s) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt((i));
            if (c == '(') {// we have to update both of them
                min++;
                max++;
            } else if (c == ')') {// decrementing both of them
                min--;
                max--;
            } else {// it means we have asterik here so min will be decremented and max will be
                    // incremented
                min--;
                max++;
            }
            if (min < 0) {// at any point min becomes less than zero we will discard the value
                min = 0;
            }
            if (max < 0) {// this is edge case
                return false;
            }
        }
        if (min == 0)
            return true;
        return false;
    }
}