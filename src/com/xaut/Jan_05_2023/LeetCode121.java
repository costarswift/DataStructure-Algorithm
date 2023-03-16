package com.xaut.Jan_05_2023;

public class LeetCode121 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];//假设第一天的价格是历史最低
        /*
        动态规划思想：在第i天卖出，则最大利益 = max(第i-1天卖出的最大利益，第i天的价格-第i天之前最低价格)
         */
        for(int i = 1; i < prices.length; i++){
            //如果第i天的价格比前i天价格低，则历史最低价格就是第i天的价格。
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }
}
