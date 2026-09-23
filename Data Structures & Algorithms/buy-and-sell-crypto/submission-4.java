class Solution {
    public int maxProfit(int[] prices) {
        
        int left = 0;
        int right = 1;
        int result = 0;

        for (int i = 1; i < prices.length; i++){
            if (prices[left] > prices[right]){
                left = right;
                right++;
            }
            else{
                int curr = prices[right] - prices[left];
                right++;
                result = Math.max(curr, result);
            }
        }

        return result;
    }
}
