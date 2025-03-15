class Solution {
    public String frequencySort(String s) {
        TreeMap<Character,Integer> map=new TreeMap<>();
        StringBuilder st=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
          List<Map.Entry<Character, Integer>> sorted= new ArrayList<>(map.entrySet());
        sorted.sort((a,b)->b.getValue().compareTo(a.getValue()));
        for(Map.Entry<Character,Integer> entry:sorted)
        {
            char ch=entry.getKey();
            int value=entry.getValue();
          st.append(String.valueOf(ch).repeat(value));
        }
        return st.toString();
    }
}