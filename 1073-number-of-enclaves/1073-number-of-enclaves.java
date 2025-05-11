class Solution {
    public void dfs(int[][] grid,int row, int col,boolean[][] vis,int[] delrow,int[] delcol,int m,int n)
    {
        vis[row][col]=true;
        for(int i=0;i<4;i++)
        {
            int nrow=row+delrow[i];
            int ncol=col+delcol[i];
            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && grid[nrow][ncol]==1 && !vis[nrow][ncol])
            {
                dfs(grid,nrow,ncol,vis,delrow,delcol,m,n);
            }
        }
    }
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean vis[][]=new boolean[m][n];
        int delrow[]={-1,0,1,0};
        int delcol[]={0,1,0,-1};
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || i==m-1 || j==0 || j==n-1)
                {
                    if(grid[i][j]==1 && !vis[i][j])
                    {
                         dfs(grid,i,j,vis,delrow,delcol,m,n);
                    }
                }
            }
        }
        int cnt=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1 && !vis[i][j])
                {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}