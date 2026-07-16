class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1)
        {
            return x;
        }
        int low =0;
        int high = x;
        int ans = 0;
        while(low<=high)
        {
            int mid = low + (high - low)/2;
            long square = (long) mid * mid;
            if (x == square ){
                return mid;
            }
            if(square<x)
            {
                 ans = mid;//temporary
                low = mid+1;
            }
            else
            {
                high = mid -1;
            }
        }
        return ans;
    }
}
