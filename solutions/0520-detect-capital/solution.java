class Solution {
    public boolean detectCapitalUse(String word) 
    {
        int capitalletters =0;

        for(char ch : word.toCharArray())
        {
            if(Character.isUpperCase(ch))
            {
                capitalletters++;
            }
        }
        return capitalletters==0|| capitalletters==word.length()|| (capitalletters==1 &&Character.isUpperCase(word.charAt(0)));
    }
}
