class Solution {
    public int countNegatives(int[][] grid) {
        int cnt=0;
        for(int nums[]:grid)
        {
            for(int num:nums)
            {
                if(num<0) cnt++;
            }
        }
        return cnt;
    }
}