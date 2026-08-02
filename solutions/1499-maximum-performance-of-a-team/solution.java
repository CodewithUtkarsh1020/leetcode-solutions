class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) 
    {
        int [][] engineers = new int[n][2];
        for(int i =0;i<n;i++)
        {
            engineers[i][0]= speed[i];
            engineers[i][1]= efficiency[i];
        }
        //sorting in decending order
        Arrays.sort(engineers,(a,b)->b[1]-a[1]);
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        long speedsum = 0;
        long maxperformance = 0;
        int mod = 1000000007;
        for(int[] engineer : engineers)
        
        {
            int currspeed = engineer[0];
            int currEfficiency = engineer[1];

            minheap.offer(currspeed);
            
             speedsum+= currspeed;

             if(minheap.size()>k)
             {
               speedsum -= minheap.poll();
             }

             maxperformance = Math.max(maxperformance,speedsum * currEfficiency);
            

        }




        return (int)(maxperformance % mod);
    }
}
