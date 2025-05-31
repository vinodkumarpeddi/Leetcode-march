class Solution {
    public int subsetXORSum(int[] nums) {
        return backtrack(nums,0,0);
    }
    public int backtrack(int nums[],int index,int curr)
    {
        if(index==nums.length)
        {
            return curr;
        }
        int with=backtrack(nums,index+1,curr^nums[index]);
        int without=backtrack(nums,index+1,curr);
        return with+without;
    }
}