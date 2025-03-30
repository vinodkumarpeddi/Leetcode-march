class Solution {
    public int countKDifference(int[] nums, int k) {
        int count=0;
        int arr[]=new int[101];
        for(int num:nums)
        {
            arr[num]++;
        }
       for(int i=k+1;i<101;i++)
       {
          count+=arr[i]*arr[i-k];
       }
        return count;
    }
}