class Solution {
    public class Node{
        int first;
        int second;
        int third;
        public Node(int first,int second,int third)
        {
            this.first=first;
            this.second=second;
            this.third=third;
        }
    }
    public int[][] updateMatrix(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis=new int[n][m];
        int dist[][]=new int[n][m];
        Queue<Node> q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==0)
                {
                    q.add(new Node(i,j,0));
                    vis[i][j]=1;
                }
                else{
                    vis[i][j]=0;
                }
            }
        }

        int delrow[]={-1,0,1,0};
        int delcol[]={0,1,0,-1};
        while(!q.isEmpty())
        {
            Node node=q.poll();
            int r=node.first;
            int c=node.second;
            int steps=node.third;
            dist[r][c]=steps;
            for(int k=0;k<4;k++)
            {
                int nrow=r+delrow[k];
                int ncol=c+delcol[k];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0)
                {
                    vis[nrow][ncol]=1;
                    q.add(new Node(nrow,ncol,steps+1));
                }
            }
            
        }
        return dist;
    }
}