class Solution {
    public boolean isvowel(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u')
        {
            return true;
        }
        return false;
    }
    public long countVowels(String word) {
       long count=0;
       int n=word.length();
       long res=0;
       long prev=0;
       for(int i=0;i<word.length();i++)
       {
          if(isvowel(word.charAt(i)))
          {
            prev+=i+1;
          }
          res+=prev;
       }
       return res;

    }
}