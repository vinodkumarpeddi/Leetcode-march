class Solution {
    public class Pair{
        int row;
        int col;
        int time;
        Pair(int row,int col,int time)
        {
            this.row=row;
            this.col=col;
            this.time=time;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q=new LinkedList<>();
       
           int n=grid.length;
           int m=grid[0].length;
           int fresh=0,rotten=0,time=0;
            boolean vis[][]=new boolean[n][m];
           int delrow[]={-1,0,1,0};
           int delcol[]={0,1,0,-1};
           for(int i=0;i<n;i++)
           {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                     q.add(new Pair(i,j,0));
                     vis[i][j]=true;
                }
                else if(grid[i][j]==1)
                {
                    fresh++;
                }

            }
           }
            while(!q.isEmpty())
         {
            Pair current=q.poll();
            int row=current.row;
            int col=current.col;
            int t=current.time;
            time=Math.max(time,t);
            
              for(int i=0;i<4;i++)
              {
                   int nrow=row+delrow[i];
                   int ncol=col+delcol[i];
                   if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]==1 && !vis[nrow][ncol])
                   {
                       
                       q.add(new Pair(nrow,ncol,time+1));
                       vis[nrow][ncol]=true;
                       rotten++;
                   }
              }
             
         }
         return (rotten==fresh)?time:-1;
          
          
    }
}