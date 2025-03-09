class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
       int res=0;
       int left=0;
       int n=colors.length;
       int newarray[]=new int[n+k-1];
       for(int i=0;i<n;i++)
       {
          newarray[i]=colors[i];
       }
       for(int i=0;i<k-1;i++)
       {
        newarray[n+i]=colors[i];
       }
       for(int right=1;right<newarray.length;right++)
       {
          if(newarray[right]==newarray[right-1])
          {
             left=right;
          }
          if(right-left+1==k)
          {
            res++;
            left++;
          }
       }
       return res;
        
    }
}