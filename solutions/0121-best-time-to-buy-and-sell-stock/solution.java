class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minsf = prices[0];
        int max =0;
        for(int i =1;i<n;i++)
        {
            int profit = prices[i] - minsf;
            max = Math.max(profit,max);
            minsf = Math.min(minsf,prices[i]);
        }
        return max;
        
        
    }
}
