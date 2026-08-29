class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < 0) {
                    left += 1;
                    while (left < right && nums[left - 1] == nums[left]) {
                        left += 1;
                    }
                }
                else if (sum > 0) {
                    right -= 1;
                    while (left < right && nums[right] == nums[right + 1]) {
                        right -= 1;
                    }
                }
                else {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);
                    result.add(triplet);
                    left += 1;
                    while (left < right && nums[left - 1] == nums[left]) {
                        left += 1;
                    }
                }
            
            }
        }
        return result;
    }
}
