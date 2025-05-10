class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int num:nums)
        {
            xor^=num;
        }
        int diffbit=xor&(~(xor-1));
        int a=0;
        int b=0;
        for(int num:nums)
        {
            if((num&diffbit)!=0)
            {
                a^=num;
            }
            else
            {
                b^=num;
            }
        }
        return new int[]{a,b};
    }
}