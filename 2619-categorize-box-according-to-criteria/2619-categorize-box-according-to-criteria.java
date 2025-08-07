class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        String res1="";
        String res2="";
        long volume=1L*length*width*height;
        int dim=10000;
        if(length>=dim || width>=dim ||height>=dim ||volume>=1000_000_000)
        {
            res1="Bulky";
        }
        if(mass>=100)
        {
            res2="Heavy";
        }
        if(res1.equals("Bulky") && res2.equals("Heavy"))
        {
            return "Both";
        }
       if (!res1.equals("Bulky") && !res2.equals("Heavy")) {
            return "Neither";
        }
        if (res1.equals("Bulky")) {
            return "Bulky";
        }
       return "Heavy";
    }
}