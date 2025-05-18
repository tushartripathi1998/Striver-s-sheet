//Take out array from left and sort it making the group bigger and bigger. Numbers would keep on sorting from the left.

class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        int n = arr.length;
        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j>0; j--) {
            
                if (arr[j]<arr[j-1]) {
                    arr[j] = arr[j]+arr[j-1];
                    arr[j-1] = arr[j]-arr[j-1];
                    arr[j] = arr[j]-arr[j-1];
                }
            
            }
            
        }
    }
}
