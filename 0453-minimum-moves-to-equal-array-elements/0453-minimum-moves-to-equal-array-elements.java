class Solution {
    public int minMoves(int[] nums) {
       
       int min=Integer.MAX_VALUE;
       for(int num:nums)
       {
        min=Math.min(min,num);
       }
       int minmoves=0;
       for(int num:nums)
       {
         minmoves+=num-min;
       }
       return minmoves;
    }
}