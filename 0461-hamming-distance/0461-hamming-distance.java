class Solution {
    public int hammingDistance(int x, int y) {
        int num=x^y;
        int cnt=0;
        while(num!=0)
        {
            cnt+=num&1;
            num>>=1;
        }
        return cnt;

    }
}