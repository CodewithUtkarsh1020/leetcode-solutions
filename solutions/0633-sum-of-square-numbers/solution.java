class Solution {
    public boolean judgeSquareSum(int c) 
    {
        long n =(long) Math.sqrt(c);
        
        long left =0;
        long right =  n;

        while(left<=right)
        {
            long sum = left*left + right* right;
            if(sum==c)
            {
                return true;
            }
            else if(sum<c)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return false;
    }
}
