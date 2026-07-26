import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int n = nums.length;
          int k =1;//place the unique elemet at the correct position/.
          if(n==0)
          {
            return 0;
          }
         
        for(int i =1;i<n;i++)
        {
            if(nums[i]!=nums[k-1])
            {
                nums[k]=nums[i];
                k++;
                
            }
        }

        return k;
    }
}
