class Solution {
    public int winningPlayerCount(int n, int[][] pick)
     
     {
        int [] [] frq = new int[n][11];

        for(int i =0;i<pick.length;i++)
        {
            int[] p= pick[i];
            int player = p[0];
            int Ball = p[1];
            frq[player][Ball]++;
        }
        int winners =0;
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<11;j++)
            {
                if( frq[i][j] >= i+1)
                {
                    winners++;
                    break;
                }
            }
        }
        return winners;
     }
}
