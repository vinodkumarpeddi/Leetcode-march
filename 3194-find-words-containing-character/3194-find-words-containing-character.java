class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ls=new ArrayList<>();
        int i=0;
        for(String st:words)
        {
            
            if(st.contains(String.valueOf(x)))
            {
                ls.add(i);
            }
            i++;
        }
        return ls;
    }
}