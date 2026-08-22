class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack<>();
        Map<Character, Character> paren = new HashMap<>();
        paren.put(')', '(');
        paren.put('}', '{');
        paren.put(']', '[');
        for (char c : s.toCharArray()){
            if (paren.containsKey(c)){
                if (!stack.isEmpty() && stack.peek() == paren.get(c)){
                    stack.pop();
                }
                else {return false;}
            }
            else{
                stack.push(c);
            }

        }
        return stack.isEmpty();
    }
}
