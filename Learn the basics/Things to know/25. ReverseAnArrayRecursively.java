// You are given an array of integers arr[]. 
// Your task is to reverse the given array recursively.

class Solution {
    public void reverseArray(int arr[]) {
        // code here
        arr = printReversedArray(arr, arr.length-1);
    }
    
    public int[] printReversedArray(int[] arr, int index){
        if (index>=arr.length/2){
            int startingVal = arr[index];
            int endingVal = arr[arr.length-index-1];
            startingVal = endingVal+startingVal;
            endingVal = startingVal - endingVal;
            startingVal = startingVal - endingVal;
            
            arr[index] = startingVal;
            arr[arr.length-index-1] = endingVal;
            
            return printReversedArray(arr, index-1);
        }
        return arr;
    }
}
