class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i<nums.length;i+=2)
        {
              int freq=nums[i];
              int val=nums[i+1];
              while(freq!=0)
              {
                 ls.add(val);
                 freq--;
              }
            
        }
        int[] arr=ls.stream().mapToInt(i->i).toArray();
        return arr;
    }
}