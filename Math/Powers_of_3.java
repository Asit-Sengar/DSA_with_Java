class Solution {
    public boolean helper(int p, int q)
    {// this is a recursive function
        if (p == 0) {
            return true;
        }
        if(q<0)
        {
            return false;
        }
        int power = (int) Math.pow(3, q);
        if (p < power) {
            return helper(p, q - 1);
        } else
        {
            // System.out.println(q);
            return helper((p - power), q-1);
        }
    }

    public boolean checkPowersOfThree(int n) {
        return helper(n, 16);
    }
}
