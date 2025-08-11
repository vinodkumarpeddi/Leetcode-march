class Solution {
    public void dfs(int row,int col,char[][] grid, int[][] vis)
    {
        int n=grid.length;
        int m=grid[0].length;
        vis[row][col]=1;
        int[] delrow={-1,0,1,0};
        int[] delcol={0,1,0,-1};
        for(int k=0;k<4;k++)
        {
           int nrow=row+delrow[k];
                int ncol=col+delcol[k];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]!=1 && grid[nrow][ncol]=='1')
                {
                    dfs(nrow,ncol,grid,vis);
                }
        }
                
            
    
    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int cnt=0;
        int[][] vis=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(vis[i][j]!=1 && grid[i][j]=='1')
                {
                    cnt++;
                    dfs(i,j,grid,vis);
                }
            }
        }
        return cnt;
    }
}