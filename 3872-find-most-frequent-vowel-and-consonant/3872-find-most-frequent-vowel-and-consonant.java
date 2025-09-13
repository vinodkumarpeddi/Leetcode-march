class Solution {
    public int maxFreqSum(String s) {
        HashSet<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                arr[ch-'a']++;
            }
        int a=0;
        int b=0;
          for(int i=25;i>=0;i--)
              {
                    char ch=(char)(i+'a');
                 if(arr[i]>0)
                 {
                     if(set.contains(ch))
                     {
                         a=Math.max(a,arr[i]);
                     }
                     else
                     {
                         b=Math.max(b,arr[i]);
                     }
                 }
              }
        return a+b;
           
    }
}