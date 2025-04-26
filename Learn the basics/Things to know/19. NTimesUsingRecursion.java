// Print numbers from 1 to n without the help of loops. 
// You only need to complete the function printNos() that takes n as a parameter and prints the number from 1 to n recursively.

class Solution {

    public void printNos(int n) {
        printNoInSequence(1, n);
    }
    
    private void printNoInSequence(int current, int max) {
        System.out.print(current);
        if (current<max) {
            printNoInSequence(current+1, max);
        }
    }
}
