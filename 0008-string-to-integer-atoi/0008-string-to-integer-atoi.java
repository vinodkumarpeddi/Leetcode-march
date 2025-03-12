class Solution {
    public int myAtoi(String s) {
        int i=0,n=s.length(),sign=1;
        long res=0;
        if(n==0) return 0;
      while(i<n && s.charAt(i)==' ')
      {
        i++;
      }
      if(i==n) return 0;
      if(i<n && (s.charAt(i)=='-' || s.charAt(i)=='+'))
      {
        sign=s.charAt(i)=='-'?-1:1;
        i++;
      }
       while(i<s.length() && Character.isDigit(s.charAt(i)))
        {
           res=res*10+s.charAt(i)-'0';
           if(res>Integer.MAX_VALUE)
           {
               return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
           }
           
            i++;
        }
      
      
       return (int)res*sign;
    }
}