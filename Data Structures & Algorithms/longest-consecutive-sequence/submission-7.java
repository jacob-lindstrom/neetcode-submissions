class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 0;
        Set<Integer> vals = new HashSet<>();
        for (int num : nums){
            vals.add(num);
        }

        int longest = 0;
        for (int num : nums){
            int streak = 0;
            if (!vals.contains(num - 1)){
                int curr = num;
                while (vals.contains(curr)){
                    streak++;
                    curr++;
                }
                longest = Math.max(longest, streak);
            }
        }
        return longest;
    }
}
