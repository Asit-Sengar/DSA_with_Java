//in this method we ensure to get the max product by calculating the prefix and suffix product.
//suppose there is a negative elemenet in the array then including it would only minimise the product hence we calculate
// the product till element only and from ending to that element only 
//if there is 0 in the array then we must equate the current products to 0.
class Solution
{
    public int maxProduct(int[] nums)
    {
        int max = Integer.MIN_VALUE;
        int prefix = 1;//the product from starting the array till we reaches the negative point.
        int suffix = 1;//the product from ending of the array till we reaches the negative point.
        for ( int i =0; i<nums.length ; i++)
        {
            if( prefix ==0)
            {
                prefix = 1;
            }
            else if( suffix ==0)
            {
                suffix = 1;
            }
            prefix = prefix * nums[i];
            suffix = suffix * nums[nums.length - i - 1];
            max = Math.max( max , Math.max( prefix , suffix));
        }
        return max;
    }
}
