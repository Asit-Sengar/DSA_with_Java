import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort( arr);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= arr.length - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j = j + 1;
                } else if (sum > 0) {
                    k = k - 1;
                } else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    j = j + 1;
                    k = k - 1;
                    list.add(temp);
                    while (j < k && arr[j] == arr[j - 1]) {
                        j = j + 1;
                    }
                    while (j < k && arr[k] == arr[k + 1]) {
                        k = k - 1;
                    }
                }
            }
        }
        return list;
    }
}

