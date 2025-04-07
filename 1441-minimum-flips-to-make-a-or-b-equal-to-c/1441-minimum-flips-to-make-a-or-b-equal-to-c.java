class Solution {
    public int minFlips(int a, int b, int c) {
        int count=0;
        for(int i=0;i<32;i++)
        {
           if (((a & 1) | (b & 1)) != (c & 1))

            {
                if((c&1)==1)
                {
                    count++;
                }
                else
                {
                    if((a&1)==1) count++;
                    if((b&1)==1) count++;
                }
            }
            a>>=1;
            b>>=1;
            c>>=1;
        }
        return count;
    }
}