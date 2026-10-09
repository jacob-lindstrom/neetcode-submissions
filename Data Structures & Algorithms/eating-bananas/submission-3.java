class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1;
        int hi = Arrays.stream(piles).max().getAsInt();
        int result = hi;

        while(lo <= hi){
            int mid = (lo + hi) / 2;
            long total = 0;
            for (int n : piles){
                total += Math.ceil((double) n / mid);
            }

            if (total <= h){
                result = mid;
                hi = mid - 1;
            }
            else {
                lo = mid + 1;
            }
        } 

        return result; 
        
    }
}
