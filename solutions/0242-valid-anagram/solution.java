class Solution {
    public boolean isAnagram(String s, String t) 
    {
        //checkin the length of the two strings
      if(s.length()!=t.length())
      {
        return false;
      }
        //total small alphabets
        int [] frq = new int[26];
        
      for(int i =0;i<s.length();i++)
      {
        //using one loop only as if both string have same char ++ and -- ultimately will be zero...
        frq[s.charAt(i)-'a']++;
        frq[t.charAt(i)-'a']--;
      }
      //comparing
      for(int count =0;count<frq.length;count++)
      {
        if(frq[count]!=0)
        {
            return false;
        }
      }
     
       
      return true;  
    }
}
