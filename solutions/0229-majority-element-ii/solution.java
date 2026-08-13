class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
        // Boyer-Moore Voting Algorithm
        List<Integer>ans = new ArrayList<>();
        int n = nums.length;
        int count1=0;
        int count2=0;
        
         int candidates1 =0;
         int candidates2 =0;

         for(int num : nums)
         { 
            //checks number not equal to other number:
            if(count1==0 && num != candidates2)
            {
                candidates1 = num;
                count1++;
            }
            //checks number not equal to other number:
            else if(count2==0 && num!= candidates1)
            {
                candidates2 = num;
                count2++;
            }
            else if(num== candidates1)
            {
                count1++;
            }
            else if(num == candidates2)
            {
                count2++;
            }
            else
            {
                count1--;
                count2--;
            }
         }
         int frq1=0;
         int frq2=0;

         for(int num : nums){
            if(num==candidates1)
            {
                frq1++;
            }
            if(num==candidates2)
            {
                frq2++;
            }
         }
         if(frq1>n/3)
         {
            ans.add(candidates1);
         }
         if(frq2>n/3 && candidates1!=candidates2)
         {
            ans.add(candidates2);
         }
     return ans;
    }
}
