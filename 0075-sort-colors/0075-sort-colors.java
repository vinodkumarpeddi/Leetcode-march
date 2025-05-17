class Solution {
    public void swap(int nums[],int i,int j)
    {
        if(i==j) return;
       nums[i]=nums[i]^nums[j];
       nums[j]=nums[i]^nums[j];
       nums[i]=nums[i]^nums[j];
    }
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==2)
            {
                swap(nums,mid,high);
                high--;
            }
            else
            {
                mid++;
            }
        }
    }
}