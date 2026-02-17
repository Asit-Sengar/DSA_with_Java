class Solution {

    // For calculation of days required
    public int function(int[] weights, int minCapacity) {
        int sum = 0;
        int daysNeeded = 1;

        for (int i = 0; i < weights.length; i++) {
            if (sum + weights[i] > minCapacity) {
                daysNeeded++;
                sum = weights[i];
            } else {
                sum += weights[i];
            }
        }

        return daysNeeded;
    }

    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int answer = Integer.MAX_VALUE;
        int totalSum = 0;

        // Calculate maximum weight and total sum
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > max) {
                max = weights[i];
            }
            totalSum += weights[i];
        }
        //applying binary search.
        int low = max;
        int high = totalSum;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int requiredDays = function(weights, mid);

            if (requiredDays <= days && mid < answer) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return answer;
    }
}
