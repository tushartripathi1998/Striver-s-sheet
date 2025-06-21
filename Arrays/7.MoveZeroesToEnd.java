// Move zeroes to end

class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,0,4,3,0,5,0};
        int runningIndex=0;
        int i=0;
        int temp=0;
        while(i<arr.length) {
            if(arr[i]!=0) {
                temp = arr[i];
                arr[i] = arr[runningIndex];
                arr[runningIndex] = temp;
                runningIndex++;
            }
            i++;
        }
        
        for (int k=0;k<arr.length;k++) {
            System.out.println("->"+arr[k]);
        }
    }
}
