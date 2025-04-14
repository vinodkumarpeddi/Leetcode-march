class Solution {
    public double myPow(double a, int b) {
        if(b==0) return 1;
        long exp=b;
        if(exp<0)
        {
            a=1/a;
            exp=-exp;
        }
        double res=1;
        while(exp>0)
        {
            if((exp&1)==1)
            {
                res*=a;
            }
            a=a*a;
            exp/=2;
        }
        return res;
    }
}