class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> seen = new HashMap<>();

        for (String s : strs){

            char[] sorted = s.toCharArray();
            Arrays.sort(sorted);
            String word = new String(sorted);
            seen.putIfAbsent(word, new ArrayList<>());
            seen.get(word).add(s);

        }

        return new ArrayList<>(seen.values());

    }
}
