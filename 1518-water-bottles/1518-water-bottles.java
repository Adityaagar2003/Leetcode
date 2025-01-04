class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
int total=numBottles;

        while(numBottles>=numExchange){
            int newBottel=numBottles/numExchange;
total+=newBottel;
        numBottles=numBottles%numExchange +newBottel;

        }
   return total; }
}