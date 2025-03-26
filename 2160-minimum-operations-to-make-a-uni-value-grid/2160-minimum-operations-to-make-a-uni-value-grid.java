class Solution {
    public int minOperations(int[][] grid, int x) {
     
       int i=0,count=0,totalsize=0;
       for(int row[]:grid)
       {
        totalsize+=row.length;
       }
         int newarr[]=new int[totalsize];
       for(int nums[]:grid)
       {
          for(int num:nums)
          {
            newarr[i++]=num;
          }
       }
       Arrays.sort(newarr);
       int median=newarr[newarr.length/2];
       for(int num:newarr)
       {
        int diff=Math.abs(num-median);
          if(diff%x!=0) return -1;
          count+=diff/x;
       }
       return count;
    }
}