class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int len=intervals.length;
         Arrays.sort(intervals,(a,b)->{
            if(a[0]!=b[0]) return a[0]-b[0];
            else return b[1]-a[1];
         });
         int count=0,maxend=0;
         for(int[] interval:intervals)
         {
            int start=interval[0];
            int end=interval[1];
            if(end>maxend)
            {
                count++;
                maxend=end;
            }
         }
         return count;

    }
}