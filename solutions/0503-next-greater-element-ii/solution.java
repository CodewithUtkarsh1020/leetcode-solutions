class Solution {
    public int[] nextGreaterElements(int[] nums) 
    {
        int n = nums.length;
        Stack<Integer>st = new Stack<>();
        int [] res = new int[n];
       //to check for circular array we make the array twice
        for(int i =2*n-1;i>=0;i--)
        {
            //now to access also the we have to calculate the index otherwise index will be out of bound
            int index = i%n;
            while(!st.isEmpty()&&st.peek()<=nums[index])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                res[index]=-1;
            }
            else
            {
                res[index]=st.peek();          
             }
            st.push(nums[index]);
        }
        return res;
    }
}
