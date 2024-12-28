class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buyprice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buyprice){
                buyprice=prices[i];
            }
            else{
            int currprofit=prices[i]-buyprice;
            profit=Math.max(currprofit,profit);
             }
        }
   return profit;
    }
}