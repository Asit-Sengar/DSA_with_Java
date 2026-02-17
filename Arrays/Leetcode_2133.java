import java.util.HashSet;
import java.util.Set;
class Solution
{
    public boolean checkValid(int[][] matrix)
    {
        Set<Integer> set1= new HashSet<>();//declaring a set for storing col elements
        Set<Integer> set2 = new HashSet<>();//declaring a set for string row elements
        int n = matrix.length;
        for ( int i=0;i<matrix.length;i++)
        {//iterating
            for ( int j =0; j<matrix.length;j++)
            {
                set1.add(matrix[j][i]);//adding col elements
                set2.add(matrix[i][j]);//adding row elements
            }
            if(set1.size()!=n || set2.size()!=n)
            {//if set size is not equal to matrix.length then any element is missing
                return false;
            }
            set1.clear();
            set2.clear();
        }
        return true;
    }
}
