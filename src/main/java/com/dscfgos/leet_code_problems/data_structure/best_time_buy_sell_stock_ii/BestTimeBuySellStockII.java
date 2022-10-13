package com.dscfgos.leet_code_problems.data_structure.best_time_buy_sell_stock_ii;

/**
 * (122) - Best Time to Buy and Sell Stock II
 * <p>
 * ou are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 * <p>
 * On each day, you may decide to buy and/or sell the stock.
 * You can only hold at most one share of the stock at any time.
 * However, you can buy it then immediately sell it on the same day.
 * <p>
 * Find and return the maximum profit you can achieve.
 */
public class BestTimeBuySellStockII {

    public int maxProfit(int[] prices) {

        int bestProfit = 0;

        if (prices != null && prices.length > 1) {
            int minValue = prices[0];
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] < minValue) {
                    minValue = prices[i];
                } else {
                    bestProfit += prices[i] - minValue;
                    minValue = prices[i];
                }
            }
        }

        return bestProfit;
    }
}
