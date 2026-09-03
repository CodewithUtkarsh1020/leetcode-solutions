class Solution {
    public boolean uniformArray(int[] nums1)
     
     {
        int n = nums1.length;
      int minodd = Integer.MAX_VALUE;

      for(int nums:nums1)
      {
        //we cannot make odd number to even
        if(nums%2!=0)
        {
            minodd = Math.min(nums,minodd);
        }
      }
      //No odd means all even
      if(minodd == Integer.MAX_VALUE)
      {
        return true;
      }

      for(int i =0;i<n;i++)
      {
        //for all odd
         if(nums1[i]%2==0 && nums1[i]<minodd)
         {
            return false;
         }
      }
     return true;
    }
}
