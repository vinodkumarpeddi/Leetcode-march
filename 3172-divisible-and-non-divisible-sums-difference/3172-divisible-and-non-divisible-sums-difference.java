class Solution {
    public int differenceOfSums(int n, int m) {
        int totalsum=n*(n+1)/2;
        int count=n/m;
        int multiplesum=m*count*(count+1)/2;
        return totalsum-2*multiplesum;
    }
}