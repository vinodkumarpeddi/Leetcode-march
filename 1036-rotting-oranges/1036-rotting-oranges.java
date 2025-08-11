class Solution {
    public class Pair{
        int row;
        int col;
        int time;
        public Pair(int row,int col,int time)
        {
            this.row=row;
            this.col=col;
            this.time=time;
        }

    }
    public int orangesRotting(int[][] grid) {
       int n=grid.length;
        int m=grid[0].length;
         Queue<Pair> q=new LinkedList<>();
          int freshCount = 0;

        // Step 1: Push all initially rotten oranges into the queue
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.add(new Pair(i, j, 0));
                }
                if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }
         int delrow[]={-1,0,1,0};
         int delcol[]={0,1,0,-1};
         int time=0;
         int rotten=0;
         
         while(!q.isEmpty())
         {
             Pair node=q.poll();
            int r=node.row;
            int c=node.col;
            int t=node.time;
            time=Math.max(time,t);
            for(int k=0;k<4;k++)
            {
                int nrow=r+delrow[k];
                int ncol=c+delcol[k];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]==1)
                {
                    grid[nrow][ncol]=2;
                    q.add(new Pair(nrow,ncol,t+1));
                    rotten++;
                }
            }
            
         }
         return (freshCount-rotten)!=0?-1:time;
}}