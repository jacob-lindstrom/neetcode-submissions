class Solution {
    public int maxSubArray(int[] nums) {
        int curSum = 0;
        int best = nums[0];
        for (int i = 0; i < nums.length; i++){
            curSum += nums[i];
            best = Math.max(best, curSum);
            if (curSum < 0){
                curSum = 0;
            }
        }        

        return best;

    }
}
