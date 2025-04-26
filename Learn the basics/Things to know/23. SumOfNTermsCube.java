// Input: n = 5
// Output: 225
// Explanation: 13 + 23 + 33 + 43 + 53 = 225

class Solution {
    int sumOfSeries(int n) {
        // code here
        int count = 0;
        int data = printCubeOfN(n, count);
        return data;
    }
    
    int printCubeOfN(int n, int count){
        if(n>0) {
            count = count + (int)Math.pow(n, 3);
            return printCubeOfN(n-1, count);
        }
        return count;
    }
}
