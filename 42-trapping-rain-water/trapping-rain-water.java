class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int count = 0;

        leftMax[0] = height[0];
        rightMax[n - 1] = height[n - 1];

        for(int i = 1, j = n - 2; i < n && j >= 0; i++, j--){
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
            rightMax[j] = Math.max(rightMax[j + 1], height[j]);
        }

        for(int i = 0; i < n; i++){
            count += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return count;
    }
}