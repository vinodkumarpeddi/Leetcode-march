class Solution {
    static int findmax(int arr[])
    { 
        int max=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    static int Calculatehours(int arr[],int h)
    {
        int total=0;
        for(int i=0;i<arr.length;i++)
        {
            total+=Math.ceil((double)arr[i]/(double)h);
        }
        return total;
    }

    public int minEatingSpeed(int[] piles, int h) {
        
        int low=1;
        int high=findmax(piles);
        int ans=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            
            int totalhours=Calculatehours(piles,mid);
            if(totalhours<=h)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
}