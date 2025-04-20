// What do you do when you need to execute certain statements more than once? You put them in a loop. Loops are very powerful. The majority of coding questions need loops to work. You can't even input test cases without loops!

// Here, we will use for loop and check if the given number n is prime or not.

// Note:  A number is prime if it's divisible by itself and 1 only. Also, 1 is not prime.

class Solution {
    public static String isPrime(int n) {
        // code here
        if (n==1) {
            return "No";
        }
        if (n==2 || n==3) {
            return "Yes";
        }
        if (n%2==0 || n%3 ==0) {
            return "No";
        }
        for (int i=2;i<=Math.sqrt(n);i++) {
            if (n%i==0) {
                return "No";
            }
        }
        return "Yes";
    }
}
        
