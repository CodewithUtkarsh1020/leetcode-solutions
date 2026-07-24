class Solution {
    public boolean isThree(int n) 
    {
        int root = (int)Math.sqrt(n);
        //perfect root
        if(root*root!=n)
        {
            return false;
        }
        //check that the root is prime number.
        for(int i =2;i*i<=root;i++)
        {
            if(root%i==0)
            {
                return false;
            }
        }
        return root>1;
    }
}
