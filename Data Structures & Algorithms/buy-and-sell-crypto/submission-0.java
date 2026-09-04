class Solution {
    public int maxProfit(int[] prices) {
        int mini = prices[0];
        int profit = 0;
        for(int i =0 ; i < prices.length ; i++){
            mini = Math.min(prices[i], mini);
            profit = Math.max(profit,prices[i] - mini);
        }
        return profit;
    }
}