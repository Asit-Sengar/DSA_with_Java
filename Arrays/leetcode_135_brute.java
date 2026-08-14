class Solution {
    public static int helper(int[] ratings) {
        int answer = 0;
        int left[] = new int[ratings.length];
        int right[] = new int[ratings.length];
        // the left array;
        left[0] = 1;
        right[ratings.length - 1] = 1;
        for (int i = 0; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {// if the current element is greater than the previous element
                // then put 1 more from the previous element;
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 1;
            }
        }
        // for the right array;
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {// if the right neighbour is greater than the current element
                // then put 1 more the current element;
                right[i] = right[i + 1] + 1;
            } else {
                right[i] = 1;
            }
        }
        for (int i = 0; i < ratings.length; i++) {
            answer = answer + Math.max(left[i], right[i]);
        }
        return answer;
    }

    public int candy(int[] ratings) {
        return helper(ratings);
    }
}