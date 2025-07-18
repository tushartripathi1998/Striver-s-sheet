// Next permutation
// Ste 1: Traverse from reverse, find the point where number decreases(say 'i')
// Step 2: Swap the decreased num found with the next largest from right subarray of 'i'
//Step 3 : Reverse numbers from 'i' to 'end'

class Main {
    public static void main(String[] args) {
        int[] arr = {2,1,5,4,3,0,0};
        int i = arr.length-2;
        //find the point where num starts to dec from ending
        while(i>-1) {
            if (arr[i]<arr[i+1]) {
                break;
            }
            --i;
        }
        int j = arr.length-1;
        //swap the found num with the cutoff number
        while (j>-1) {
            if (arr[j]>arr[i]) {
                //swap j and i th index
                arr[j] = arr[i]+arr[j];
                arr[i] = arr[j]-arr[i];
                arr[j] = arr[j]-arr[i];
                break;
            }
            --j;
        }
        i++;
        int n=0;
        //reverse numbers after i as all will be ascending , to make them descending, thus small
        while (i<arr.length && (i < arr.length-n-1)) {
            arr[i] = arr[i]+arr[arr.length-n-1];
            arr[arr.length-n-1] = arr[i]-arr[arr.length-n-1];
            arr[i] = arr[i]-arr[arr.length-n-1];
            i++;
            n++;
        }
        
        for (int k=0;k<arr.length;k++) {
            System.out.println("arr - "+arr[k]);
        }
        
    }
}
