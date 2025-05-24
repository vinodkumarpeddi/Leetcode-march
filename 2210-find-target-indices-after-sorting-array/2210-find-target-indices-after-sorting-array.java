class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> ls=new ArrayList<>();
        int tarc=0,num=0;
        for(int ele:nums)
        {
            if(ele==target)
            {
                tarc++;
            }
            else if(ele<target)
            {
                num++;
            }
        }
        while(tarc>0)
        {
            ls.add(num);
            num++;
            tarc--;
        }
        
        return ls;
    }
}