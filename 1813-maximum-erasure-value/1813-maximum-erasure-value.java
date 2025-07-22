class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int left=0;
        int right=0,sum=0,maxsum=0;
        HashSet<Integer> set=new HashSet<>();
        while(right<nums.length)
        {
            if(!set.contains(nums[right]))
            {
               set.add(nums[right]);
               sum+=nums[right];
               maxsum=Math.max(sum,maxsum);
               right++;
            }
            else{
                while(nums[left]!=nums[right])
                {
                    set.remove(nums[left]);
                    sum-=nums[left];
                    left++;
                }
                set.remove(nums[left]);
                    sum-=nums[left];
                    left++;
            }
        }
        return maxsum;
    }
}