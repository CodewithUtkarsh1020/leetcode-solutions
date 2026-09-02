class Solution {
    public char findTheDifference(String s, String t) 
    {
        int frq[]= new int[26];

        for(char ch : s.toCharArray())
        {
            frq[ch-'a']++;
        }
         for(char ch : t.toCharArray())
        {
            frq[ch-'a']--;

            if(frq[ch-'a']<0)
            {
                return ch;
            }
        }

        return ' ';
    }
}
