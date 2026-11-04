class Solution {
    public int maxProfit(int[] prices) {
        
        int left = 0;
        int right = 1;
        int profit = 0;

        while(right < prices.length){
            int curr = 0;
            if(prices[left] > prices[right]){
                left = right;
                right++;
                profit = Math.max(curr, profit);
                curr = 0;
            }
            else{
                curr = (prices[right] - prices[left]);
                profit = Math.max(curr, profit);
                right++;
            }
        }

        return profit;

    }
}
