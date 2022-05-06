package com.dscfgos.leet_code_problems.data_structure.best_time_buy_sell_stock;

/**
 * (121) - Best Time to Buy and Sell Stock
 * <p>
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * <p>
 * You want to maximize your profit by choosing a single day to buy one stock and choosing
 * a different day in the future to sell that stock.
 * <p>
 * Return the maximum profit you can achieve from this transaction.
 * If you cannot achieve any profit, return 0.
 */
public class BestTimeBuySellStock {

    public int maxProfit(int[] prices) {

        int bestProfit = 0;

        if (prices != null && prices.length > 1) {
            int minValue = prices[0];
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] < minValue) {
                    minValue = prices[i];
                } else {
                    bestProfit = (bestProfit > prices[i] - minValue) ? bestProfit : prices[i] - minValue;
                }
            }
        }

        return bestProfit;
    }
}
