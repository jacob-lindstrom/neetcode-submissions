public class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        result = new ArrayList<List<Integer>>();
        List<Integer> curr = new ArrayList();
        backtrack(nums, target, curr, 0);
        return result;
    }

    public void backtrack(int[] nums, int target, List<Integer> curr, int index) {
        if (target == 0) {
            result.add(new ArrayList(curr));
            return;
        }
        if (target < 0 || index >= nums.length) {
            return;
        }

        curr.add(nums[index]);
        backtrack(nums, target - nums[index], curr, index);
        curr.remove(curr.size() - 1);
        backtrack(nums, target, curr, index + 1);
    }
}