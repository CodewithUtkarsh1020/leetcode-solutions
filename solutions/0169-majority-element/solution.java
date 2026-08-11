class Solution {
    public int majorityElement(int[] nums) 
    {
        int count =0;
        int candidate =0;
        //Boyre Moore Majority Vote:
        //taking two variable at a time:
        //checking for one number at a time if same count++ else count--
        for(int num : nums)
        {
            if(count==0)
            {
                candidate = num;
            }
            if(candidate == num)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        return candidate;
    }
}
