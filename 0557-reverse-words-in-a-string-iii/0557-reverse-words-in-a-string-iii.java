class Solution {
    public String reverseWords(String s) {
        StringBuilder st=new StringBuilder();
        for(String word:s.split(" "))
        {
            st.append(new StringBuilder(word).reverse().toString());
            st.append(" ");
        }
        return st.toString().trim();
    }
}