class Solution {
    public int Max(int[]nums)
    {
       int maxIndex = 0;

for(int i = 0; i < nums.length; i++) {
    if(nums[i] > nums[maxIndex]) {
        maxIndex = i;
    }
}
return maxIndex;
    }
     public int Min(int[]nums)
    {
       int minIndex = 0;

for(int i = 0; i < nums.length; i++) {
    if(nums[i] < nums[minIndex]) {
        minIndex = i;
    }
}

return minIndex;
    }
    public int minimumDeletions(int[] nums)
     {
        int n = nums.length;
       int mx = Max(nums);
        int mn =Min(nums);

        int left= Math.min(mn,mx);
        int right=Math.max(mn,mx);

        
     return Math.min(Math.min(left+1+n-right,right+1),n-left);
        
    }
}
