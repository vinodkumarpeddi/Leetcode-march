class Solution {
    public int maxDifference(String s) {
       HashMap<Character,Integer> map=new HashMap<>();
       for(char ch:s.toCharArray())
       {
          map.put(ch,map.getOrDefault(ch,0)+1);
       } 
       int maxodd=0;
       int mineven=Integer.MAX_VALUE;
       for(int val:map.values())
       {
          if((val&1)==0)
          {
              mineven=Math.min(mineven,val);
          }
          else
          {
            maxodd=Math.max(maxodd,val);
          }
       }
       return maxodd-mineven;
    }
}