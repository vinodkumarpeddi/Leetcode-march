class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String words[]=text.split(" ");
        int len=words.length;
        for(String word:words)
        {
           for (int i = 0; i < brokenLetters.length(); i++) {
                if (word.contains(String.valueOf(brokenLetters.charAt(i)))) {
                    len--;
                    break;
                }
            }
        }
        return len;
    }
}