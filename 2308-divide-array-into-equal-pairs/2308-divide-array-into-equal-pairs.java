class Solution {
    public boolean divideArray(int[] nums) {
        int freq[]=new int[501];
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
            max=Math.max(max,nums[i]);
        }
        for(int i=0;i<max;i++)
        {
            if(freq[i]%2!=0)
            {
                return false;
            }
        }
        return true;
    }
}