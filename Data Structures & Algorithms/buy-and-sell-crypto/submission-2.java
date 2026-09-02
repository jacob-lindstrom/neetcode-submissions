class Solution {
    public int maxProfit(int[] prices) {
        // iterate through the array
        // for each number in prices, if the next number is larger
        // find the profit, keep the min, move the next
        // if next number is smaller set that to next min, keep profit
        // only update if profit is bigger

        int min = 100; 
        int profit = 0;
        for (int i = 0; i < prices.length; i++){
            
            if (prices[i] < min){
                min = prices[i];
            }
            int curr = prices[i] - min;
            if (curr > profit){
                profit = curr;
            }

        }

        return profit;

    }
}
