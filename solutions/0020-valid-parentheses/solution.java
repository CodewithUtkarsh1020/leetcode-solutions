class Solution {
    public boolean isValid(String s) 
    {
        //created a stack
        Stack<Character> ch = new Stack<>();

      for( int i =0;i<s.length();i++)
      {
        char chr = s.charAt(i);
        if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
        {
            ch.push(chr);
        }
         else{
            if(ch.isEmpty()){
                return false;
            }  
            else
            {
                char top = ch.peek();
                if(chr==')'&& top =='('
                    || chr=='}'&& top =='{'
                    || chr==']'&& top =='[')
                    {
                        ch.pop();
                    }
                    else
                    {
                        return false;
                    }
            } 
         }
      }
       return ch.isEmpty();
        
    }
}
