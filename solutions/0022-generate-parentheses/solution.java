class Solution {
    //make a new function solve where we use recursion to solve the problem:
    public void solve (int o,int c,String s, List<String>ans)
    {
        if(o==0 && c==o)
        {
            ans.add(s);
            return ;
        }
      if(o>0){
        solve (o-1, c, s+'(', ans);
      }
      if(c>o){
        solve(o,c-1,s+')',ans);
      }
    }
        
    public List<String> generateParenthesis(int n) 
    {
        List<String> ans = new ArrayList<>();

        solve(n,n,"",ans);
        return ans;
    }

        
}
