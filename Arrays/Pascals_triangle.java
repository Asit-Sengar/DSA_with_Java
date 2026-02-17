//this approach by using the previous element values instead of recalculating the element everytime.
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int rows) {
        List<List<Integer>> Triangle = new ArrayList<>();
        for (int i = 1; i <= rows; i++) {
            List<Integer> temp = new ArrayList<>();
            int ans = 1;
            temp.add(ans);
            //there is also a naive approach to do this , first create a function to calculate the element by using ncr method 
            //and then calling it for every row.
            for (int col = 1; col <= i - 1; col++) {
                ans = ans * (i - col);
                ans = ans / col;
                temp.add(ans);
            }
            Triangle.add(temp);
        }
        return Triangle;
    }
}
