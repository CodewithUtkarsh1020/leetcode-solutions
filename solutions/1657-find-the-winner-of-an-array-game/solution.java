class Solution {
    public int getWinner(int[] arr, int k) 
    {
        int n = arr.length;
        int a = n-1;
        int winner = arr[0];
        int win_count = 0;
        //Taking the first person as winner as there will be a winner mention in question.
        for(int i =1;i<n;i++)
        {
            if(arr[i]>winner)
            {
                winner = arr[i];
                win_count = 1;
            }
            else 
            {
                  win_count++;  
            }
            
                if(win_count==k)
                
                {
                    return winner;
                }
               
            
            
        }
        return winner;
    }
}
