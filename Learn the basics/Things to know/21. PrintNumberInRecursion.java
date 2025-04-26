// Input: n = 10
// Output: 1 2 3 4 5 6 7 8 9 10

class Solution {

    public void printNos(int n) {
        printNoInSequence(1, n);
    }
    
    private void printNoInSequence(int current, int max) {
        System.out.print(current+" ");
        if (current<max) {
            printNoInSequence(current+1, max);
        }
    }
}
