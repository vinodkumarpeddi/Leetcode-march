class Solution {
    public String multiply(String num1, String num2) {
       
        int len1=num1.length();
        int len2=num2.length();
        if(len1==1 && num1.charAt(0)=='0' || len2==1 && num2.charAt(0)=='0')
        {

            return "0";
        }
        int res[]=new int[len1+len2];
        for(int i=len1-1;i>=0;i--)
        {
            for(int j=len2-1;j>=0;j--)
            {
                int mul=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int sum=mul+res[i+j+1];
                res[i+j+1]=sum%10;
                res[i+j]+=sum/10;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int num:res)
        {
           if(!(sb.length()==0 && num==0))
          {
                sb.append(num);
            }
        }
        return sb.toString();
    }
}