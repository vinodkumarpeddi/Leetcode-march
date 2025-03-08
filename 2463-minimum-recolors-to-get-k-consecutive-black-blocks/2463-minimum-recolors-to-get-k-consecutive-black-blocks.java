class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min=k;
        int countb=0;
        int left=0;
        for(int right=0;right<blocks.length();right++)
        {
            if(blocks.charAt(right)=='B')
            {
                countb++;
            }
            if(right-left+1==k)
            {
                min=Math.min(min,k-countb);
                if(blocks.charAt(left)=='B')
                {
                    countb--;
                }
                left++;
            }
        }
        return min;
    }
}