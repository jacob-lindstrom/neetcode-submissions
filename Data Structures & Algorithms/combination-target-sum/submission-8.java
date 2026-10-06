class Solution {
    public List<List<Integer>> result;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        result = new ArrayList<List<Integer>>();
        List<Integer> curr = new ArrayList<>();
        backtrack(curr, target, nums, 0);
        return result;
    }

    private void backtrack(List<Integer> curr, int target, int[] nums, int index){
        if (target == 0){
            result.add(new ArrayList(curr));
            return;
        }
        if (target < 0 || index >= nums.length){
            return;
        }
        curr.add(nums[index]);
        backtrack(curr, target - nums[index], nums, index);
        curr.remove(curr.size() - 1);
        backtrack(curr, target, nums, index + 1);
    }
}
