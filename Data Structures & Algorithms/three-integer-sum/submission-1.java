class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // sort nums
        Arrays.sort(nums);
        int n = nums.length;
        // loop through nums (n - 2)
        for (int i = 0; i < n - 2; i++) {
            // skip if nums[i] same as prev
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum < 0) {
                    l += 1;
                    while (l < r && nums[l - 1] == nums[l]) {
                        l += 1;
                    }
                }
                else if (sum > 0) {
                    r -= 1;
                    while (l < r && nums[r] == nums[r + 1]) {
                        r -= 1;
                    }
                }
                else {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[l]);
                    triplet.add(nums[r]);
                    result.add(triplet);
                    l += 1;
                    while (l < r && nums[l - 1] == nums[l]) {
                        l += 1;
                    }
                }
            
            }
        }
        return result;
    }
}
