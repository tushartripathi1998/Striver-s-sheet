// Given a positive integer n, 
// The task is to find the value of Σi F(i) where i is from 1 to n and function F(i) is defined as the sum of all divisors of i.

class Solution {
    public static long sumOfDivisors(long n) {
        // code here
        int count = 0;
        for(int i=1;i<=n;i++) {
            for(int j=1;j*j<=i;j++) {
                if (i%j == 0){
                    count = count+j;
                    if (j!=i/j) {
                        count = count+i/j;
                    }
                }
            }
        }
        return count;
    }
}
