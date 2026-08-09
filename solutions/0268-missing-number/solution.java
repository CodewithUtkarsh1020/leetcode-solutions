class Solution {
    public int missingNumber(int[] nums) 
    {
      //done using xor operator a^a =0;a^b =a
      int n = nums.length;
        int xor =n;


        for(int i =0;i<n;i++)
        {
            xor = xor ^ i^nums[i];
        }

        return xor;
    

        /*
     int n = nums.length;
       Arrays.sort(nums);
       int left=0;
       int right=n-1;

       while(left<=right)
       {
        int mid = left + (right-left)/2;

        if(nums[mid]==mid){
        //element is present:
        
           left = mid+1;
        }
         else
         {
            right = mid-1;
         }
       }

       return left;
       */
    }
}
