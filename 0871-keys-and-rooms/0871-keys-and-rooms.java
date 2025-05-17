class Solution {
    public void dfs(int node,List<List<Integer>> rooms,boolean vis[])
    {

        vis[node]=true;
        for(int adjnode:rooms.get(node))
        {
            if(!vis[adjnode])
            {
               dfs(adjnode,rooms,vis);
            }
           
        }
        
        
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean vis[]=new boolean[rooms.size()];
          dfs(0,rooms,vis);
          for(boolean v:vis)
          {
            if(!v) return false;
          }
          return true;

    }
}