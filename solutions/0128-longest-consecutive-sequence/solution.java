class Solution {
    public int longestConsecutive(int[] nums)
     {
        int n = nums.length;
        Arrays.sort(nums);
        int current = 1;
        int longestseq =1;
        if(n==0)
        {
            return 0;
        }
        for(int i =0;i<n-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                continue;
            }
           if(nums[i+1]==nums[i]+1)
           {
            current++;
           }
           else
           {
             longestseq = Math.max(current,longestseq);
             current =1;
           }
           longestseq = Math.max(current,longestseq);
        }

        return longestseq;


        
    }
}
