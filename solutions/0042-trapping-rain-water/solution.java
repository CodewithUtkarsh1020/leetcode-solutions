class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        
        int n = height.length;
        int[] leftmax = new int[n];
        int[] rightmax = new int[n];
        
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
    
        
        rightmax[n - 1] = height[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            rightmax[j] = Math.max(height[j], rightmax[j + 1]);
        }
        
     
        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            int minBoundary = Math.min(leftmax[i], rightmax[i]);
            totalWater += minBoundary - height[i];
        }
        
        return totalWater;
    }
}
