// Input:
// x = 1
// Output:
// 2147483648 
// Explanation:
// Binary of 1 in 32 bits representation-
// 00000000000000000000000000000001
// Reversing the binary form we get, 
// 10000000000000000000000000000000,
// whose decimal value is 2147483648.

class Solution {
    static Long reversedBits(Long x) {
        // code here
        StringBuilder binaryStr = new StringBuilder(Long.toBinaryString(x));
        StringBuilder sb = new StringBuilder(binaryStr.reverse().toString());
        int strLen = sb.length();
        for (int i=0; i<32-strLen; i++) {
            sb.append("0");
        }
        return Long.parseLong(sb.toString(), 2);
    }
};
