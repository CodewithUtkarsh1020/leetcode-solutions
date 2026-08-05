class Solution {
    public int lengthOfLastWord(String s) 
    {
        int a = s.length()-1;
        int count = 0;
    //ignoring white spaces
       while(a>=0 && s.charAt(a) ==' ')
       {
        a--;
       }
       //counting lastword
       while(a>=0 && s.charAt(a)!=' ')
        
        {
            count++;
            a--;
        }
        return count;
    }
}
