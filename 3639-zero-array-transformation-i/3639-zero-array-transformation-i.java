class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n=nums.length;
        int line[]=new int[n+1];
        Arrays.fill(line,0);
        for(int query[]:queries)
        {
            line[query[0]]+=1;
            line[query[1]+1]-=1;
        }
        for(int i=1;i<line.length;i++)
        {
           line[i]=line[i]+line[i-1];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(line[i]<nums[i])
            {
                return false;
            }
        }
        return true;
    }
}