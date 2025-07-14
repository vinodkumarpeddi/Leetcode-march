import java.util.regex.Pattern;
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        ArrayList<String> ls=new ArrayList<>();
        for(int i=0;i<words.size();i++)
        {
            String[] arr=words.get(i).split(Pattern.quote(String.valueOf(separator)));
            for(String s:arr)
            {
               if(!s.isEmpty())
               {
                 ls.add(s);
               }
            }
        }
        return ls;
    }
}