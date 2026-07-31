class Solution {
    public int missingInteger(int[] nums)
     
     {
        int sum = nums[0];
        int n = nums.length;
        Set<Integer>st= new HashSet<>();
        //add all the elemet in the hashset
        for(int i =0;i<n;i++)
        {
            st.add(nums[i]);
        }

       //find the longes prefix
        for(int j=1;j<n;j++)
        {
            if(nums[j] == nums[j-1] + 1)
            {
                  sum+=nums[j]; 
            }
            else
            {
                break;
            }
        }
        //check that sum is not present int he array
        while(st.contains(sum))
        {
            sum++;
        }
        return sum;
    }
}
