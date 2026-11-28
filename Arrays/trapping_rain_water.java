class Solution {
    public int trap(int[] height) {
        int answer = 0;
        int prefix_max[] = new int[height.length];
        int suffix_max[] = new int[height.length];
        prefix_max[0] = height[0];
        suffix_max[height.length - 1] = height[height.length - 1];
        for (int i = 1; i < height.length; i++) {
            prefix_max[i] = Math.max(prefix_max[i - 1], height[i]);
        }
        for (int i = height.length - 2; i >= 0; i--) {
            suffix_max[i] = Math.max(suffix_max[i + 1], height[i]);
        }
        for (int i = 0; i < height.length; i++) {
            if (height[i] < prefix_max[i] && height[i] < suffix_max[i]) {
                answer = answer + (Math.min(prefix_max[i], suffix_max[i]) - height[i]);
            }
        }
        return answer;
    }
}