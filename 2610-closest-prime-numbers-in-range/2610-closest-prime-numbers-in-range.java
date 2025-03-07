class Solution {
    public int[] closestPrimes(int left,int right)
    {
        boolean primes[]=new boolean[right+1];
        Arrays.fill(primes,true);
        primes[0]=primes[1]=false;
        for(int i=2;i*i<=right;i++)
        {
            if(primes[i])
            {
                for(int j=i*i;j<=right;j+=i)
                {
                    primes[j]=false;
                }
            }
        }
        int prev=-1;
        int res[]=new int[]{-1,-1};
        int min=Integer.MAX_VALUE;
        for(int i=left;i<=right;i++)
        {
            if(primes[i])
            {
              if(prev==-1)
              {
                prev=i;
              }
              else{
                  if(i-prev<min)
                  {
                    res[0]=prev;
                    res[1]=i;
                    min=i-prev;
                  }
                  prev=i;
              }
               
            }
        }
        return res;



    }
}