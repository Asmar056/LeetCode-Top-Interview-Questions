package BestTimetoBuyandSellStock;

public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int currentBuy = prices[0];
        int currentSell = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (currentBuy > prices[i]){
                currentBuy = prices[i];
                currentSell = prices[i];
            }else if (currentSell < prices[i])
                currentSell = prices[i];

            if (currentSell - currentBuy > profit)
                profit = currentSell - currentBuy;
        }
        return profit;
    }
}
