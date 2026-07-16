class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m =  word2.length();
        int [][]dp = new int [m+1][n+1];
        //word2 is empty
        for(int i =0;i<=m;i++)
        {
            dp[i][0]=i;
        } 
        //word1 is empty
        for(int j=0;j<=n;j++)
        {
            dp[0][j]=j;
        }   
        for(int i =1;i<=m;i++)
        {
            for(int j = 1;j<=n;j++)
            {
                if(word2.charAt(i-1) == word1.charAt(j-1)){
                dp[i][j] = dp[i-1][j-1];
                }
            
            else
            {
                //insertion 
               int insertion = dp[i][j-1];
               int deletion = dp[i-1][j];
               int switch1 = dp [i-1][j-1];
                dp[i][j] = 1 + Math.min(insertion,Math.min(deletion,switch1));
            }
            
            }
        }
   
        return dp[m][n];
    }
}
