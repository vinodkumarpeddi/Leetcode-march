class Solution {
    public int minMaxDifference(int num) {
        String str=Integer.toString(num);
        char toreplacemax=' ';
        for(char c:str.toCharArray())
        {
            if(c!='9')
            {
                toreplacemax=c;
                break;
            }
        }
        String maxone=str.replace(toreplacemax,'9');
        char toreplacemin=str.charAt(0);
        String minone=str.replace(toreplacemin,'0');
        int maxNum = Integer.parseInt(maxone);
        int minNum = Integer.parseInt(minone);

        return maxNum - minNum;
    }
}