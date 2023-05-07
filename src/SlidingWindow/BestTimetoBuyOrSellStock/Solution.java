//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//        You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//
//        Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

        package SlidingWindow.BestTimetoBuyOrSellStock;

public class Solution {
    public  int maxProfit(int[] prices){
        //Create two thresholds using variables
        int buyPrice = Integer.MAX_VALUE;
        int maximumProfit = 0;

        for(int i = 0; i < prices.length; i++){
            int sellPrice = prices[i];
            buyPrice = Math.min(buyPrice, prices[i]);
            int profit = sellPrice - buyPrice;
            maximumProfit = Math.max(maximumProfit, profit);
        }
        return maximumProfit;
    }
}
