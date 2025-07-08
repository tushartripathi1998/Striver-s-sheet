// Longest Subarray with Sum K

class Main {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 15;
        int cummulativeSum = 0;
        int currentCount = 0;
        int maxCount = 0;
        
        for (int i=0;i<arr.length;i++) {
            currentCount = 0;
            cummulativeSum = 0;
            for (int j=i;j<arr.length;j++) {
                cummulativeSum += arr[j];
                if (cummulativeSum == k) {
                    currentCount = j-i+1;
                    if (currentCount>maxCount) {
                        maxCount = currentCount;
                    }
                }
            }
        }
        System.out.println("max count is : "+maxCount);
    }
}
