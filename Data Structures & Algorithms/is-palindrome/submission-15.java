public class Solution {
    public boolean isPalindrome(String s) {
        int front = 0;
        int back = s.length() - 1;

        while (front < back) {
            while (front < back && !alphaNum(s.charAt(front))) {
                front++;
            }
            while (back > front && !alphaNum(s.charAt(back))) {
                back--;
            }
            if (Character.toLowerCase(s.charAt(front)) != Character.toLowerCase(s.charAt(back))) {
                return false;
            }
            front++;
            back--;
        }
        return true;
    }

    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}