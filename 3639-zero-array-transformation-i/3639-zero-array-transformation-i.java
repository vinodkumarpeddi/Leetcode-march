class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n=nums.length,currsum=0;
        int line[]=new int[n+1];

     
        for(int query[]:queries)
        {
            line[query[0]]++;
            line[query[1]+1]--;
        }
        for(int i=0;i<line.length-1;i++)
        {
           currsum+=line[i];
           if(nums[i]>currsum) return false;
        }
       
        return true;
    }
}