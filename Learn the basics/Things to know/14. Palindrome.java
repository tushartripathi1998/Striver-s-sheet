class Solution {
    public boolean isPalindrome(int n) {
        String[] series = String.valueOf(n).split("");
        int len = series.length;
        for (int i=0; i<len; i++) {
            if (!series[i].equals(series[len-i-1])) {
                return false;
            }
        }
        return true;
    }
}
