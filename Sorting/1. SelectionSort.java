// Select minimum, and move it to left node, do this iteratively

class Solution {
    void selectionSort(int[] arr) {
        // code here
        int minNum = 0;
        int n = arr.length;
        for (int i=0;i<n-1;i++) {
            minNum = i;
            for (int j=i; j<n;j++) {
                
                if (arr[j]<arr[minNum]) {
                    minNum = j;
                }
                
            }
            
            if (minNum != i) {
                arr[i] = arr[minNum] + arr[i];
                arr[minNum] = arr[i]-arr[minNum];
                arr[i] = arr[i]-arr[minNum];
            }
            
            
        }
    }
}
