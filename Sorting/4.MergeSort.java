// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
      int[] arr = {54,13,22,54,54,7,7};
    //first time call
    merge(arr, 0, arr.length-1);
   
    for (int i=0;i<arr.length;i++) {
        System.out.println("--=>"+arr[i]);
    }
   
    }
   
    public static void merge(int[] arr, int start, int end) {

        if (start<end) {
           
           // System.out.println("start : "+start+", end"+end);
            int mid = (start+end-1)/2;
           
            merge(arr, start, mid);
            merge(arr, mid+1, end);
            mergeSort(arr, start, mid, end);
       
        }
    }
   
    public static void mergeSort(int[] arr, int start,int mid, int end){
        System.out.println("start : "+start+","+"mid : "+mid+ " end"+end);
        for (int i=start;i<=end;i++) {
            System.out.println("--=>"+arr[i]);
        }
        int[] temp = new int[end-start+1];
        int i=start; // i=0
        int j=((end-start+1)/2)+start; //j =1
        int runningIndex = 0;
       
        for(int k=0;k<=end;k++) {
            if (i<=mid && j<=end) {
                    System.out.println("arr[i]<arr[j]"+arr[i]+":"+arr[j]);
                if (arr[i]<arr[j]) {
                    temp[k] = arr[i];
                    i++;
                } else {
                    temp[k] = arr[j];
                    j++;
                }
                runningIndex=k;
            }
        }
       
        runningIndex++;
       
        for (int l=runningIndex;l<temp.length;l++) {
            if (i<=mid) {
                temp[l] = arr[i];
                i++;
            }
        }
       
        for (int r=runningIndex;r<temp.length;r++) {
            if (j<=end) {
                temp[r] = arr[j];
                j++;
            }
        }
       
        int tempIndex = 0;
        for (int s=start;s<=end;s++) {
            arr[s] = temp[tempIndex];
            tempIndex++;
        }
       
       for (int q=0;q<arr.length;q++) {
        System.out.println("After sort"+arr[q]);
        }
    }
 
   
}
