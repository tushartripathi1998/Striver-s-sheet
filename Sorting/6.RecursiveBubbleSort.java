/*
Code for recurrsion in bubble sort.
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        recMergeSort(arr,0);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
    public static void recMergeSort(int[] arr, int count){
        if (count<arr.length) {
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]) {
                    arr[i] = arr[i]+arr[i+1];
                    arr[i+1] = arr[i]-arr[i+1];
                    arr[i] = arr[i]-arr[i+1];
                }
            }
            recMergeSort(arr,count+1);
        }
    }
}
