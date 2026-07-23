class Solution {
    public int numWaterBottles(int numBottles, int numExchange) 
    {
       int newbottles=0;
       int rembottles=0;
       int ans = numBottles;

       while(numBottles>=numExchange)
       {
        
            newbottles = numBottles/numExchange;
             rembottles = numBottles%numExchange;
            ans+=newbottles;
            numBottles = newbottles + rembottles;
       }

    return ans;
    }
}
