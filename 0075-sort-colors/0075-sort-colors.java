class Solution {
    public void sortColors(int[] nums) {
        int zeroes=0,ones=0,twos=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                zeroes++;
            }
            else if(nums[i]==1)
            {
                ones++;
            }
            else
            {
                twos++;
            }
        }
        for(int i=0;i<zeroes;i++)
        {
            nums[i]=0;
        }
         for(int j=zeroes;j<zeroes+ones;j++)
        {
            nums[j]=1;
        }
         for(int k=zeroes+ones;k<nums.length;k++)
        {
            nums[k]=2;
        }

    }
}