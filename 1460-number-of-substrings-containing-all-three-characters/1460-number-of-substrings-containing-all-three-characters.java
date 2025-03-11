class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int count=0;
        for(int right=0;right<s.length();right++)
        {
             map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
           while(map.size()==3)
           {
            count+=s.length()-right;
            char l=s.charAt(left);
              if(map.containsKey(l))
              {
                map.put(l,map.get(l)-1);
                if(map.get(l)==0)
                {
                    map.remove(l);
                }

              }
              left++;
             
           }
          


        }
        return count;
    }
}