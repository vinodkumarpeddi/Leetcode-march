class Solution {
    public boolean areOccurrencesEqual(String s) {
        int arr[]=new int[26];
        for(char ch:s.toCharArray())
        {
            arr[ch-'a']+=1;
        }
        int freq=0;
       for(int count:arr)
       {
           if(count>0)
           {
           if(freq==0)
           {
            freq=count;
           }
           
           else if(freq!=count)
           {
            return false;
           }
           }
       }
        return true;
    }
}