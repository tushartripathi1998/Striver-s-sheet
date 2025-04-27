// Given a number n, return an array containing the first n Fibonacci numbers.
// Note: The first two numbers of the series are 0 and 1.

class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        // Your code here
        int[] arr = new int[n];
        arr[0] = 0;
        if (n==1) {
            return arr;
        } else if (n==2) {
            arr[1] = 1;
            return arr;
        } else {
            arr[1] = 1;
            return printFibonacciRecursion(arr, 2);
        }
    }
    
    public static int[] printFibonacciRecursion(int[] arr, int index){
        if (index<arr.length){
            arr[index] = arr[index-1]+arr[index-2];
            return printFibonacciRecursion(arr, index+1);
        } else {
            return arr;
        }
    }
}
