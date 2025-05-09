class Solution {
    public void dfs(int[][] image,int[][] ans,boolean vis[][],int[] delrow,int[] delcol,int sr,int sc,int ini,int color)
    {
        vis[sr][sc]=true;
        ans[sr][sc]=color;
        for(int i=0;i<4;i++)
        {
            int nrow=sr+delrow[i];
            int ncol=sc+delcol[i];
            if(nrow>=0 && nrow<ans.length && ncol>=0 && ncol<ans[0].length && !vis[nrow][ncol] && ans[nrow][ncol]==ini)
            {
                dfs(image,ans,vis,delrow,delcol,nrow,ncol,ini,color);
            }
        }
        
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int ini=image[sr][sc];
        int n=image.length;
        int m=image[0].length;
      int[][] ans = new int[n][m];
        for (int i = 0; i < n; i++) {
            ans[i] = image[i].clone();
        }
        
        int delrow[]={-1,0,1,0};
        int delcol[]={0,1,0,-1};
        boolean vis[][]=new boolean[n][m];
        dfs(image,ans,vis,delrow,delcol,sr,sc,ini,color);
        return ans;
    }
}