class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int onesrow[]=new int[m],zeroesrow[]=new int[m];
          int onescol[]=new int[n],zeroescol[]=new int[n];
          for(int i=0;i<m;i++)
          {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    onesrow[i]++;
                    onescol[j]++;
                }
                else{
                    zeroesrow[i]++;
                    zeroescol[j]++;
                }
            }
          }
          int diff[][]=new int[m][n];
          for(int i=0;i<m;i++)
          {
            for(int j=0;j<n;j++)
            {
                diff[i][j]=onesrow[i]+onescol[j]-zeroesrow[i]-zeroescol[j];
            }
          }
          return diff;

        

    }
}