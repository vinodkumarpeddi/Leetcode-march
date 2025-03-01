class Solution {
    public int[] applyOperations(int[] nums) {
        int j=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            if(i<n-1 && nums[i]==nums[i+1])
            {
                nums[i]*=2;
                nums[i+1]=0;

            }
            if(nums[i]!=0)
            {
                nums[j++]=nums[i];
            }
        }
        while(j<n)
        {
            nums[j++]=0;
        }
       
        return nums;
    }
}