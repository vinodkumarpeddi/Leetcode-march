class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> less=new ArrayList<>();
         ArrayList<Integer> eq=new ArrayList<>();
          ArrayList<Integer> greater=new ArrayList<>();
          int res[]=new int[nums.length];
          int i=0;
          for(int num:nums)
          {
            if(num<pivot)
            {
                less.add(num);
            }
            else if(num==pivot)
            {
               eq.add(num);
            }
            else
            {
                 greater.add(num);
            }
          }
              
          for(int num:less)
          {
            res[i++]=num;
          }
           for(int num:eq)
          {
            res[i++]=num;
          }
          
          for(int num:greater)
          {
            res[i++]=num;
          }
          return res;


    }
}