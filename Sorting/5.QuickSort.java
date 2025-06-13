//Quick sort code
//recursively calls the arrays twice

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = {44,75,23,43,55,12,64,77,33};
        quickSort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println("-->"+arr[i]);
        }
    }
    
    public static void quickSort(int[] arr, int start, int end){
        if(start<end){
        System.out.println("->"+start+":"+end);
        int[] arrList = new int[end-start+1];
        int[] rightArr = new int[arr.length];
        int left=0;
        int right=0;
        
        for(int i=start;i<end;i++){
            if(arr[i]<arr[end]){
                arrList[left] = arr[i];
                left++;
            } else {
                rightArr[right] = arr[i];
                right++;
            }
        }
        arrList[left] = arr[end];
       
        for(int j=0;j<right;j++){
            arrList[j+left+1] =
            rightArr[j];
        }
    
        int arrListIndex = 0;
    
        for(int j=start;j<=end;j++) {
            arr[j] = arrList[arrListIndex];
            arrListIndex++;
        }
        
        quickSort(arr, start, left+start-1);
        quickSort(arr, left+start+1, end-1);
        }
    }
}
