class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        result = new ArrayList<List<Integer>>();
        List<Integer> curr = new ArrayList<>();
        backtrack(nums, curr, target, 0);
        return result;
    }

    private void backtrack(int[] nums, List<Integer> curr, int target, int index){
        if (target == 0){
            result.add(new ArrayList(curr));
            return;
        }
        if(target < 0 || index >= nums.length){
            return;
        }

        curr.add(nums[index]);
        backtrack(nums, curr, target - nums[index], index);
        curr.remove(curr.size() - 1);
        backtrack(nums, curr, target, index + 1);
    }
}
