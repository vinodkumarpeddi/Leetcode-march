class Solution {
    public boolean primes(int n)
    {
        if(n<2) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=3;i<=Math.sqrt(n);i+=2)
        {
            if(n%i==0) return false;
        }
        return true;
    }
    public boolean palindrome(int n)
    {
         String s=Integer.toString(n);
         String rev=new StringBuilder(s).reverse().toString();
         return s.equals(rev);
    }
    public int primePalindrome(int n) {
        while(true)
        {
            if(primes(n) && palindrome(n)) return n;
            n++;
        }
    }
}