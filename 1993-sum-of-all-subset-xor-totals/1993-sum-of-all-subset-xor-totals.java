class Solution {
    public static void subsets(int[] nums,int index,List<Integer> current,List<List<Integer>> result)
    {
        if(index==nums.length)
        {
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        subsets(nums,index+1,current,result);
        current.remove(current.size()-1);
        subsets(nums,index+1,current,result);
    }
    public int subsetXORSum(int[] nums) {
        int sum=0,xor=0;
        List<List<Integer>> result=new ArrayList<>();
         subsets(nums, 0, new ArrayList<>(), result); 
        for(int i=0;i<result.size();i++)
        {
            xor=0;
            for(int num:result.get(i))
            {
               xor^=num;
            }
            sum+=xor;
        }
        return sum;
    }
}