class Solution {
    public int maxProfit(int[] prices) {
        int max_diff = 0, diff = 0;
        for(int i = 0;i < prices.length;i++){
            for(int j = i + 1;j < prices.length;j++){
                if(prices[i] < prices[j]){
                diff = prices[j] - prices[i];
            }
                 max_diff = Math.max(max_diff, diff);
            }
        }
        return max_diff;
    }
}



