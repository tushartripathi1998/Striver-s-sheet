class Main {
    public static void main(String[] args) {
        int largestNum = 0, secNumber = 0;
        int[] arr = {12,4,33,1,44,5,7};
        
        for (int i=0;i<arr.length;i++){
            if (arr[i]>largestNum) {
                secNumber = largestNum;
                largestNum = arr[i];
            }
        }
        System.out.println("Largest number is : "+secNumber);
    }
}
