class Main {
    public static void main(String[] args) {
        int[] arr = {2,5,7,4,1};
        swap(arr, 0, arr.length-1);
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
    
    public static void swap(int[] arr, int l, int r) {
        if (l<r) {
            arr[l] += arr[r];
            arr[r] = arr[l]-arr[r];
            arr[l] = arr[l]-arr[r];
            swap(arr, l+1, r-1);
        }
    }
}
