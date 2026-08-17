class Solution {
    public boolean checkInclusion(String s1, String s2) 
    {
         if(s1.length()>s2.length())
        {
            return false;
        }
        int [] freq = new int[26];
        int [] window = new int [26];

        for(int i =0;i<s1.length();i++)
        {
            freq[s1.charAt(i)-'a']++;
        }
        int k = s1.length();

        for(int i =0;i<k;i++)
        {
            window[s2.charAt(i)-'a']++;
        }
        if(matches(freq,window))
        {
            return true;
        }
       for(int right =k;right<s2.length();right++)
       {
        window[s2.charAt(right)-'a']++;
        //window leaving
        int left = right-k;
        window[s2.charAt(left)-'a']--;
         if(matches(freq,window))
        {
            return true;
        }
       

       }
        return false;
    }
    public boolean matches(int[]a,int[]b)
    {
        for(int i =0;i<26;i++)
        {
            if(a[i]!=b[i])
            {
                return false;
            }
        }
        return true;
    }
}
