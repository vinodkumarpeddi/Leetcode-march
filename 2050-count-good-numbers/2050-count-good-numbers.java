class Solution {
    static final int MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        // Special case for n = 1, which should return 5
        if (n == 1) {
            return 5;
        }

        // Calculate the even positions (n/2 positions) and odd positions ((n+1)/2 positions)
        long even = bin(5, (n+1)/ 2);  // Even indexed positions
        long odd = bin(4, n  / 2);  // Odd indexed positions
        return (int)((even * odd) % MOD);
    }

    public long bin(long a, long b) {
        long res = 1;
     
        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % MOD;
            }
            a = (a * a) % MOD;
            b /= 2;
        }
        return res;
    }
}
