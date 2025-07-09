// Kadane's Algorithm
//Steps -
//1. calculate sum, if sum <0, then sum = 0
//2. compare maxSum and currentSum

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int subArrayCount = 0;
        int maxCount = 0;
        
        for (int i=0;i<arr.length;i++) {
            subArrayCount += arr[i];
            if (subArrayCount>maxCount) {
                maxCount = subArrayCount;
            }
        }
        
        System.out.println("-->"+maxCount);
    }
}
