class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int n=digits.length;
       Set<Integer> result = new TreeSet<>();
        for(int i=0;i<n;i++)
        {
            if(digits[i]==0) continue;
            for(int j=0;j<n;j++)
            { 
                if(i==j) continue;
                for(int k=0;k<n;k++)
                {
                    if(k==i || k==j) continue;
                   
                    int d1=digits[i],d2=digits[j],d3=digits[k];
                    
                    if(d3%2!=0) continue;
                    int num=d1*100+d2*10+d3;
                    result.add(num);
                }
            }
        }
        int i=0;
        int arr[]=new int[result.size()];
        for(int num:result)
        {
           arr[i++]=num;
        }
        return arr;
    }
}