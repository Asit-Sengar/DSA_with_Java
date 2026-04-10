/*this problem requires bezouts lemma;
it explains target is only possible if it is a mulitiple of gcd of both jugs;
first we will find the gcd then apply conditions accordingly;
*/
class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        if(target>x+y)
        {
            return false;
        }
        int i=1;
        int gcd = 1;
        while(i<=Math.min(x,y))
        {
            if(x%i==0 && y%i==0)
            {
                gcd = i;
            }
            i++;
        }
        if(target == 0 || target%gcd==0)
        {
            return true;
        }
        return false;
    }
}
