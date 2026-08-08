class Solution {
    public int findNumbers(int[] nums)
    
     {
        int [] count = new int[500];
        int ans=0;
        for(int i =0;i<nums.length;i++)
        {
            while(nums[i]>0)
            {
                nums[i]/=10;
                count[i]++;
            }
            //even
            if(count[i]%2==0)
            {
                 ans++;
            }
        }
       
        return ans;
    }
}
