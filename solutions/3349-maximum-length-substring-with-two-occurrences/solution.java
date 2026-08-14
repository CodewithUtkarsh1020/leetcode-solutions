class Solution {
    public int maximumLengthSubstring(String s) 
    {
        int [] frq = new int[26];
        //Sliding window
        int left =0;
        int ans =0;
        for(int right =0;right<s.length();right++)
        {
           frq[s.charAt(right)-'a']++;
        
        while(frq[s.charAt(right)-'a']>2)
        {
             frq[s.charAt(left)-'a']--;
             left++;
        }
       ans= Math.max(ans,right-left+1);
        }
        return ans;
    }
}
