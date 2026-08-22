//Sliding window algorithm

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++){

            int opposite = target - nums[i];
            if (seen.containsKey(opposite)){
                return new int[]{seen.get(opposite), i};
            }
            seen.put(nums[i], i);
        }

        return new int[2];

    }
}
