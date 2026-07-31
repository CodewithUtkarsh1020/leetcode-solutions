class Solution {
    public int maxArea(int[] height) 
    {
        int n = height.length;
        int max_water =0;
        int area = 0;
        int left = 0;
        int right = n-1;
        while(left<right)
        {
            int width = right-left;
            int l = Math.min(height[left],height[right]);
             area = l*width;
             max_water = Math.max(max_water,area);
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
             right--;
            }
        }
        return max_water;
    }
}
