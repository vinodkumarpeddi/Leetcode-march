class Solution {
    public void dfs(int row,int col,char[][] board,boolean[][] vis,int[] delrow,int[] delcol,int n,int m)
    {
         vis[row][col]=true;
         for(int i=0;i<4;i++)
         {
            int nrow=row+delrow[i];
            int ncol=col+delcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && !vis[nrow][ncol] && board[nrow][ncol]=='O')
            {
               dfs(nrow,ncol,board,vis,delrow,delcol,n,m);
            }
         }
    }
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        int cnt=0;
        int delrow[]={-1,0,1,0};
        int delcol[]={0,1,0,-1};
        boolean vis[][]=new boolean[n][m];
        for(int j=0;j<m;j++)
        {
             if(board[0][j]=='O' && !vis[0][j])
             {
                dfs(0,j,board,vis,delrow,delcol,n,m);
             }
             if(board[n-1][j]=='O' && !vis[n-1][j])
             {
                dfs(n-1,j,board,vis,delrow,delcol,n,m);
             }
        }
         for(int j=0;j<n;j++)
        {
             if(board[j][0]=='O' && !vis[j][0])
             {
                dfs(j,0,board,vis,delrow,delcol,n,m);
             }
             if(board[j][m-1]=='O' && !vis[j][m-1])
             {
                dfs(j,m-1,board,vis,delrow,delcol,n,m);
             }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j]=='O' && !vis[i][j])
                {
                    board[i][j]='X';
                }
            }
        }
       
    }
}