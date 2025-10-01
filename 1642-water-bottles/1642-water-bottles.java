class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drank=numBottles;
        int exchange;
        int extraempty;
      while(numBottles>=numExchange)
      {
          exchange=numBottles/numExchange;
          extraempty=numBottles%numExchange;
          drank+=exchange;
          numBottles=exchange+extraempty;
      }
      return drank;
    }
}