class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set=new HashSet<>();
        int n=grid.length;
         int expectedSum = (n * n * (n * n + 1)) / 2;
        int repeat=0;
        int sum=0;
        int miss=0;
    
         for(int nums[]:grid)
         {
            for(int num:nums)
            {
                if(set.contains(num))
                {
                    repeat=num;
                }
               
                    set.add(num);
                   
                    sum+=num;
                
            }
         }
         miss=expectedSum-sum+repeat;
         return new int[]{repeat,miss};

    }
}