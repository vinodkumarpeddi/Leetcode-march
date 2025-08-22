class Solution {
   private boolean isSorted(List<Integer> ls)
   {
       for(int i=0;i<ls.size()-1;i++)
       {
          if(ls.get(i)>ls.get(i+1))
          {
             return false;
          }
       }
       return true;
   }
    public int minimumPairRemoval(int[] nums) {
        
        List<Integer> ls=new ArrayList<>();
        for(int num:nums)
        {
            ls.add(num);
        }
        int count=0;
       
        while(!isSorted(ls))
        {
            int min=Integer.MAX_VALUE;
            int idx=-1;
            for(int i=0;i<ls.size()-1;i++)
            {
                int sum=ls.get(i)+ls.get(i+1);
                if(sum<min)
                {
                    min=sum;
                    idx=i;
                }
            }
            ls.set(idx,ls.get(idx)+ls.get(idx+1));
            ls.remove(idx+1);
            count++;
        }
        return count;
        

    }
}