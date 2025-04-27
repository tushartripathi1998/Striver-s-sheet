// You are given a string s. Your task is to determine if the string is a palindrome. 
// A string is considered a palindrome if it reads the same forwards and backwards.

class Solution {
    boolean isPalindrome(String s) {
        // code here
        return checkPalindrome(s, s.length()-1);
    }
    
    public boolean checkPalindrome(String s, int index) {
        if (index>=s.length()/2) {
            if (s.charAt(index) != s.charAt(s.length()-index-1)) {
                return false;
            } else {
                return checkPalindrome(s, index-1);
            }
        } else {
            return true;
        }
    }
};
