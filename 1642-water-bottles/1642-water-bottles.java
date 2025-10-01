class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum=numBottles;
        while(numBottles>=numExchange)
        {
           int newbottles=numBottles/numExchange;
           int leftover=numBottles%numExchange;
           sum+=newbottles;
           numBottles=newbottles+leftover;
        }
        return sum;
    }
}