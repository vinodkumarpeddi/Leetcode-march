class Solution {
    public boolean canform(String s,int counts[])
    {
        int c[]=new int [26];
        for(char ch:s.toCharArray())
        {
            c[ch-'a']++;
            if(c[ch-'a']>counts[ch-'a'])
            {
                return false;
            }
           
        }
         return true;
    }
    public int countCharacters(String[] words, String chars) {
        int counts[]=new int[26];
        int res=0;
        for(int i=0;i<chars.length();i++)
        {
            counts[chars.charAt(i)-'a']++;
        }
        for(String s:words)
        {
            if(canform(s,counts))
            {
                res+=s.length();
            }
        }
        return res;
    }

}