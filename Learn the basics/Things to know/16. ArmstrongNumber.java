// Input: n = 153
// Output: true
// Explanation: 153 is an Armstrong number since 13 + 53 + 33 = 153. 

class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int product = 0;
        String[] numbersExploded = String.valueOf(n).split("");
        for (int i=0;i<numbersExploded.length;i++) {
            int b = Integer.valueOf(numbersExploded[i]);
            product = product + (int)Math.pow(b, 3);
        }
        if (product == n) {
            return true;
        } else {
            return false;
        }
    }
}
