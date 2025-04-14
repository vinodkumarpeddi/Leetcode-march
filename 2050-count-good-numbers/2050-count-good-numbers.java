class Solution {
    static final int MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        if (n == 1) {
            return 5;
        }

        long even = bin(5, (n + 1) / 2);  // Even positions
        long odd = bin(4, n / 2);        // Odd positions
        return (int)((even * odd) % MOD);
    }

    public long bin(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % MOD;
            }
            a = (a * a) % MOD;
            b >>= 1;
        }
        return res;
    }
}
