class Solution {
    public boolean vowel(char ch)
    {
        return "aeiouAEIOU".indexOf(ch)!=-1;
    }
    public boolean isValid(String word) {
        boolean v=false;
        boolean c=false;
        if(word.length()<3)
            {
                return false;
            }
        for(char ch:word.toCharArray())
        {
           
            if(!Character.isLetter(ch) && !Character.isDigit(ch))
            {
                return false;
            }
            if(Character.isLetter(ch))
            {
                if(vowel(ch))
                {
                    v=true;
                }
                else
                {
                    c=true;
                }
            }


        }
        return v && c;
    }
}