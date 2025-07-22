class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> count=new HashMap<>();
         HashMap<Integer,Integer> first=new HashMap<>();
          HashMap<Integer,Integer> last=new HashMap<>();
          for(int i=0;i<nums.length;i++)
          {
            int num=nums[i];
            count.put(num,count.getOrDefault(num,0)+1);
            if(!first.containsKey(num))
            {
                first.put(num,i);
            }
            last.put(num,i);
          }
          int degree=Collections.max(count.values());
          int minlen=nums.length;
          for(int num:count.keySet())
          {
            if(count.get(num)==degree)
            {
                int len=last.get(num)-first.get(num)+1;
                minlen=Math.min(minlen,len);
            }
          }
          return minlen;

    }
}