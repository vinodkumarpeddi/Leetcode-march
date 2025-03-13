class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> map=new HashMap<>();
        // int count=0;
        int len=0;
        for(char ch:chars.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(String word:words)
        {
              HashMap<Character,Integer> temp=new HashMap<>(map);
              boolean isvalid=true;
            for(char ch:word.toCharArray())
            {
               if(temp.getOrDefault(ch,0)>0)
               {
                  temp.put(ch,temp.get(ch)-1);
                  
               }
               else
               {
                isvalid=false;
                break;
               }
            }
            if(isvalid)
            {
                len+=word.length();
            }
        }
        return len;
    }
}