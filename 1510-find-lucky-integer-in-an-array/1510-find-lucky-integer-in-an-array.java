class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int count=-1;
        for(int num:map.keySet())
        {
            if(num==map.get(num))
            {
                count=Math.max(count,num);
            }
        }
        return count;
    }
}