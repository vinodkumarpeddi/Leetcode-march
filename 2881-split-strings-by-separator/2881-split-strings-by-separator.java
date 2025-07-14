import java.util.regex.Pattern;
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        ArrayList<String> ls=new ArrayList<>();
         for(String word:words)
         {
            int start=0;
            for(int i=0;i<word.length();i++)
            {
                if(word.charAt(i)==separator)
                {
                    if(i-start>0)
                    {
                        ls.add(word.substring(start,i));
                    }
                    start=i+1;
                }
                
            }
            if(start<word.length())
            {
                ls.add(word.substring(start));
            }
         }

        return ls;
    }
}