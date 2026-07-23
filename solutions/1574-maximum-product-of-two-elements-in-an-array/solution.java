class Solution {
    public int maxProduct(int[] nums) 
    {
        int ans =0;
        int n =nums.length;
        int max = -1;
        int smax = -1;
        for(int i =0;i<n;i++)
        {
            if(nums[i]>max)
            { 
                smax = max;
                max = nums[i];
            }
            else if(nums[i]<=max&&nums[i]>smax)
            {
                smax= nums[i];
            }
           
        }
        ans = ((max-1) *(smax-1));
      return ans;
    }
}
