/*
Code for recurrsion in insertion sort
*/

public class Main {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        recursiveInsertionSort(arr,0);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
    public static void recursiveInsertionSort(int[] arr, int n){
        if (n < arr.length) {
            for(int i=n;i>0;i--){
                if(arr[i-1]>arr[i]) {
                    arr[i] = arr[i]+arr[i-1];
                    arr[i-1] = arr[i]-arr[i-1];
                    arr[i] = arr[i]-arr[i-1];
                }
            }
            recursiveInsertionSort(arr,n+1);
        }
    }
}
