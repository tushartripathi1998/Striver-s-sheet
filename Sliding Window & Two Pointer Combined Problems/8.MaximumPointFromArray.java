// Maximum point from cards

class Main {
    public static void main(String[] args) {
        int[] arr = {6,2,3,4,7,2,1,7,1};
        int k = 4;
        int firstPart = -1;
        int secPart = k;
        int maxSum = 0;
        int currentSum = 0;
        
        while (k>=0) {
            currentSum = 0;
            secPart = k-1;
            for (int i=0;i<=firstPart;i++) {
                currentSum += arr[i];
            }
            for (int j=0;j<=secPart;j++) {
                currentSum += arr[arr.length-1-j];
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            k--;
            firstPart++;
        }
        System.out.println("=>"+maxSum);
    }
}
