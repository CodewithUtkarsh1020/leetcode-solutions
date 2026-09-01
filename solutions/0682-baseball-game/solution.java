class Solution {
    public int calPoints(String[] operations) 
    {
        Stack<Integer> st = new Stack<>();

        for(int i =0;i<operations.length;i++)
        {
            if(operations[i].equals("+"))
            {
                int first = st.pop();
                int second = st.peek();
                //To maintain the order of stack
                st.push(first);
                st.push(first+second);
            }
           else if (operations[i].equals("D")) 
           {
            int prevscore = st.peek();
            st.push(prevscore*2);  
            }
            else if(operations[i].equals("C"))
            {
                st.pop();
            }
            else
            {
                st.push(Integer.parseInt(operations[i]));
            }
        }
       int sum =0;

       while(!st.empty())
       {
        sum+=st.pop();
       }
        return sum;
    }
}
