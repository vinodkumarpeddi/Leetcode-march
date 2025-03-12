class Solution {
    public int bs(int[] nums,int target)
    {
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(nums[mid]<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return left;
    }
    public int maximumCount(int[] nums) {
        int pind=bs(nums,1);
        int nind=bs(nums,0);
        int pcount=nums.length-pind;
        int ncount=nind;
        return Math.max(pcount,ncount);

    }
}