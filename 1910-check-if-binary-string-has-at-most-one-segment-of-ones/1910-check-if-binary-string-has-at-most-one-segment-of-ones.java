class Solution {
    public boolean checkOnesSegment(String s) {
        boolean zerofound=false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                zerofound=true;
            }
            else if(zerofound && s.charAt(i)=='1')
            {
                return false;
            }

        }
        return true;
    }
}