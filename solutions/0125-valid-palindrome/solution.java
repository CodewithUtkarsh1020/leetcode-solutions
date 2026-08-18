class Solution {
    public boolean isPalindrome(String s)
     
     {
        if(s.length()==0)
        {
            return true;
        }
        int n = s.length();

        int j =n-1;
        int i =0;
      

        while(i<j)
        {

    if (!Character.isLetterOrDigit(s.charAt(i))) {
    i++;
} 

 else if (!Character.isLetterOrDigit(s.charAt(j))) {
    j--;
} 

  else {
    if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
        return false;
    }
    i++;
    j--;
}
        }
        return true;
    }
}
