class Solution {
    private boolean isVowel(char ch)
    {
        return ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    public String sortVowels(String s) {
        ArrayList<Character> ls=new ArrayList<>();
        for(char ch:s.toCharArray())
        {
            if(isVowel(ch))
            {
                ls.add(ch);
            }
        }
        Collections.sort(ls);
        String st="";
        int ind=0;
        for(int i=0;i<s.length();i++)
        {
            if(isVowel(s.charAt(i)))
            {
                st+=ls.get(ind++);
            }
            else{
                st+=s.charAt(i);
            }
        }
        return st;
    }
}