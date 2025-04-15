class Solution {
    public String intToRoman(int num) {
        StringBuilder roman = new StringBuilder();
        String[] romanchar = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        for (int i = 0; i < nums.length && num > 0; i++) {
            int count = num / nums[i];
            num %= nums[i];
            while (count-- > 0) {
                roman.append(romanchar[i]);
            }
        }

        return roman.toString();
    }
}
