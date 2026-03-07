public class Solution {
    static final long mod = 1000000007;//since the number can be very large so we have to return the number/modulo;
    private static long helper(long base, long power) {
        if (power == 0) {
            return 1;
        }
        long half = helper(base, power/2);//writing base*base in the helper function would  overflow;
        long result = (half*half)%mod;//so first we will calculate half and then square it;
        if(power%2==0)
        {
            return result;//if power is even then return the result;
        }
        return (base*result)%mod;
    }

    public int countGoodNumbers(long n) {
        if (n % 2 == 0) {
            long a = helper(5, n / 2);
            long b = helper(4, n / 2);
            return (int)((a*b)%mod);//converting it to int;
        } else {
            long a = helper(5, (n + 1) / 2);
            long b = helper(4, n / 2);
            return (int)((a*b)%mod);//converting it to int;
        }
    }
}
