class Solution {
    public boolean areOccurrencesEqual(String s) {
        int arr[]=new int[26];
        for(char ch:s.toCharArray())
        {
            arr[ch-'a']+=1;
        }
        for(int i=1;i<s.length();i++)
        {
            if(arr[s.charAt(i-1)-'a']!=arr[s.charAt(i)-'a'])
            {
                return false;
            }
        }
        return true;
    }
}