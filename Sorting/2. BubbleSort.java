//Swap the adjecent ones if the left is larger than right. The array would keep on sorting from the right.

class Solution {
    // Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int arr[]) {
        // code here
        int n = arr.length;
        for (int i=0; i<n; i++) {
            
            for (int j=0; j<n-1-i; j++) {
            
                if (arr[j]>arr[j+1]) {
                    arr[j] = arr[j]+arr[j+1];
                    arr[j+1] = arr[j]-arr[j+1];
                    arr[j] = arr[j]-arr[j+1];
                }
            
            }
            
        }
        
    }
}
