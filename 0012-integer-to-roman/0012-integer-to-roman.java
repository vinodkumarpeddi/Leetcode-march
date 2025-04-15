class Solution {
    public String intToRoman(int num) {
        String roman = "";
        String[] romanchar = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        for (int pos = 0; num > 0; pos++) {
             int x=num/nums[pos];
             while(x>0)
             {
                roman+=romanchar[pos];
                x--;
             }
             num=num%nums[pos];
        }

        return roman;
    }
}
