public class Solution {
    public int characterReplacement(String s, int k) {
        int result = 0;
        HashSet<Character> seen = new HashSet<>();
        for (char c : s.toCharArray()) {
            seen.add(c);
        }

        for (char c : seen) {
            int count = 0, left = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    count++;
                }

                while ((i - left + 1) - count > k) {
                    if (s.charAt(left) == c) {
                        count--;
                    }
                    left++;
                }

                result = Math.max(result, i - left + 1);
            }
        }
        return result;
    }
}